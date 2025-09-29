package PAGES;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import UTILS.Base_Class;

public class Attendance_add_OD extends Base_Class {
	
	@Test
	public void add_Leave() throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div/div[2]/div/div[3]/div/div/a/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("rc-tabs-1-tab-outdoor-duties")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/div[4]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("register_branchId")).click();
		driver.findElement(By.id("register_branchId")).sendKeys("dabok");
		driver.findElement(By.id("register_branchId")).sendKeys(Keys.ENTER);
		
	Thread.sleep(2000);
	
	
	WebElement select_employee_Type= driver.findElement(By.xpath("//*[@id=\"register\"]/section/div[2]/div[1]/div/div/div[2]/div/div/div/div"));
	select_employee_Type.click();
	Thread.sleep(3000);
	select_employee_Type.sendKeys("staff");
	
	
		
		

			
		
		
		

		

		

		
			

		
		
		Thread.sleep(8000);
		driver.close();
	}

}
