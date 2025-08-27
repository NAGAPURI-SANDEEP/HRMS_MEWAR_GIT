package PAGES;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class Config_Policies extends Base_Class {
	
	@Test
	
	public static void add_companies() throws InterruptedException {


        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div/div[8]/div/div/a/div/div")).click();
        
        for(int i=0;i<=5;i++) {
        	driver.findElement(By.xpath("//*[@id=\"bodyWrapper\"]/div/div/div[1]/div[3]/div/button[2]")).click();
        }
        Thread.sleep(1000);
        
        driver.findElement(By.id("rc-tabs-1-tab-policies")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//div[@class='ant-popover-open']//span[@aria-label='more']//*[name()='svg']")).click();
        
        driver.findElement(By.xpath("//span[normalize-space()='Configure']")).click();
                 
	}
}
