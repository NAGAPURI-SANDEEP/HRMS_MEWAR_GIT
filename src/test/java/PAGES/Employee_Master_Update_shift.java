package PAGES;


import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


import org.testng.annotations.Test;


import UTILS.Base_Class;

public class Employee_Master_Update_shift extends Base_Class{
	
	@Test
	public static void updateShift() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div/div[2]/div/div/a/div/div/span")).click();

		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div/div/div/div[1]/div[1]/div/div[2]/div")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/div[2]/button")).click();
		Thread.sleep(2000);
		WebElement update_shift=	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/div[2]/button"));
		update_shift.click();
		Thread.sleep(2000);
		update_shift.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	

		Thread.sleep(2000);

		WebElement select_shift= driver.findElement(By.id("rc_select_5"));
		select_shift.click();
		Thread.sleep(2000);
		select_shift.sendKeys("wrk20");
		//driver.findElement(By.xpath("//*[@title='S2006 (20:00 - 06:00)']"));
		select_shift.sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		select_shift.sendKeys("fem09");
		Thread.sleep(2000);

		select_shift.sendKeys(Keys.ARROW_DOWN);
		select_shift.sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[2]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'ant-btn css-pjilya ant-btn-primary ant-btn-color-primary ant-btn-variant-solid flex items-center gap-2 px-6 py-2 bg-blue-600 hover:bg-blue-700 transition-all')]")).click();
	
		Thread.sleep(10000);
		driver.close();
	
	


	
	
	



	
	

		


	}

}
