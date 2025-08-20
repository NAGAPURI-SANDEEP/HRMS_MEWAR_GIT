package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class Add_Program_document extends Base_Class {

	@Test
	public static void add_program_document() {

		driver.findElement(
				By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div[2]/div/div[6]/div/div/a/div/div/span")).click();
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[4]/td[6]/button"))
				.click();
		driver.findElement(By.xpath(
				"//div[@class='ant-dropdown css-pjilya ant-dropdown-placement-bottomRight']//span[contains(text(),'Documents')]"))
				.click();
		driver.findElement(By.xpath(
				"(//span[@class='inline-flex items-center !h-[35px] w-full px-4 py-2 border border-gray-300 rounded-md shadow-sm text-sm font-medium text-gray-700 bg-[#ffffff75] hover:bg-gray-50 cursor-pointer'])[1]"))
				.click();
		
		driver.findElement(By.xpath(
				"(//span[@class='inline-flex items-center !h-[35px] w-full px-4 py-2 border border-gray-300 rounded-md shadow-sm text-sm font-medium text-gray-700 bg-[#ffffff75] hover:bg-gray-50 cursor-pointer'])[1]"))
				.sendKeys("C:\\Users\\weban\\Downloads\\pexels-dianne-60973-226424.jpg");
	
		
		
		
	}
}
