package PAGES;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
<<<<<<< HEAD
=======
import org.openqa.selenium.support.ui.WebDriverWait;
>>>>>>> 9422285 (Commit by Priyank)
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class Add_Program_document extends Base_Class {
<<<<<<< HEAD

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
=======
	
	@Test
	
	public static void add_Program() {
    

        // Use explicit waits instead of Thread.sleep!
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // For demo, assume the "Action" tab div is present after login
        WebElement actionTab = wait.until(
            ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div/div[7]/div/div/a/div/div")
            )
        );
        actionTab.click();

        // Wait for and click the ... (3-dots or action button)
        WebElement threeDots = wait.until(
            ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"rc-tabs-1-panel-programs\"]/div/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[6]/button")
            )
        );
        threeDots.click();

        // Wait for and click "Documents"
        WebElement documents = wait.until(
            ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@class='ant-dropdown css-pjilya ant-dropdown-placement-bottomRight']//span[@aria-label='file-text']//*[name()='svg']")
            )
        );
        documents.click();
        
        

        
        WebElement docTypeDropdown = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"rc_select_1\"]")
        ));
        docTypeDropdown.click();

        
        WebElement typeOption = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(text(),'Training Record')]") 
        ));
        typeOption.click();

        
        WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//input[@type='file']")
        ));
        fileInput.sendKeys("C:\\Users\\Sahil\\Downloads\\3. Employee Shifts_31_May_2025.xlsx");

        
        WebElement addDocButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//button[@class='ant-btn css-pjilya ant-btn-primary ant-btn-color-primary ant-btn-variant-solid primaryButton !h-[35px]'])[1]")
        ));
        addDocButton.click();
    }
>>>>>>> 9422285 (Commit by Priyank)
}
