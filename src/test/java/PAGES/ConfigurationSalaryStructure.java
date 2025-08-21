package PAGES;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class ConfigurationSalaryStructure extends Base_Class {
	
	@Test
	
	public static void add_Salarystructure() throws InterruptedException {


        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div/div[8]/div/div/a/div/div")).click();
        
        driver.findElement(By.xpath("(//div[@id='rc-tabs-1-tab-salary-structure'])[1]")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@id=\"rc-tabs-1-panel-salary-structure\"]/div/div[1]/div[2]/div/div[3]/button/span")).click();
        
        driver.findElement(By.xpath("//input[@id='salaryStructureForm_name']")).sendKeys("Test");
        
        driver.findElement(By.xpath("//input[@id='salaryStructureForm_fromRange']")).sendKeys("100");
        driver.findElement(By.xpath("//input[@id='salaryStructureForm_toRange']")).sendKeys("1000");
        driver.findElement(By.xpath("//span[normalize-space()='Add Range']")).click();
        Thread.sleep(200);
        driver.findElement(By.xpath("//input[@id='salaryStructureForm_fromRange']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@id='salaryStructureForm_toRange']")).sendKeys("50");
      
        
        driver.findElement(By.xpath("//*[@id=\"salaryStructureForm\"]/footer/div/button[1]")).click();
        
	
	}

}