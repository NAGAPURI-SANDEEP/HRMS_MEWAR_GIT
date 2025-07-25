package UTILS;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class Base_Class {
	
	public static WebDriver driver;

	@BeforeTest
	public static void UserLogin() throws IOException, InterruptedException {
		
		//location of the properties file
		FileInputStream filepath = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\configure.properties");
		
		
		//loading properties file
		Properties pfile = new Properties();
		pfile.load(filepath);
		
		//Reading data from the properties file
		String APP_URL = pfile.getProperty("appurl");
		String USER_EMAIL=pfile.getProperty("email");
		String USER_PASSWORD=pfile.getProperty("password");
		
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get(APP_URL);                                                                //Opening application with the url 
		driver.findElement(By.id("login_emailId")).sendKeys(USER_EMAIL);                     //User email id 
		driver.findElement(By.id("login_password")).sendKeys(USER_PASSWORD);                 //User Password 
		driver.findElement(By.xpath("//button[@type='submit']")).click();                    //click on sign in
		
		
		
		// git init
		//$ git config --global user.name "sandeep"
		//$ git confog --global user.email "nagapurisandeep1996@gmail.com"
	
		//	$ git status
		//$ git add -A
		//$ git status
		//$ git commit -m "first commit"
		
		// git config --global user.email "you@example.com"
		  //git config --global user.name "Your Name"

				
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
}
