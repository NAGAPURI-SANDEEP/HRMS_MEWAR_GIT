package PAGES;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import UTILS.Base_Class;
import UTILS.Excel_Utils;

public class Employee_Master_Add_Employee_Excel extends Base_Class {

	//HRMS PROJECT
	@Test
	public static void AddEMP() throws IOException, InterruptedException {

		String filepath = System.getProperty("user.dir") + "\\testdata\\Add_Employee.xlsx";

		int rows = Excel_Utils.getRowCount(filepath, "Employee_Data");


		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div/div[2]/div/div/a/div/div/span")).click();
		Thread.sleep(2000);
		

		for (int i = 1; i <= rows; i++) {
			
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[1]/div[2]/div/div[4]/button/span"))
					.click();
			
			Thread.sleep(5000);

			// read data from the excel

			String Aadhar_Number = Excel_Utils.getCellData(filepath, "Employee_Data", i, 14);
			
			//String UAN=Excel_Utils.getCellData(filepath, "Employee_Data", i, 54);
			
			//String Salutation = Excel_Utils.getCellData(filepath, "Employee_Data", i,2);
			
			String First_Name = Excel_Utils.getCellData(filepath, "Employee_Data", i, 3);
			
			String Last_Name = Excel_Utils.getCellData(filepath, "Employee_Data", i, 4);
			String Father_Name = Excel_Utils.getCellData(filepath, "Employee_Data", i, 5);
			String Mother_Name = Excel_Utils.getCellData(filepath, "Employee_Data", i, 6);
			String spouse_Name = Excel_Utils.getCellData(filepath, "Employee_Data", i, 7);
			String DOB = Excel_Utils.getCellData(filepath, "Employee_Data", i, 8);
			String PAN = Excel_Utils.getCellData(filepath, "Employee_Data", i, 13);
			String Education = Excel_Utils.getCellData(filepath, "Employee_Data", i, 12);
			String Email = Excel_Utils.getCellData(filepath, "Employee_Data", i, 25);
			String Mobile = Excel_Utils.getCellData(filepath, "Employee_Data", i, 19);
			String Alternative_contact_Number=Excel_Utils.getCellData(filepath,"Employee_Data", i, 24);
			String Current_address = Excel_Utils.getCellData(filepath, "Employee_Data", i, 15);
			String Current_State = Excel_Utils.getCellData(filepath, "Employee_Data", i, 17);
			String Current_city = Excel_Utils.getCellData(filepath, "Employee_Data", i, 16);
			String Pin_Code = Excel_Utils.getCellData(filepath, "Employee_Data", i, 18);
			//String Permanent_address = Excel_Utils.getCellData(filepath, "Employee_Data", i, 20);
			//String DOJ = Excel_Utils.getCellData(filepath, "Employee_Data", i, 28);
			
			String Exp_Mewar = Excel_Utils.getCellData(filepath, "Employee_Data", i, 30);
			String Exp_Other = Excel_Utils.getCellData(filepath, "Employee_Data", i, 29);
			//String Prefix = Excel_Utils.getCellData(filepath, "Employee_Data", i, 34);
			String designation = Excel_Utils.getCellData(filepath, "Employee_Data", i, 35);
			String Company= Excel_Utils.getCellData(filepath, "Employee_Data", i, 42);
			String Department= Excel_Utils.getCellData(filepath, "Employee_Data", i, 32);
			String Employee_Type= Excel_Utils.getCellData(filepath, "Employee_Data", i, 43);
			String Branch= Excel_Utils.getCellData(filepath, "Employee_Data", i, 40);
			//String Salary_Calculated_from_Date= Excel_Utils.getCellData(filepath, "Employee_Data", i, 45);
			
			String ERP_ID_Number= Excel_Utils.getCellData(filepath, "Employee_Data", i, 1);
			String Reporting_Manager= Excel_Utils.getCellData(filepath, "Employee_Data", i, 46);
			String Salary_Structure= Excel_Utils.getCellData(filepath, "Employee_Data", i,44);





			
			
			
			
			driver.findElement(By.id("register_aadharNo")).sendKeys(Aadhar_Number);
			//driver.findElement(By.id("register_uan")).sendKeys(UAN);
			Thread.sleep(2000);
			//driver.findElement(By.id("register_salutation")).click();
			driver.findElement(By.id("register_firstName")).sendKeys(First_Name);
			driver.findElement(By.id("register_lastName")).sendKeys(Last_Name);
			driver.findElement(By.id("register_fatherName")).sendKeys(Father_Name);
			driver.findElement(By.id("register_motherName")).sendKeys(Mother_Name);
			driver.findElement(By.id("register_spouseName")).sendKeys(spouse_Name);
			driver.findElement(By.id("register_dateOfBirth")).sendKeys("10-Feb-1996");
			driver.findElement(By.id("register_pan")).sendKeys(PAN);
			driver.findElement(By.id("register_education")).sendKeys(Education);
			
			
			driver.findElement(By.id("register_caste")).click();
			Thread.sleep(2000);
			WebElement option = driver.findElement(By.xpath("//div[contains(@class,'option') and text()='OBC']"));
			// 3. Hover and click (Actions class)
			Actions actions = new Actions(driver);
			actions.moveToElement(option).click().perform();
			
			
			
			driver.findElement(By.id("register_emailId")).sendKeys(Email);
			driver.findElement(By.id("register_mobile")).sendKeys(Mobile);
			driver.findElement(By.id("register_altContactNo")).sendKeys(Alternative_contact_Number);
			driver.findElement(By.id("register_currentAddress")).sendKeys(Current_address);

//	Enter the current State
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/section/div/div[5]/div[3]/div[1]/div/div/div[2]/div/div/div/div/div")).click();
			WebElement select_state = driver.findElement(By.id("rc_select_6"));
			select_state.sendKeys(Current_State);
			select_state.sendKeys(Keys.ENTER);

//	Enter the current City
			
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/section/div/div[5]/div[3]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/span/span[1]/input")).click();
			WebElement select_city = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/section/div/div[5]/div[3]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/span/span[1]/input"));
			Thread.sleep(1000);
			select_city.sendKeys(Current_city);
			select_city.sendKeys(Keys.ENTER);
			
			driver.findElement(By.id("register_currentPincode")).sendKeys(Pin_Code);
			driver.findElement(By.id("register_sameAsCurrentAddress")).click();
			//driver.findElement(By.id("register_reJoinee")).click();
			
			WebElement DOJ= driver.findElement(By.id("register_dateOfJoining"));
			DOJ.sendKeys("18-Aug-2025");
			DOJ.sendKeys(Keys.ENTER);
			
			driver.findElement(By.id("register_experienceInMewar")).sendKeys(Exp_Mewar);
			driver.findElement(By.id("register_experienceInOther")).sendKeys(Exp_Other);
			
			

			driver.findElement(By.id("rc_select_12")).click();
			WebElement select_designation= driver.findElement(By.id("rc_select_12"));
			select_designation.sendKeys(designation);
			select_designation.sendKeys(Keys.ENTER);
			
			
			
			driver.findElement(By.id("rc_select_13")).click();
			WebElement select_company= driver.findElement(By.id("rc_select_13"));
			select_company.sendKeys(Company);
			select_company.sendKeys(Keys.ENTER);
			
			
			
			driver.findElement(By.id("rc_select_14")).click();
			WebElement select_department = driver.findElement(By.id("rc_select_14"));
			select_department.sendKeys(Department);
			select_department.sendKeys(Keys.ENTER);
			
			
			driver.findElement(By.id("rc_select_16")).click();
			WebElement select_employee_type = driver.findElement(By.id("rc_select_16"));
			select_employee_type.sendKeys(Employee_Type);
			select_employee_type.sendKeys(Keys.ENTER);
			
			Thread.sleep(1000);

			
			

			driver.findElement(By.id("rc_select_17")).click();
			WebElement select_branch = driver.findElement(By.id("rc_select_17"));
			select_branch.sendKeys(Branch);
			select_branch.sendKeys(Keys.ENTER);
			
			Thread.sleep(1000);
			
			
			driver.findElement(By.id("register_salaryCalculateFrom")).sendKeys("18-Aug-2025");
			select_branch.sendKeys(Keys.ENTER);
			
			driver.findElement(By.id("register_erpRefNo")).sendKeys(ERP_ID_Number);
			
			driver.findElement(By.id("rc_select_19")).click();
			WebElement select_shift = driver.findElement(By.id("rc_select_19"));
			Thread.sleep(1000);

			select_shift.sendKeys("WRK21");
			select_shift.sendKeys(Keys.ENTER);
			
			
			Thread.sleep(1000);

			driver.findElement(By.id("rc_select_23")).click();
			WebElement select_reporting_manager= driver.findElement(By.id("rc_select_23"));
			select_reporting_manager.sendKeys(Reporting_Manager);
			select_reporting_manager.sendKeys(Keys.ENTER);
			
			
			WebElement select_salary_structure = driver.findElement(By.id("rc_select_24"));
			select_salary_structure.sendKeys(Salary_Structure);
			Thread.sleep(1000);
			select_salary_structure.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/section/div/div[10]/button[2]/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[1]/div/div/div[2]/button[2]")).click();


			Thread.sleep(5000);
			
			driver.navigate().refresh();
			
			Thread.sleep(5000);
			
			driver.close();

					
			

		

		}

	}

	

}
