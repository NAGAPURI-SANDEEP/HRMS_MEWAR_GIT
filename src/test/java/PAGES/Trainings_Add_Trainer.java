package PAGES;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class Trainings_Add_Trainer extends Base_Class {

	@Test
	public static void add_trainer() throws InterruptedException {
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div/div[7]/div/div/a/div")).click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[1]/div[1]/div/div[2]/div"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/div[3]/button"))
				.click();
		driver.findElement(By.id("register_trainerName")).sendKeys("TESTER");
		
		driver.findElement(By.xpath("//*[@id=\"register\"]/footer/div/button[1]")).click();
		
		
	}

}