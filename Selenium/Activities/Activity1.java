package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/");
		
		System.out.println("Title of page is: " + driver.getTitle());
		
		WebElement element = driver.findElement(By.linkText("About Us"));
		
		element.click();
		
		System.out.println("Title of New page is: " + driver.getTitle());
				
		driver.quit();
	}
}
