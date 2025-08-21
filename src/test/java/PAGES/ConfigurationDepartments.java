package PAGES;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class ConfigurationDepartments extends Base_Class {
	
	@Test
	
	public static void add_Departments() throws InterruptedException {


        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div/div[8]/div/div/a/div/div")).click();
        
        driver.findElement(By.xpath("//*[@id=\"rc-tabs-1-tab-departments\"]")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@id=\"rc-tabs-1-panel-departments\"]/div/div[1]/div[2]/div/div[3]/button/span")).click();
        
        driver.findElement(By.xpath("//input[@id='departmentForm_name']")).sendKeys("Test");
        
        driver.findElement(By.xpath("//textarea[@id='departmentForm_description']")).sendKeys("Test");
        
        driver.findElement(By.xpath("//span[normalize-space()='Add Sub-Department']")).click();
        
        driver.findElement(By.xpath("(//input[@id='departmentForm_subDepartments_0_name'])[1]")).sendKeys("Test1");
        
        driver.findElement(By.xpath("//*[@id=\"departmentForm\"]/footer/div/button[1]")).click();
        
	
	}

}
