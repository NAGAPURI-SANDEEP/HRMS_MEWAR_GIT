package PAGES;

import java.net.http.WebSocket;
import java.nio.channels.SelectableChannel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class Attendance_add_leave extends Base_Class {
	
	@Test
	public void add_Leave() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div/div[3]/div/div/a/div/div")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"bodyWrapper\"]/div/div/div[1]/div[1]/div/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"bodyWrapper\"]/div/div/div[1]/div[1]/div/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/button[1]/span[1]")).click();
		
		WebElement select_branch= driver.findElement(By.id("register_branchId"));
		select_branch.click();
		select_branch.sendKeys("Plastiweave Industries LLP, Unit - I, Kaladwas	");
		select_branch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement select_employee_type =driver.findElement(By.id("rc_select_10"));
		select_employee_type.click();
		select_employee_type.sendKeys("Production staff");
		select_employee_type.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement select_employee= driver.findElement(By.xpath("//form/section/div[2]/div[1]/div/div/div[2]/div/div/div/div/div/span/span[1]/input"));
		select_employee.click();
		select_employee.sendKeys("Naresh");
		select_employee.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);

		WebElement select_leave_type = driver.findElement(By.xpath("//form/section/div[2]/div[2]/div/div/div[2]/div/div/div/div/span/span[1]/input"));
		select_leave_type.click();
		select_leave_type.sendKeys("Paid Leave");
		select_leave_type.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		
		WebElement select_start_date = driver.findElement(By.id("register_startDate"));
		select_start_date.click();
		select_start_date.sendKeys("19-Aug-2025");
		select_start_date.sendKeys(Keys.ENTER);
		
		
		WebElement select_end_date = driver.findElement(By.id("register_endDate"));
		select_end_date.click();
		select_end_date.sendKeys("20-Aug-2025");
		select_end_date.sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.id("register_reason")).sendKeys("SICK LEAVE FOR THE ABOVE DATES");
		
		driver.findElement(By.xpath("//*[@id=\"register\"]/footer/div/button[1]/span")).click();	
		
		
		

		

		

		
			

		
		
		Thread.sleep(8000);
		driver.close();
	}

}
