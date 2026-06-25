package examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity14 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/tables");
		
		System.out.println("Title is: " + driver.getTitle());
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class,'table-auto')]/thead/tr/th"));
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'table-auto')]/tbody/tr"));
		
		System.out.println("No of the rows are: " + rows.size());
		System.out.println("No of the cols are: " + cols.size());
		
		System.out.println("Value in Book Name in the 5th row is: " + driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/tbody/tr[5]/td[2]")).getText());
		
		driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/thead/tr/th[5]")).click();
		
		System.out.println("Value in Book Name in the 5th row after sorting is: " + driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/tbody/tr[5]/td[2]")).getText());

		driver.quit();
	}

}
