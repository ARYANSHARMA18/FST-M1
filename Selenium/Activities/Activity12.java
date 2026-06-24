package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity12 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		
		driver.get("https://training-support.net/webelements/drag-drop");
		
		System.out.println("Title is: " + driver.getTitle());
	
		WebElement ball = driver.findElement(By.id("ball"));
		WebElement zone1 = driver.findElement(By.id("dropzone1"));
		WebElement zone2 = driver.findElement(By.id("dropzone2"));
		
		builder.dragAndDrop(ball, zone1).pause(1000).build().perform();	
		
		if(driver.findElement(By.xpath("//div[@id='dropzone1']/span")).getText().equals("Dropped!")) {
			System.out.println("Ball dropped to zone 1");
		}
		
		builder.dragAndDrop(ball, zone2).pause(1000).build().perform();	
		
		if(driver.findElement(By.xpath("//div[@id='dropzone2']/span")).getText().equals("Dropped!")) {
			System.out.println("Ball dropped to zone 2");
		}
		
		
		driver.quit();
	}
}