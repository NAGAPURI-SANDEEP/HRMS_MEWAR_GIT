package PAGES;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class ConfigInvestmentType extends Base_Class {
	
	@Test
	
	public static void add_companies() throws InterruptedException {


        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div/div[8]/div/div/a/div/div")).click();
        
        for(int i=0;i<=15;i++) {
        	driver.findElement(By.xpath("//*[@id=\"bodyWrapper\"]/div/div/div[1]/div[3]/div/button[2]")).click();
        }
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@id=\"rc-tabs-1-tab-investment-doc-type\"]")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@id=\"rc-tabs-1-panel-investment-doc-type\"]/div/div[1]/div[2]/div/div[3]/button/span")).click();
        
        driver.findElement(By.xpath("//input[@id='investmentTypeForm_docTypeName']")).sendKeys("Test");
        
        driver.findElement(By.xpath("//input[@id='investmentTypeForm_minAmount']")).sendKeys("20000");
        
        driver.findElement(By.xpath("//input[@id='investmentTypeForm_maxAmount']")).sendKeys("30000");
        
        driver.findElement(By.xpath("//textarea[@id='investmentTypeForm_docTypeDescription']")).sendKeys("TEST");
        
        driver.findElement(By.xpath("//*[@id=\"investmentTypeForm\"]/footer/div/button[1]")).click();
        }
}
