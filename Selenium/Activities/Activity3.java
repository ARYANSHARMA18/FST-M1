package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/login-form");
		
		System.out.println("Title of page is: " + driver.getTitle());
		
		WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("admin");
		
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("password");
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Submit']"));
		button.click();
		
		String message = driver.findElement(By.xpath("//h1[contains(text(),'Success')]")).getText();
		
		System.out.println("Message is : " + message);

		driver.quit();
	}
}
