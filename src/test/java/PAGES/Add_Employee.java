package PAGES;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class Add_Employee extends Base_Class {

	@Test
	public void addemp() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


		driver.findElement(
				By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div[2]/div/div[2]/div/div/a/div/div/span")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[1]/div[2]/div/div[4]/button/span"))
				.click();
		driver.findElement(By.id("register_aadharNo")).sendKeys("123456789876");

		driver.findElement(By.id("register_firstName")).sendKeys("sandy");
		driver.findElement(By.id("register_lastName")).sendKeys("N");
		driver.findElement(By.id("register_fatherName")).sendKeys("Ram");
		driver.findElement(By.id("register_dateOfBirth")).sendKeys("10-Feb-1996");
		driver.findElement(By.id("register_motherName")).sendKeys("Laxmi");
		driver.findElement(By.id("register_spouseName")).sendKeys("NA");
		driver.findElement(By.id("register_pan")).sendKeys("ASDFS3456R");
		driver.findElement(By.id("register_education")).sendKeys("M.TECH");
		driver.findElement(By.id("register_emailId")).sendKeys("sandeep123@yopmail.com");
		driver.findElement(By.id("register_mobile")).sendKeys("8877889999");
		driver.findElement(By.id("register_currentAddress")).sendKeys("Jublie Hills, HYDERABAD");
		
		WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("register_currentAddress")));

		// Now it's rendered and visible
		((JavascriptExecutor) driver)
		  .executeScript("arguments[0].scrollIntoView({block:'center'});", el);
		el.click();

		Thread.sleep(4000);

		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/section/div/div[5]/div[3]/div[1]/div/div/div[2]/div/div/div/div/div"))
				.click();

		WebElement select_state = driver.findElement(By.id("rc_select_6"));
		select_state.sendKeys("telangana");
		select_state.sendKeys(Keys.ENTER);

		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/section/div/div[5]/div[3]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/span/span[1]/input"))
				.click();
		WebElement select_city = driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/section/div/div[5]/div[3]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/span/span[1]/input"));
		select_city.sendKeys("karimnagar");
		select_city.sendKeys(Keys.ENTER);

		driver.findElement(By.id("register_currentPincode")).sendKeys("505001");
		
		driver.findElement(By.id("register_dateOfJoining")).sendKeys("2025-07-30");
		driver.findElement(By.id("register_sameAsCurrentAddress")).click();
		
		driver.findElement(By.id("register_experienceInMewar")).sendKeys("5");
		driver.findElement(By.id("register_experienceInOther")).sendKeys("10");
		
		
		driver.findElement(By.id("rc_select_12")).click();
		WebElement select_designation= driver.findElement(By.id("rc_select_12"));
		select_designation.sendKeys("engineer");
		select_designation.sendKeys(Keys.ENTER);
		
		
		
		driver.findElement(By.id("rc_select_13")).click();
		WebElement select_company= driver.findElement(By.id("rc_select_13"));
		select_company.sendKeys("mewar packaging");
		select_company.sendKeys(Keys.ENTER);
		
		
		
		driver.findElement(By.id("rc_select_14")).click();
		WebElement select_department = driver.findElement(By.id("rc_select_14"));
		select_department.sendKeys("Civil");
		select_department.sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.id("rc_select_16")).click();
		WebElement select_employee_type = driver.findElement(By.id("rc_select_16"));
		select_employee_type.sendKeys("Staff");
		select_employee_type.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);

		
		
		driver.findElement(By.id("rc_select_17")).click();
		WebElement select_branch = driver.findElement(By.id("rc_select_17"));
		select_branch.sendKeys("work from home India");
		
		Thread.sleep(4000);
		
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("rc_select_17")));

		// Now it's rendered and visible
		((JavascriptExecutor) driver)
		  .executeScript("arguments[0].scrollIntoView({block:'center'});", ele);
		ele.click();
		
		driver.findElement(By.id("register_salaryCalculateFrom")).sendKeys("2025-07-23");
		select_branch.sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.id("register_erpRefNo")).sendKeys("EMP123");
		
		
		Thread.sleep(2000);

		driver.findElement(By.id("rc_select_23")).click();
		WebElement select_reporting_manager= driver.findElement(By.id("rc_select_23"));
		select_reporting_manager.sendKeys("sandeep");
		select_reporting_manager.sendKeys(Keys.ENTER);
		
		WebElement select_salary_structure = driver.findElement(By.id("rc_select_24"));
		select_salary_structure.sendKeys("sal Structure staff");
		Thread.sleep(2000);
		select_salary_structure.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		WebElement ele_1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"employee-form\"]/section/div/div[8]/div/div[2]/div/div/div[1]/label")));

		// Now it's rendered and visible
		((JavascriptExecutor) driver)
		  .executeScript("arguments[0].scrollIntoView({block:'center'});", ele_1);
		ele_1.click();
		
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/section/div/div[10]/button[2]/span")).click();
		

		
		
		Thread.sleep(10000);

		driver.close();

	}

}
