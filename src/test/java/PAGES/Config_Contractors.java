package PAGES;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class Config_Contractors  extends Base_Class {
	
	@Test
	
	public static void add_companies() throws InterruptedException {


		Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div/div[2]/div/div[8]/div/div/a/div/div/span")).click();
               
        driver.findElement(By.xpath("//*[@id=\"bodyWrapper\"]/div/div/div[1]/div[1]/div/div[12]")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@id=\"rc-tabs-1-panel-contractors\"]/div/div[1]/div[2]/div/div[3]/button/span")).click();
        
        //Dates for holiday
        
        driver.findElement(By.xpath("//input[@id='contractorForm_firmName']")).sendKeys("Test.inc_1");
         
        driver.findElement(By.xpath("//input[@id='contractorForm_ownerName']")).sendKeys("TEST_1");
        
        driver.findElement(By.xpath("//input[@id='contractorForm_mobileNumber']")).sendKeys("9358380888");
        
        driver.findElement(By.xpath("//input[@id='contractorForm_panNo']")).sendKeys("AFZPR7091K");
        
        driver.findElement(By.xpath("//input[@id='contractorForm_gst']")).click();
        
        driver.findElement(By.xpath("//div[contains(text(),'Yes')]")).click();
        
        driver.findElement(By.xpath("//input[@id='contractorForm_gstIn']")).sendKeys("987623481234");
        
        driver.findElement(By.xpath("//textarea[@id='contractorForm_address']")).sendKeys("Test1");
        
        driver.findElement(By.xpath("//*[@id=\"contractorForm\"]/footer/div/button[1]")).click();
	}
}
