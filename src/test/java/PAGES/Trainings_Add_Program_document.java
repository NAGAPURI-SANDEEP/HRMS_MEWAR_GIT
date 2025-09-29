package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class Trainings_Add_Program_document extends Base_Class {

	@Test
	public static void add_program_document() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div/div[7]/div/div/a")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[4]/td[6]/button"))
				.click();
		
		Thread.sleep(2000);

		
		driver.findElement(By.xpath(
				"/html/body/div[2]/div/ul/li[2]/span/div"))
				.click();
		
		Thread.sleep(2000);
		
		WebElement doc_type= driver.findElement(By.id("rc_select_1"));
		doc_type.click();
		doc_type.sendKeys("Training");
		doc_type.sendKeys(Keys.ENTER);

		
		WebElement select_file= driver.findElement(By.xpath("(//span[@class='inline-flex items-center !h-[35px] w-full px-4 py-2 border border-gray-300 rounded-md shadow-sm text-sm font-medium text-gray-700 bg-[#ffffff75] hover:bg-gray-50 cursor-pointer'])[1]"));
		select_file.click();
		
		// Find the actual hidden file input
		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));

		// Upload file by sending absolute path
		fileInput.sendKeys("C:\\Users\\weban\\Downloads\\pexels-pixabay-301920.jpg");
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[3]/button")).click();

		
		

		
		
		
		
	}
}
