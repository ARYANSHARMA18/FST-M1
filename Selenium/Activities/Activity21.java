package examples;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity21 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://training-support.net/webelements/tabs");
		
		System.out.println("Title is: " + driver.getTitle());
		
		System.out.println("Current window handle is: " + driver.getWindowHandle());
		
		driver.findElement(By.xpath("//button[contains(text(),'Open A New Tab')]")).click();
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		Set<String> handles = driver.getWindowHandles();	
		
		System.out.println("Window handles present: " + handles);
		
		for(String handle : handles) {		
			driver.switchTo().window(handle);
		}
		
		WebElement newTabBtn = driver.findElement(By.xpath("//button[contains(text(),'Open Another One')]"));
		
		wait.until(ExpectedConditions.elementToBeClickable(newTabBtn));
		
		System.out.println("Current window handle is: " + driver.getWindowHandle());
		System.out.println("New Page Title is: " + driver.getTitle());
        System.out.println("New Page message is: " + driver.findElement(By.cssSelector("h2.mt-5")).getText());
        
        newTabBtn.click();
        
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));

        handles = driver.getWindowHandles();	
		
		System.out.println("Window handles present: " + handles);
		
		for(String handle : handles) {		
			driver.switchTo().window(handle);
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Open Another One')]")));
		
		System.out.println("Current window handle is: " + driver.getWindowHandle());
		System.out.println("New Page Title is: " + driver.getTitle());
        System.out.println("New Page message is: " + driver.findElement(By.cssSelector("h2.mt-5")).getText());

		driver.quit();
	}
}
