package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class LoginPage extends BasePage {
	
	private By usernameField = By.id("user-name"); 
	private By passwordField = By.id("password");
	private By loginButton = By.id("login-button");
	private By errorMessage = By.cssSelector("#login_button_container hr");

	// Constructor
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void setUsername (String username){
		type(username ,usernameField );
	}
	
	public void setPassword (String password ){
		type(password ,passwordField );
	}
   
	public ProductsPage clickLoginButton(){
		click(loginButton);
		return new ProductsPage(driver);
		
	}

	public ProductsPage loginWith (String username , String password){
		setUsername(username);
		setPassword(password);
		return clickLoginButton();	
	}
	
	public String getErrorMessage() {
		return find(errorMessage).getText();
	}
	
} 


