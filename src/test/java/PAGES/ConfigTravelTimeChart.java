package PAGES;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class ConfigTravelTimeChart extends Base_Class {
	
	@Test
	
	public static void add_companies() throws InterruptedException {


        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div/div[8]/div/div/a/div/div")).click();
        
        for(int i=0;i<=15;i++) {
        	driver.findElement(By.xpath("//*[@id=\"bodyWrapper\"]/div/div/div[1]/div[3]/div/button[2]")).click();
        }
        Thread.sleep(1000);
        
        driver.findElement(By.cssSelector("#rc-tabs-1-tab-travel-time-chart")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@id=\"rc-tabs-1-panel-travel-time-chart\"]/div/div[1]/div[2]/div/div[3]/button")).click();
        
        driver.findElement(By.xpath("(//div[@class='ant-select-selection-overflow'])[1]")).click();
        
        driver.findElement(By.xpath("//div[contains(text(),'MGHO')]")).click();
        
        driver.findElement(By.xpath("(//div[@class='ant-select-selection-overflow'])[2]")).click();
        
        driver.findElement(By.xpath("(//div[contains(text(),'Mewar Polytex Limited, Unit - II, Nai')])[1]")).click();
        
        driver.findElement(By.xpath("(//input[@id='travelTimeChartForm_rows_0_time'])[1]")).sendKeys("20");
        
        driver.findElement(By.xpath("//*[@id=\"travelTimeChartForm\"]/footer/div/button[1]")).click();
        }

}
