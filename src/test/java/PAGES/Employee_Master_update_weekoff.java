package PAGES;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class Employee_Master_update_weekoff extends Base_Class {
	
	@Test
	public static void updateWeekOff() throws InterruptedException {
		
		
		
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div/div[2]/div/div/a/div/div/span")).click();

		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div/div/div/div[1]/div[1]/div/div[2]/div")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/div[2]/button")).click();
		Thread.sleep(3000);
		
		WebElement update_weekoff=	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/div[2]/button"));
		update_weekoff.click();
		Thread.sleep(2000);
		update_weekoff.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		
		
		WebElement modal = driver.findElement(By.xpath("//div[contains(@class,'ant-modal')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].focus();", modal);

		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[3]/div[1]/div")).click();
		
		
		
		
		
		
		
		
		
		driver.close();
		
		
		
	}

}
