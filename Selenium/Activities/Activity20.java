package examples;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity20 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://training-support.net/webelements/alerts");
		
		System.out.println("Title is: " + driver.getTitle());
		
		driver.findElement(By.id("prompt")).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println("Text in alert is: " + alert.getText());
		
		alert.sendKeys("Awesome!");
		Thread.sleep(2000);
	
		alert.accept();
		
		System.out.println("Confirmation Text : " + driver.findElement(By.id("result")).getText());
				
		driver.quit();
	}
}