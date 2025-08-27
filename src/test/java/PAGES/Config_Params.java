package PAGES;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class Config_Params extends Base_Class {
	
	@Test
	
	public static void add_configparams() throws InterruptedException {


        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div/div[8]/div/div/a/div/div")).click();
        
        driver.findElement(By.xpath("//div[@id='rc-tabs-1-tab-config-params']")).click();
        
        //Add button
        driver.findElement(By.xpath("//*[@id=\"rc-tabs-1-panel-config-params\"]/div/div[1]/div[2]/div/div[3]/button/span")).click();
        
        //name 
        driver.findElement(By.xpath("//input[@id='genericForm_name']")).sendKeys("Test");
        Thread.sleep(1000);
        
        //dropdown config group
//        driver.findElement(By.xpath("(//span[@class='ant-select-selection-search'])[3]")).sendKeys("Bank Name");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement input = wait.until(ExpectedConditions.elementToBeClickable(
        	    By.xpath("(//span[@class='ant-select-selection-search'])[3]/input")
        	));
        	input.sendKeys("Prefix");  // or your desired value
        	input.sendKeys(Keys.ENTER);

       
        
        
       
        //description
        driver.findElement(By.xpath("//textarea[@id='genericForm_description']")).sendKeys("Test");
        
        //add
        driver.findElement(By.xpath("//button[@class='ant-btn css-pjilya ant-btn-primary ant-btn-color-primary ant-btn-variant-solid btnDimensions']//span[contains(text(),'Add')]")).click();

	}

}
