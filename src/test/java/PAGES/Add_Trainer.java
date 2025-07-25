package PAGES;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class Add_Trainer extends Base_Class {

	@Test
	public static void add_trainer() throws InterruptedException {
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div[2]/div/div[6]/div/div/a/div/div/span")).click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[1]/div[1]/div/div[2]/div"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[1]/div[2]/div/div[3]/button/span/svg"))
				.click();
		
		
		driver.findElement(By.cssSelector("span[aria-describedby=':r5c:']")).click();
	}

}