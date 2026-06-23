package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/login-form");
		
		System.out.println("Title of page is: " + driver.getTitle());
		
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("admin");
		
		WebElement password= driver.findElement(By.name("password"));
		password.sendKeys("password");
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Submit']"));
		button.click();

		driver.quit();
	}
}
