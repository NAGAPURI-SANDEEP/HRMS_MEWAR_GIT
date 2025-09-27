package PAGES;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class Employee_Master_Add_Employee extends Base_Class {

	@Test
	public void addemp() throws InterruptedException {
		

		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div/div[2]/div/div/a/div/div/span")).click();

		for(int i=1;i<5;i++) {
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[1]/div[2]/div/div[4]/button/span"))
				.click();
		driver.findElement(By.id("register_aadharNo")).sendKeys(getRandomAadhaar());
		
		driver.findElement(By.id("register_firstName")).sendKeys(getRandomName());
		driver.findElement(By.id("register_lastName")).sendKeys("TEST-");
		driver.findElement(By.id("register_fatherName")).sendKeys("TEST");
		driver.findElement(By.id("register_dateOfBirth")).sendKeys("10-Feb-1994");
		driver.findElement(By.id("register_motherName")).sendKeys("TEST");
		driver.findElement(By.id("register_spouseName")).sendKeys("TEST");
		driver.findElement(By.id("register_pan")).sendKeys("MNJUK1234W");
		driver.findElement(By.id("register_education")).sendKeys("M.TECH");
		driver.findElement(By.id("register_caste")).click();
		Thread.sleep(2000);
		
		
		
		WebElement option = driver.findElement(By.xpath("//div[contains(@class,'option') and text()='OBC']"));

		// 3. Hover and click (Actions class)
		Actions actions = new Actions(driver);
		actions.moveToElement(option).click().perform();
		
		
		
		driver.findElement(By.id("register_dateOfJoining")).sendKeys("18-Aug-2025");
		driver.findElement(By.id("register_dateOfJoining")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("register_experienceInMewar")).sendKeys("5");
		driver.findElement(By.id("register_experienceInOther")).sendKeys("10");
		
		WebElement select_prefix= driver.findElement(By.id("rc_select_7"));
		select_prefix.sendKeys("Trainee");
		select_prefix.sendKeys(Keys.ENTER);
		
		WebElement select_Designation= driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/section/div/div[5]/div[3]/div[2]/div/div/div[2]/div/div/div/div/div/span/span[1]/input"));
		select_Designation.click();
		select_Designation.sendKeys("Engineer");
		select_Designation.sendKeys(Keys.ENTER);
		
		WebElement select_company= driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/section/div/div[5]/div[3]/div[3]/div/div/div[2]/div/div/div/div/div/span/span[1]/input"));
		select_company.sendKeys("mewar polytex limited");
		select_company.sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.id("rc_select_10")).click();
		WebElement select_department= driver.findElement(By.id("rc_select_10"));
		select_department.sendKeys("engineer");
		select_department.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("rc_select_12")).click();
		WebElement select_employee_type= driver.findElement(By.id("rc_select_12"));
		select_employee_type.sendKeys("staff");
		select_employee_type.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		driver.findElement(By.id("rc_select_22")).click();
		Thread.sleep(2000);
		WebElement select_grade = driver.findElement(By.id("rc_select_22"));
		select_grade.sendKeys("g2");
		
		driver.findElement(By.id("register_emailId")).sendKeys(getRandomEmail());
		
		
		driver.findElement(By.id("register_mobile")).sendKeys("9988776655");
		driver.findElement(By.id("register_currentAddress")).sendKeys("Jublie Hills, HYDERABAD");
		
		driver.findElement(By.id("rc_select_23"));
		WebElement select_state = driver.findElement(By.id("rc_select_23"));
		select_state.sendKeys("telangana");
		select_state.sendKeys(Keys.ENTER);
		
		WebElement select_city = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/section/div/div[6]/div[4]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/span/span[1]/input"));
		select_city.click();
		select_city.sendKeys("Hyderabad");
		select_city.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("register_currentPincode")).sendKeys("505001");
		
		driver.findElement(By.id("register_sameAsCurrentAddress")).click();
		
		
		WebElement select_branch=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/section/div/div[5]/div[5]/div[1]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/span/span[1]/input"));
		select_branch.click();
		select_branch.sendKeys("mewar polytex");
		select_branch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.id("register_salaryCalculateFrom")).sendKeys("26-Aug-2025");
		
		
		driver.findElement(By.id("register_erpRefNo")).sendKeys("EMP1001");
		
		
		
		driver.findElement(By.id("register_overTime")).click();
		driver.findElement(By.xpath("//div[text()='No']")).click();
		
		
		WebElement select_salary_structure = driver.findElement(By.id("rc_select_20"));
		select_salary_structure.sendKeys("sal Structure staff");
		Thread.sleep(1000);
		select_salary_structure.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/section/div/div[10]/button[2]/span")).click();
				
		Thread.sleep(10000);

		
	


	}
	}
}
