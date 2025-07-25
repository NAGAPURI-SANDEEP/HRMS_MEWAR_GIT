package PAGES;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class Add_Program_document extends Base_Class {
	
	
	@Test
	public static void add_program_document() {
	
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div[2]/div/div[6]/div/div/a/div/div/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[4]/td[6]/button")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]")).click();
	
}}
