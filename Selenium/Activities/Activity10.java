package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		
		driver.get("https://training-support.net/webelements/mouse-events");
		
		System.out.println("Title is: " + driver.getTitle());
		
		WebElement cargoLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
		WebElement cargoToml = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
		WebElement src = driver.findElement(By.xpath("//h1[text()='src']"));
		WebElement target = driver.findElement(By.xpath("//h1[text()='target']"));

		builder.click(cargoLock)
		.pause(1000)
		.moveToElement(cargoToml)
		.click()
		.pause(1000)
		.build()
		.perform();
		
		WebElement confirmationText = driver.findElement(By.id("result"));
		
		System.out.println("Confirmation Text: " + confirmationText.getText());

		
		builder.doubleClick(src)
		.pause(1000)
		.contextClick(target)
		.pause(1000)
		.release()
		.build()
		.perform();
		
		WebElement openButton = driver.findElement(By.xpath("//span[text()='Open']"));
		
		builder.click(openButton).pause(1000).build().perform();
		
		
		System.out.println("Confirmation Text: " + confirmationText.getText());
		
		driver.quit();
	}
}