package architect.workshop.restassured.handson;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddEmployeeOrangeHRM {
	
	final static  String APP_URL = "https://opensource-demo.orangehrmlive.com/";
	String user_name = "Admin";
	String login_password = "admin123" ;
	String firstName_Field ="Ash";
	String middleName_Field ="Ram";
	String lastName_Field ="Mur";
	String employeeId_Field = "22" ;
	
	
	@Test
	public void AddEmployee(){

	WebDriverManager.chromedriver().setup() ;

	WebDriver driver =new ChromeDriver() ;
	
	//Navigate to orange HRM page
	driver.navigate().to(APP_URL);
	
	// Login Page : 
	//Consolidate all locators and Browser actions
	
	WebElement userName = driver.findElement(By.id("txtUsername"));
	userName.sendKeys(user_name);
	
	WebElement password = driver.findElement(By.id("txtPassword"));
	password.sendKeys(login_password);
	
	WebElement loginButton = driver.findElement(By.id("btnLogin"));
	loginButton.submit();
	
	//Assertion for successful login
	String titleLoginSuccess = driver.getTitle();
	Assert.assertEquals(titleLoginSuccess,"OrangeHRM");
	System.out.println("Page Title is :"+titleLoginSuccess);

	//Navigate to PIM Tab
	WebElement PIM_Tab = driver.findElement(By.id("menu_pim_viewPimModule")) ;
	PIM_Tab.click();
	
	//Select AddEmployee
	WebElement addEmployee = driver.findElement(By.id("menu_pim_addEmployee"));
	addEmployee.click();
	
	//Add Employee Details
	// Consolidate Locators and Actions
	/*
	WebElement firstName = driver.findElement(By.id("firstName"));
	WebElement middleName = driver.findElement(By.id("middleName"));
	WebElement lastName = driver.findElement(By.id("lastName"));
	WebElement employeeId = driver.findElement(By.id("employeeId"));
	WebElement photofile = driver.findElement(By.id("photofile"));
	WebElement chkLogin_CheckBox = driver.findElement(By.id("chkLogin"));
		*/
	
	
	WebElement firstName = driver.findElement(By.xpath("//*[text()='Full Name']//following::input[1]"));
	
	System.out.println("Hi, after xpath");
	//User Data Entry
	
	/*
	firstName.sendKeys(firstName_Field);
	middleName.sendKeys(middleName_Field);
	lastName.sendKeys(lastName_Field);
	employeeId.sendKeys(employeeId_Field);
			
*/
		
	//Driver Quit
	driver.close();
	driver.quit();
	
	
	
	
	
	
	
	
	

}
}

	