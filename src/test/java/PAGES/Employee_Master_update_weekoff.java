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
		
		
				// git init
				//$ git config --global user.name "sandeep"
				//$ git confog --global user.email "nagapurisandeep1996@gmail.com"
			
				//	$ git status
				//$ git add -A
				//$ git status
				//$ git commit -m "first commit"
				
				// git config --global user.email "you@example.com"
				  //git config --global user.name "Your Name"
				
				//$ git remote add origin "git@github.com:NAGAPURI-SANDEEP/HRMS_MEWAR_GIT.git"
				//$ git remote -v
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div[2]/div/div[2]/div/div/a/div/div/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div/div/div/div[1]/div[1]/div/div[2]/div")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/button[2]/span/span")).click();
		Thread.sleep(2000);
		
		WebElement update_weekoff=	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/button[2]"));
		update_weekoff.click();
		Thread.sleep(2000);
		update_weekoff.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		
		
		WebElement modal = driver.findElement(By.xpath("//div[contains(@class,'ant-modal')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].focus();", modal);

		Thread.sleep(2000);
		
		
		WebElement datepick=  driver.findElement(By.xpath("//*[@id=\"placeholder\"]"));
		datepick.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[3]/div[1]/div/div")).click();

		
		
		
		
		
		
		
		driver.close();
		
		
		
	}

}
