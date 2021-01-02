package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

	protected WebDriver driver ;
	
	//Constructor
	public BasePage (WebDriver driver) {
		this.driver = driver;
	}
	
	// Methods for Interrogation
	protected WebElement find (By locator){
		return driver.findElement(locator);
	}
	
	// Methods for Manipulation
	protected void type (String text , By locator) {
		find(locator).clear();
		find(locator).sendKeys(text);
	}
	
	protected void click (By locator) {
		find(locator).click();
		}
	
	protected Boolean isDiplayed (By locator){
		try{
	 return(find(locator).isDisplayed());
		}
		catch (NoSuchElementException exc) {
			return false;	
		}
}

}