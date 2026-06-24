package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/dynamic-controls");
		
		System.out.println("Title of the page is: " + driver.getTitle());
		
		WebElement textbox = driver.findElement(By.xpath("//input[@id='textInput']"));
		
		System.out.println("Checkbox is selected: " + textbox.isEnabled());
		
		driver.findElement(By.id("textInputButton")).click();	
		
		System.out.println("After Clicking --> Checkbox is selected : " + textbox.isEnabled());
		
		textbox.sendKeys("Enabled");
		System.out.println(textbox.getDomProperty("value"));
		
		driver.quit();
	}
}
