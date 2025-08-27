package PAGES;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class Config_Grades extends Base_Class {
	
	@Test
	
	public static void add_Grades() throws InterruptedException {


        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div/div[8]/div/div/a/div/div")).click();
        
        driver.findElement(By.xpath("//div[@id='rc-tabs-1-tab-grades']")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@id=\"rc-tabs-1-panel-grades\"]/div/div[1]/div[2]/div/div[3]/button/span")).click();
        
        driver.findElement(By.xpath("//input[@id='genericForm_name']")).sendKeys("Test");
        
        driver.findElement(By.xpath("//input[@id='genericForm_minSalary']")).sendKeys("10000");
        
        driver.findElement(By.xpath("//input[@id='genericForm_maxSalary']")).sendKeys("20000");
        
        driver.findElement(By.xpath("//textarea[@id='genericForm_description']")).sendKeys("Test1");
        
        driver.findElement(By.xpath("//div[@class='ant-drawer-body']//button[1]")).click();
        
	
	}

}
