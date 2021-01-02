package architect.workshop.restassured.handson;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class InterrogationExercise2 {
	
	final private static String PROTOCOL = "http";
    final private static String DOMAIN = "www.compendiumdev.co.uk";
    final private static String ROOT_URL = PROTOCOL + "://" + DOMAIN;

   
    
    @Test
    public static void interrogationExercises(){
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
    	driver.navigate().to(ROOT_URL+"/selenium/find_by_playground.php");
    	//By CSS
    	WebElement para1_css = driver.findElement(By.cssSelector("#p1"));
    	Assert.assertEquals(para1_css.getText(),("This is a paragraph text")) ;
    	
    	//By Id
    	WebElement para1 = driver.findElement(By.id("p1"));
    	Assert.assertEquals(para1.getText(),("This is a paragraph text")) ;
    	
    	//By LinkText
    	WebElement para0 = driver.findElement(By.linkText("jump to para 0"));
    	Assert.assertEquals(para0.getAttribute("id"),"a26");
    	
    	//By Name
    	WebElement para2= driver.findElement(By.name("pName2"));
    	Assert.assertEquals(para2.getText(), "This is b paragraph text");
    	
    	//By Partial Link Text 
    	WebElement partialExample = driver.findElement(By.partialLinkText("para 3"));
    	Assert.assertEquals(partialExample.getText(),"jump to para 3");
    	
    	//By Class Name
    	WebElement classNameExample = driver.findElement(By.className("specialDiv"));
    	String id =classNameExample.getAttribute("id");
    	Assert.assertEquals(id, "div1");
    	System.out.println(id);
    	
    	// By XPath
    	WebElement para1_XPath = driver.findElement(By.xpath("//p[@id='p1']"));
    	Assert.assertEquals(para1.getText(),("This is a paragraph text")) ;
    	
    	
    	driver.close();
    	driver.quit();
    	
        
    
    }
    
   /* @After
    public static void quitDriver(){
    	driver.quit();
    	
    }*/

	
}
