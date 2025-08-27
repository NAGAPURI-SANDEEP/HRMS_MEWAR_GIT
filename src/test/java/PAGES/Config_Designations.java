package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class Config_Designations extends Base_Class {
	
	@Test
	
	public static void add_Designations() throws InterruptedException {


        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div/div[8]/div/div/a/div/div")).click();
        
        driver.findElement(By.xpath("//*[@id=\"rc-tabs-1-tab-designations\"]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"rc-tabs-1-panel-designations\"]/div/div[1]/div[2]/div/div[3]/button/span")).click();
        
        driver.findElement(By.xpath("//input[@id='genericForm_name']")).sendKeys("Test");
        
        driver.findElement(By.xpath("//textarea[@id='genericForm_description']")).sendKeys("Test");
        
        driver.findElement(By.xpath("//div[@class='ant-drawer-body']//button[1]")).click();
        
	
	}
}
