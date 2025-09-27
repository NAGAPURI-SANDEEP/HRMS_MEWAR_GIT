package PAGES;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class Config_Branch extends Base_Class {
	
	@Test
	
	public static void add_branches() throws InterruptedException {


		Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div/div[2]/div/div[8]/div/div/a/div/div/span")).click();
               
        driver.findElement(By.xpath("(//div[@id='rc-tabs-1-tab-branches'])[1]")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@id=\"rc-tabs-1-panel-branches\"]/div/div[1]/div[2]/div/div[3]/button/span")).click();
        
        driver.findElement(By.xpath("//*[@id=\"rc_select_2\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"7\"]/div")).click();
        
        driver.findElement(By.xpath("//input[@id='genericForm_name']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@id='genericForm_shortCode']")).sendKeys("T1");
        driver.findElement(By.xpath("//textarea[@id='genericForm_address']")).sendKeys("Test");      
        
        driver.findElement(By.xpath("//*[@id=\"genericForm\"]/footer/div/button[1]")).click();
        
	
	}

}