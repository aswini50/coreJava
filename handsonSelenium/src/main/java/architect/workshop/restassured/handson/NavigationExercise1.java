package architect.workshop.restassured.handson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class NavigationExercise1 {
	
	final private String PROTOCOL = "http";
    final private String DOMAIN = "www.compendiumdev.co.uk";
    final private String ROOT_URL = PROTOCOL + "://" + DOMAIN;
    
    
	
	@BeforeClass
	public static void Before(){
	
	System.out.println("Hi , I am in Before Class");
	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
	}
	
	@Test
	public void navigateToSelenium(){
		
		
	    System.out.println("I am inside Test Method :1");
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.navigate().to(ROOT_URL+"/selenium");
	    Assert.assertTrue(
	                        driver.getTitle().startsWith("Selenium"),"title should start with Selenium");
	    System.out.println("I am done with Assertion :1 "); 
	  
	 
}
	
	@Test
	public void useGetMethod(){
		System.out.println("I am inside Test Method :2");
		//WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		driver.get(ROOT_URL+"/selenium/search.php");
		Assert.assertEquals(driver.getTitle(),"Selenium Simplified Search Engine");
		System.out.println("I am done with Assertion :2 "); 
		
	}
	
	@AfterClass
	public static void quitDriver(){
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		//WebDriver driver = null;
		driver.close();
	    driver.quit();
	}
}

