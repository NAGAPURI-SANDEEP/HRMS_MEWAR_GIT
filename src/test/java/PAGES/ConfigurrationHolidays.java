package PAGES;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class ConfigurrationHolidays extends Base_Class {
	
	@Test
	
	public static void add_Holidays() throws InterruptedException {


        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div/div[8]/div/div/a/div/div")).click();
        
        driver.findElement(By.xpath("(//div[@id='rc-tabs-1-tab-holidays'])[1]")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@id=\"rc-tabs-1-panel-holidays\"]/div/div[1]/div[2]/div/div[3]/button/span")).click();
        
        //Dates for holiday
        driver.findElement(By.xpath("//input[@id='holidayForm_holidayDate']")).sendKeys("22-Jul-2025");
         
        driver.findElement(By.xpath("//input[@id='holidayForm_name']")).sendKeys("Test");
        
        driver.findElement(By.xpath("//div[@class='ant-select-selection-overflow']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@title='All']")).click();
        
        driver.findElement(By.xpath("//*[@id=\"holidayForm_description\"]")).sendKeys("Test");
        
        driver.findElement(By.xpath("//*[@id=\"holidayForm\"]/footer/div/button[1]")).click();
        
	
	}

}