package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class ProductsPage extends BasePage {

	private By productLabel1 = By.className("product_label") ;
	private By backpack = By.id("item_4_title_link");
	private By addToCartButton = By.className("btn_inventory");
	
	
	public ProductsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public Boolean 	isProductLabelDisplayed(){
		return isDiplayed(productLabel1);
		
	}
	 
	public void addBackPack(){
		find(backpack).click();
		click(addToCartButton) ;
	}
	
	public String getButtonName(){
		return find(addToCartButton).getText();
	}
}
  	