package PAGES;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class Trainings_Add_Program extends Base_Class {
	
	@Test
	public static void add_program() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div/div[7]/div/div/a")).click();
		
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[1]/div[2]/div/div[3]/button/span")).click();
		
		driver.findElement(By.id("register_title")).sendKeys("Training Program TEST");
		driver.findElement(By.id("register_category")).click();
		driver.findElement(By.id("register_category")).sendKeys(Keys.DOWN);

		driver.findElement(By.id("register_category")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("register_description")).sendKeys("hello people this is for testing");
		
		driver.findElement(By.id("register_program_0_trainer")).click();
		driver.findElement(By.id("register_program_0_trainer")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("register_program_0_sessionDate")).sendKeys("29-Jul-2025");
		driver.findElement(By.id("register_program_0_sessionDate")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("register_program_0_startTime")).sendKeys("07:30");
		driver.findElement(By.id("register_program_0_startTime")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("register_program_0_endTime")).sendKeys("10:30");
		driver.findElement(By.id("register_program_0_endTime")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("register_program_0_location")).sendKeys("Udaipur");
		
		driver.findElement(By.xpath("//*[@id=\"register\"]/footer/div/button[1]/span")).click();
		
		
		
	}
	

}
