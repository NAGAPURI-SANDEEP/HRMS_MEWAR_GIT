package PAGES;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class Config_Employee_Type extends Base_Class {
	
	@Test
	
	public static void add_companies() throws InterruptedException {


		Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div/div[2]/div/div[8]/div/div/a/div/div/span")).click();
               
        for(int i=0;i<=8;i++) {
        	driver.findElement(By.xpath("//*[@id=\"bodyWrapper\"]/div/div/div[1]/div[3]/div/button[2]")).click();
        }
        Thread.sleep(1000);
        
        driver.findElement(By.cssSelector("#rc-tabs-1-tab-employee-type ")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.cssSelector("#rc-tabs-1-panel-employee-type > div > div._mainHeader_1i6c4_6 > div._headerItems_1i6c4_24._large_1i6c4_45 > div > div:nth-child(3) > button > span")).click();
        
        driver.findElement(By.xpath("//input[@id='genericForm_name']")).sendKeys("Test");
        
        driver.findElement(By.xpath("//textarea[@id='genericForm_description']")).sendKeys("Test");
        
        //driver.findElement(By.xpath("//div[@class='ant-drawer-body']//button[1]//*[name()='svg']")).click();
	}
}
