package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/target-practice");
		
		System.out.println("Title of the page is: " + driver.getTitle());
		
		String heading3 = driver.findElement(By.xpath("//h3[contains(text(),'#3')]")).getText();
		
		System.out.println("Text of the Heading3 is: " + heading3);
		
		String heading5 = driver.findElement(By.xpath("//h5[contains(text(),'#5')]")).getCssValue("color");

		System.out.println("Color of the Heading5 is: " + heading5);
		
		String purpleButtonClasses = driver.findElement(By.className("bg-purple-200")).getDomAttribute("class");
		
		System.out.println("Class of purple button are : " + purpleButtonClasses);
		
		String slateButtonText = driver.findElement(By.className("bg-slate-200")).getText();
		
		System.out.println("Text inside Slate button is : " + slateButtonText);
	
		driver.quit();
	}


}
