package architect.workshop.restassured.handson;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddEmployeeRevised {
final static  String APP_URL = "https://opensource-demo.orangehrmlive.com/";
String user_name = "Admin";
String login_password = "admin123" ;
String firstName_Field ="Ash";
String middleName_Field ="Ram";
String lastName_Field ="Mur";
String employeeId_Field = "22" ;
String filename = "capture.png"; 
File file = new File(filename); 
String user_name_creation = "AshyAsh";
String password_creation = "abcd1234!" ;
String path = file.getAbsolutePath(); 
String status_in_dropdown = "Enabled";

WebDriver driver;

@BeforeClass
public void beforeAllTests(){
	WebDriverManager.chromedriver().setup() ;

	driver =new ChromeDriver() ;

	
}

@AfterClass
public void tearDown()
{
	driver.quit();
}

@Test
public void AddEmployee(){

//WebDriverManager.chromedriver().setup() ;

//WebDriver driver =new ChromeDriver() ;


driver.manage().window().maximize();
driver.navigate().to(APP_URL);


driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

WebElement userName = driver.findElement(By.id("txtUsername"));
userName.sendKeys(user_name);

WebElement password = driver.findElement(By.id("txtPassword"));
password.sendKeys(login_password);

WebElement loginButton = driver.findElement(By.id("btnLogin"));
loginButton.submit();



String titleLoginSuccess = driver.getTitle();
Assert.assertEquals(titleLoginSuccess,"OrangeHRM");
System.out.println("Page Title is :"+titleLoginSuccess);



WebElement PIM_Tab = driver.findElement(By.id("menu_pim_viewPimModule")) ;
PIM_Tab.click();



WebElement addEmployee = driver.findElement(By.xpath("//input[@value='Add']"));
addEmployee.click();


System.out.println("Before entering First Name");
WebElement firstName = driver.findElement(By.xpath("//*[text()='Full Name']//following::input[1]"));
firstName.sendKeys(firstName_Field);
System.out.println("Hi, after xpath");
WebElement middleName = driver.findElement(By.xpath("//*[text()='Full Name']//following::input[2]"));
middleName.sendKeys(middleName_Field);
WebElement lastName = driver.findElement(By.xpath("//*[text()='Full Name']//following::input[3]"));
lastName.sendKeys(lastName_Field);
WebElement empID = driver.findElement(By.xpath("//*[text()='Employee Id']//following::input[1]"));
empID.sendKeys(employeeId_Field);
//Upload Photo Action


//driver.findElement(By.id("photofile")).click(); 
driver.findElement(By.id("photofile")).sendKeys(System.getProperty("user.dir")+"/Capture.png");
//String text = driver.findElement(By.id("uploaded-files")).getText(); 
//Assert.assertEquals(text, (filename));

// Select Checkbox
WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox']") );
checkbox.click();

// Assert the additional fields are displayed after selecting checkbox
WebElement userNameCreation = driver.findElement(By.xpath("//*[text()='User Name']//following::input[1]"));
Assert.assertEquals(true, userNameCreation.isDisplayed());
userNameCreation.sendKeys(user_name_creation);


WebElement passwordCreation = driver.findElement(By.xpath("//*[text()='Password']//following::input[1]"));
passwordCreation.sendKeys(password_creation);


WebElement passwordConfirmation = driver.findElement(By.xpath("//*[text()='Confirm Password']//following::input[1]"));
passwordConfirmation.sendKeys(password_creation);

// Select status from Dropdown
WebElement status = driver.findElement(By.id("status"));
List<WebElement> options = status.findElements(By.tagName("option"));

for (int i = 0; i < options.size(); i++) {
	 if (options.get(i).getText().equals(status_in_dropdown)) {
	 options.get(i).click();
	 }
	 
	 for(WebElement ele:options)
	 {
		 if(ele.getText().equals(status_in_dropdown))
		 {
			 ele.click();
			 break;
		 }
	 }
	 
	 
// Submit by clicking on Save
	
	 WebElement saveButton = driver.findElement(By.id("btnSave"));
	 saveButton.submit();

//

}
}
}



