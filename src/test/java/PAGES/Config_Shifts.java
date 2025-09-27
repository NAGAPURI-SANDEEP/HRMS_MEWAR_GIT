package PAGES;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class Config_Shifts extends Base_Class {
	
	@Test
	
	public static void add_Shifts() throws InterruptedException {


		Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div/div[2]/div/div[8]/div/div/a/div/div/span")).click();
                
        driver.findElement(By.xpath("//*[@id=\"rc-tabs-1-tab-shifts\"]")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@id=\"rc-tabs-1-panel-shifts\"]/div/div[1]/div[2]/div/div[3]/button/span")).click();
        
        //Dates for holiday
        driver.findElement(By.xpath("//input[@id='register_name']")).sendKeys("Test15");
         
        driver.findElement(By.xpath("//input[@id='register_shortCode']")).sendKeys("TEST27");
        
        driver.findElement(By.xpath("//input[@value='1']")).click();
        
        driver.findElement(By.xpath("//input[@id='register_startTime']")).sendKeys("11:00");
        driver.findElement(By.xpath("//input[@id='register_endTime']")).sendKeys("16:00");
        
        driver.findElement(By.xpath("//input[@id='register_breakStartTime']")).sendKeys("12:00");
        driver.findElement(By.xpath("//input[@id='register_breakEndTime']")).sendKeys("12:45");
         
        driver.findElement(By.xpath("//*[@id=\"register\"]/footer/div/button[1]")).click();
        
	
	}

}