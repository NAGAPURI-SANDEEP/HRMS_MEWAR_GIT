package PAGES;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import UTILS.Base_Class;


@Test
public class Delete_Program extends Base_Class {
	
	public static void delete_Program() {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div[2]/div/div[6]/div/div/a/div/div/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[4]/td[6]/button")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]")).click();
		driver.findElement(By.xpath("//div/div[1]/div/div/div/div[2]/button[2]")).click();
	}

}
