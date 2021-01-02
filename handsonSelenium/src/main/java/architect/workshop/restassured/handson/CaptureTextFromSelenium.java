package architect.workshop.restassured.handson;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CaptureTextFromSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup() ;

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement username=driver.findElementById("txtUsername");
		
		//Interrogation
		boolean disStatus= username.isDisplayed();
		boolean enabledStatus = username.isEnabled();
		System.out.println("Displayed ? "+disStatus);
		
		System.out.println("Enabled ? "+enabledStatus);
		
		//Checkbox and RadioButton
		String typeValue = username.getAttribute("type");
		System.out.println(typeValue);
		
		username.clear();
		username.sendKeys("admin");
		WebElement pass = driver.findElementByName("txtPassword");
		String value = pass.getAttribute("autocomplete");
		System.out.println(value);
		
		if (value.equalsIgnoreCase("Off")){
			System.out.println("Validation 1 passed");
			pass.sendKeys("admin123");
		}
		
		driver.findElementById("btnLogin").click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (url.contains("dashboard")){
			System.out.println("Login done");
		}
		else
		{
			System.out.println("Login Failed");
		}
		
		driver.quit();
	}

}
