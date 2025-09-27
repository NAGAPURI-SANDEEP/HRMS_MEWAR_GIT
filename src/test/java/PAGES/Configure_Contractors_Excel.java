package PAGES;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import UTILS.Base_Class;
import UTILS.Excel_Utils;


public class Configure_Contractors_Excel  extends Base_Class{
	
	
	
	@Test
	public void configure_Contractors() throws InterruptedException, IOException {
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		
//		driver.get("http://hrms.mewarpolytex.com:10000/login");
//		
//		driver.findElement(By.id("login_emailId")).sendKeys("admin@mewar.com");                     //User email id 
//		driver.findElement(By.id("login_password")).sendKeys("Admin@123");                 //User Password 
//		driver.findElement(By.xpath("//button[@type='submit']")).click();  //click on sign in
		Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div/div[2]/div/div[8]/div/div/a/div/div/span")).click();
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div/div/div/div[1]/div[1]/div/div[12]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/div[3]")).click();

		String filepath = System.getProperty("user.dir") + "\\testdata\\Configure_Contractors.xlsx";

		int rows = Excel_Utils.getRowCount(filepath, "Add_Contractor");
		
		
		
		for (int i = 1; i <= rows; i++) {
			String FIRM_NAME = Excel_Utils.getCellData(filepath, "Add_Contractor", i, 1);
			String PROPRIETOR_NAME = Excel_Utils.getCellData(filepath, "Add_Contractor", i, 4);
			String MOBILE_NO = Excel_Utils.getCellData(filepath, "Add_Contractor", i, 5);
			String PAN_NO = Excel_Utils.getCellData(filepath, "Add_Contractor", i, 6);
			String GSTIN = Excel_Utils.getCellData(filepath, "Add_Contractor", i, 2);

			String ADDRESS = Excel_Utils.getCellData(filepath, "Add_Contractor", i, 7);
			
			
			driver.findElement(By.id("contractorForm_firmName")).sendKeys(FIRM_NAME);
			driver.findElement(By.id("contractorForm_ownerName")).sendKeys(PROPRIETOR_NAME);
			driver.findElement(By.id("contractorForm_mobileNumber")).sendKeys(MOBILE_NO);
			driver.findElement(By.id("contractorForm_panNo")).sendKeys(PAN_NO);
			driver.findElement(By.id("contractorForm_gst")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@title='Yes']")).click();
			Thread.sleep(2000);

	        driver.findElement(By.xpath("//input[@id='contractorForm_gstIn']")).sendKeys("987623481234");

			driver.findElement(By.id("contractorForm_address")).sendKeys(ADDRESS);
			driver.findElement(By.xpath("//*[@id=\"contractorForm\"]/footer/div/button[1]")).click();
			
			
		}
		
		
	}

}
