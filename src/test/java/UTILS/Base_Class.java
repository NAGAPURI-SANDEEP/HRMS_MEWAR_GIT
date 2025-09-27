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
		
		//$ git remote add origin "git@github.com:NAGAPURI-SANDEEP/HRMS_MEWAR_GIT.git"
		//$ git remote -v

				
	}
	
	
	//Random mail generation
	
	public static String getRandomEmail() {
	    String uuid = java.util.UUID.randomUUID().toString().replace("-", "").substring(0,8);
	    return "user" + uuid + "@yopmail.com";
	}
	
	//Random aadhaar generation 
	
	public static String getRandomAadhaar() {
	    StringBuilder aadhaar = new StringBuilder();
	    java.util.Random rand = new java.util.Random();

	    // Generate 12 random digits
	    for (int i = 0; i < 12; i++) {
	        aadhaar.append(rand.nextInt(10));  // 0–9
	    }

	    return aadhaar.toString();
	}
	
	//Random name generator
	
	public static String getRandomName() {
	    String[] firstNames = {"Aarav", "Vihaan", "Reyansh", "Aditya", "Krishna", 
	                           "Ishaan", "Rohan", "Sandeep", "Rahul", "Arjun", 
	                           "Neha", "Ananya", "Priya", "Kavya", "Pooja"};
	    String[] lastNames = {"Sharma", "Verma", "Reddy", "Patel", "Naidu", 
	                          "Gupta", "Mehta", "Kulkarni", "Nair", "Singh"};

	    java.util.Random rand = new java.util.Random();
	    String first = firstNames[rand.nextInt(firstNames.length)];
	    String last = lastNames[rand.nextInt(lastNames.length)];

	    return first + " " + last;
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
}
