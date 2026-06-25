package examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/selects");
		
		System.out.println("Title is: " + driver.getTitle());
		
		WebElement dropdown = driver.findElement(By.cssSelector("select.h-80"));
		
		Select select = new Select(dropdown);
		
		select.selectByContainsVisibleText("HTML");
				
		select.selectByIndex(4);
		select.selectByIndex(5);
		select.selectByIndex(6);
		
		select.selectByValue("nodejs");
		
		List<WebElement> options = select.getAllSelectedOptions();
		
		System.out.println("Selected options are: ");
		for(WebElement option : options) {
			System.out.println(option.getText());
		}
		
		select.deselectByIndex(5);
		
		options = select.getAllSelectedOptions();
		System.out.println("Selected options are: ");
		for(WebElement option : options) {
			System.out.println(option.getText());
		}
		
		driver.quit();
	}
}
