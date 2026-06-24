package examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Title of the page is: " + driver.getTitle());
		
				
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkbox']"));
		System.out.println("Is checkbox visible: " + checkbox.isDisplayed());
		
		WebElement toggleCheckbox = driver.findElement(By.xpath("//button[text()='Toggle Checkbox']"));
		
		toggleCheckbox.click();
	
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
		
		System.out.println("Is checkbox visible: " + checkbox.isDisplayed());
		
		toggleCheckbox.click();
		
		wait.until(ExpectedConditions.visibilityOf(checkbox)).click();
		
		System.out.println("Is checkbox selected: " + checkbox.isSelected());
		
		driver.quit();
	}
}
