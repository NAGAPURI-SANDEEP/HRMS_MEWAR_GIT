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

public class Employee_Master_Add_Employee extends Base_Class {

	@Test
	public void addemp() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


		driver.findElement(
				By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div[2]/div/div[2]/div/div/a/div/div/span")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[1]/div[2]/div/div[4]/button/span"))
				.click();
		driver.findElement(By.id("register_aadharNo")).sendKeys("890734562312");

		driver.findElement(By.id("register_firstName")).sendKeys("Mahesh");
		driver.findElement(By.id("register_lastName")).sendKeys("N");
		driver.findElement(By.id("register_fatherName")).sendKeys("Ram");
		driver.findElement(By.id("register_dateOfBirth")).sendKeys("10-Feb-1996");
		driver.findElement(By.id("register_motherName")).sendKeys("TEST");
		driver.findElement(By.id("register_spouseName")).sendKeys("TEST");
		driver.findElement(By.id("register_pan")).sendKeys("ASDFS3456S");
		driver.findElement(By.id("register_education")).sendKeys("M.TECH");
		driver.findElement(By.id("register_emailId")).sendKeys("mahesh123@yopmail.com.com");
		driver.findElement(By.id("register_mobile")).sendKeys("9988776655");
		driver.findElement(By.id("register_currentAddress")).sendKeys("Jublie Hills, HYDERABAD");
		
		WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("register_currentAddress")));

		// Now it's rendered and visible
		((JavascriptExecutor) driver)
		  .executeScript("arguments[0].scrollIntoView({block:'center'});", el);
		el.click();

		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/section/div/div[5]/div[3]/div[1]/div/div/div[2]/div/div/div/div/div"))
				.click();
		WebElement select_state = driver.findElement(By.id("rc_select_6"));
		select_state.sendKeys("telangana");
		select_state.sendKeys(Keys.ENTER);
		
		

		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/section/div/div[5]/div[3]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/span/span[1]/input"))
				.click();
		WebElement select_city = driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/section/div/div[5]/div[3]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/span/span[1]/input"));
		select_city.sendKeys("karimnagar");
		select_city.sendKeys(Keys.ENTER);
		
		
		

		driver.findElement(By.id("register_currentPincode")).sendKeys("505001");
		
		driver.findElement(By.id("register_dateOfJoining")).sendKeys("18-Aug-2025");
		driver.findElement(By.id("register_sameAsCurrentAddress")).click();
		
		driver.findElement(By.id("register_experienceInMewar")).sendKeys("5");
		driver.findElement(By.id("register_experienceInOther")).sendKeys("10");
		
		driver.findElement(By.id("rc_select_11")).click();
		WebElement select_prefix=driver.findElement(By.id("rc_select_11"));
		select_prefix.sendKeys("Trainee");
		select_prefix.sendKeys(Keys.ENTER);
		
		
		
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
		
		Thread.sleep(1000);

		
		
		driver.findElement(By.id("rc_select_17")).click();
		WebElement select_branch = driver.findElement(By.id("rc_select_17"));
		select_branch.sendKeys("work from home India");
		select_branch.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.id("register_salaryCalculateFrom")).sendKeys("26-Aug-2025");
		select_branch.sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.id("register_erpRefNo")).sendKeys("EMP1001");
		
		driver.findElement(By.id("rc_select_19")).click();
		WebElement select_shift = driver.findElement(By.id("rc_select_19"));
		select_shift.sendKeys("WRK21");
		select_shift.sendKeys(Keys.ENTER);
		
		
		Thread.sleep(1000);

		driver.findElement(By.id("rc_select_23")).click();
		WebElement select_reporting_manager= driver.findElement(By.id("rc_select_23"));
		select_reporting_manager.sendKeys("sandeep");
		select_reporting_manager.sendKeys(Keys.ENTER);
		
		
		WebElement select_salary_structure = driver.findElement(By.id("rc_select_24"));
		select_salary_structure.sendKeys("sal Structure staff");
		Thread.sleep(1000);
		select_salary_structure.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement ele_1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"employee-form\"]/section/div/div[8]/div/div[2]/div/div/div[1]/label")));

		// Now it's rendered and visible
		((JavascriptExecutor) driver)
		  .executeScript("arguments[0].scrollIntoView({block:'center'});", ele_1);
		ele_1.click();
		
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/section/div/div[10]/button[2]/span")).click();
		

		
		
		Thread.sleep(10000);

		//driver.close();

	}

}
