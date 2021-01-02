package architect.workshop.restassured.handson;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class InterrogationExercise1 {
	final private String PROTOCOL = "http";
    final private String DOMAIN = "www.compendiumdev.co.uk";
    final private String ROOT_URL = PROTOCOL + "://" + DOMAIN;
    
    @Test
    
    public void InterrogationExcercise(){
    	
    
    System.out.println("I am inside Test Method :1");
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.navigate().to(ROOT_URL+"/selenium/basic_web_page.html");
    Assert.assertEquals(
                        driver.getTitle(),"Basic Web Page Title");
    System.out.println("I am done with Assertion :1 "); 
    Assert.assertEquals(
            driver.getCurrentUrl(),ROOT_URL+"/selenium/basic_web_page.html");
    System.out.println("I am done with Assertion :2 "); 
    Assert.assertTrue(
            driver.getPageSource().contains("A paragraph of text"));
    System.out.println("I am done with Assertion :3 "); 
 	driver.close();
    driver.quit();

}
}
