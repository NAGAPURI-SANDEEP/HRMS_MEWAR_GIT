package PAGES;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class Add_Trainer extends Base_Class {
	
	@Test
	
	public static void add_Trainer() {
	


        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div/div[7]/div/div/a/div/div")).click();
        
//        Thread.sleep(2000);
//        driver.findElement(By.id("rc-tabs-3-tab-trainer\" aria-controls=\"rc-tabs-3-panel-trainer\" xpath=\"1")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement trainersTab = wait.until(
        	    ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Trainers']"))
        	);
        	trainersTab.click();
        
        	driver.findElement(By.xpath("(//span[contains(text(),'Add')])[2]")).click();
        	
        	driver.findElement(By.xpath("//input[@id='register_trainerName']")).sendKeys("Test");
        	
        	driver.findElement(By.xpath("//div[@class='ant-drawer-body']//button[1]")).click();

        
	}
}
