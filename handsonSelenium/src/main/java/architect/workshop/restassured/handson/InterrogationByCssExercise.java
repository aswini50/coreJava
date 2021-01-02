package architect.workshop.restassured.handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class InterrogationByCssExercise {
	final private String PROTOCOL = "http";
    final private String DOMAIN = "www.compendiumdev.co.uk";
    final private String ROOT_URL = PROTOCOL + "://" + DOMAIN;
    
    @Test
    public void byCSSExercises(){
    	
        	
        	// Basic Browser Set Up
       
        	WebDriverManager.chromedriver().setup();
        	WebDriver driver = new ChromeDriver();
        	driver.navigate().to(ROOT_URL+"/selenium/find_by_playground.php");
        	
        	// CSS Selectors Substitute
        	
        	//Scenario 1 (BY ID)
        	WebElement p31_byID = driver.findElement(By.id("p31"));
        	Assert.assertEquals("pName31", p31_byID.getAttribute("name"));
        	
        	WebElement p31_byCSS = driver.findElement(By.cssSelector("#p31"));
        	Assert.assertEquals("pName31", p31_byCSS.getAttribute("name"));
        	
        	
        	//Scenario 2(BY Class) 
        	
        	WebElement byName = driver.findElement(By.name("ulName1"));
        	Assert.assertEquals("ul1", byName.getAttribute("id"));
        	
        	WebElement byName_CSS = driver.findElement(By.cssSelector("[name='ulName1']"));
        	Assert.assertEquals("ul1", byName_CSS.getAttribute("id"));
        	
        	//Scenario 3 (By Class Name)
        	WebElement byClassName = driver.findElement(By.className("specialDiv"));
        	Assert.assertEquals("div1", byClassName.getAttribute("id"));
        	
        	WebElement byClassName_CSS = driver.findElement(By.cssSelector(".specialDiv"));
        	Assert.assertEquals("div1", byClassName_CSS.getAttribute("id"));
        	
        	//Scenario 4  (By Tag Name)
        	WebElement byTagName = driver.findElement(By.tagName("li"));
        	System.out.println(byTagName.getTagName());
        	System.out.println(byTagName.getAttribute("id"));
        	System.out.println(byTagName.getAttribute("name"));
        	Assert.assertEquals("liName1", byTagName.getAttribute("name"));
        	
        	WebElement byTagName_CSS = driver.findElement(By.cssSelector("li"));
        	Assert.assertEquals("liName1", byTagName_CSS.getAttribute("name"));
        	
        	//Close Broswer
        	driver.close();
        	driver.quit();
        	
    }
}
