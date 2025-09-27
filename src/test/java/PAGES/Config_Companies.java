package PAGES;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class Config_Companies extends Base_Class {
	
	@Test
	
	public static void add_companies() throws InterruptedException {


		Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div/div[2]/div/div[8]/div/div/a/div/div/span")).click();
               
        driver.findElement(By.xpath("//*[@id=\"bodyWrapper\"]/div/div/div[1]/div[1]/div/div[11]")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@id=\"rc-tabs-1-panel-companies\"]/div/div[1]/div[2]/div/div[3]/button/span")).click();
        
        //Dates for holiday
        driver.findElement(By.xpath("//input[@id='companyForm_name']")).sendKeys("Test");
         
        driver.findElement(By.xpath("//input[@id='companyForm_mobileNumber']")).sendKeys("9358880888");
        
        driver.findElement(By.xpath("//input[@id='companyForm_emailId']")).sendKeys("Test@webanix.in");
        
        driver.findElement(By.xpath("//*[@id=\"companyForm_gstNo\"]")).sendKeys("08800");
        driver.findElement(By.xpath("//*[@id=\"companyForm_website\"]")).sendKeys("http://10.1.1.225:10000/dashboard/configurations?tab=companies");
        
        driver.findElement(By.xpath("//*[@id=\"companyForm_address\"]")).sendKeys("Test");
        driver.findElement(By.xpath("//*[@id=\"companyForm_description\"]")).sendKeys("Test");
         
        driver.findElement(By.xpath("//*[@id=\"companyForm\"]/footer/div/button[1]")).click();
        
	
	}

}
