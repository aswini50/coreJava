package architect.workshop.restassured.handson;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsInterrogationExercise3 {
	final private String PROTOCOL = "http";
    final private String DOMAIN = "www.compendiumdev.co.uk";
    final private String ROOT_URL = PROTOCOL + "://" + DOMAIN;
    
    @Test
    public void findElements(){
    	
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(ROOT_URL+"/selenium/find_by_playground.php");
        
        List<WebElement> divElement = driver.findElements(By.tagName("div"));
        int countOfDiv = divElement.size();
        System.out.println("The no. of divs :" + countOfDiv);
        Assert.assertEquals(19, countOfDiv);
        
        
        
        driver.close();
        driver.quit();
    	
    }
	

}
