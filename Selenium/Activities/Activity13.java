package examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/tables");
		
		System.out.println("Title is: " + driver.getTitle());
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class,'table-auto')]/thead/tr/th"));
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'table-auto')]/tbody/tr"));
		
		System.out.println("No of the rows are: " + rows.size());
		System.out.println("No of the cols are: " + cols.size());
		
		System.out.println("Value in 3rd row is: " +  driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/tbody/tr[3]")).getText());

		System.out.println("Value in 2nd row & 2nd column is: " + driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/tbody/tr[2]/td[2]")).getText());

		driver.quit();
	}
}


