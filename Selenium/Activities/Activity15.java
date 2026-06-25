package examples;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		
		System.out.println("Title is: " + driver.getTitle());
		
		WebElement inputName = driver.findElement(By.cssSelector("input[id^='full-name-']"));
		WebElement email = driver.findElement(By.cssSelector("input[id$='-email']"));
		WebElement date = driver.findElement(By.cssSelector("input[name*='-event-date-']"));
		WebElement addtionalInfo = driver.findElement(By.cssSelector("textarea[id*='-additional-details-']"));
		
		inputName.sendKeys("Selenium");
		email.sendKeys("selenium01@gmail.com");
		date.sendKeys("2026-01-07");
		addtionalInfo.sendKeys("Selenium Activity");
		
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
				
		String message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation"))).getText();
		System.out.println("Success msg: " + message);
		
		driver.quit();
	}
}
