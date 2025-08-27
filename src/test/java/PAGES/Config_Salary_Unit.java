package PAGES;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class Config_Salary_Unit extends Base_Class {
	
	@Test
	
	public static void add_Salaryunit() throws InterruptedException {


        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div/div[8]/div/div/a/div/div")).click();
        
        driver.findElement(By.xpath("(//div[@id='rc-tabs-1-tab-salaryUnits'])[1]")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@id=\"rc-tabs-1-panel-salaryUnits\"]/div/div[1]/div[2]/div/div[3]/button/span")).click();
        
        driver.findElement(By.xpath("//input[@id='genericForm_name']")).sendKeys("Test");
        
        driver.findElement(By.xpath("//*[@id=\"genericForm_description\"]")).sendKeys("Test");
        
      
        
        driver.findElement(By.xpath("//*[@id=\"genericForm\"]/footer/div/button[1]")).click();
        
	
	}

}

