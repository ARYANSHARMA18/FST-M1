package examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity22 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://training-support.net/webelements/popups");
		
		System.out.println("Title is: " + driver.getTitle());
		
		driver.findElement(By.id("launcher")).click();
		
        wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
		
		driver.findElement(By.xpath("//form[@id='signInForm']/input[1]")).sendKeys("admin");
		driver.findElement(By.xpath("//form[@id='signInForm']/input[2]")).sendKeys("password");
		driver.findElement(By.xpath("//form[@id='signInForm']/button")).click();
		
		System.out.println("Login message: " + driver.findElement(By.cssSelector("h2.mt-5")).getText());
		driver.quit();
	}
}
