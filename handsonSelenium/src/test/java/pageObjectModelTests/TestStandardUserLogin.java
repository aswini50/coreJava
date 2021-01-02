package pageObjectModelTests;
import pageObjectModel.ProductsPage;
import pageObjectModelTests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStandardUserLogin extends BaseTest {
	
	@Test 
	public void testStandardUserCanLogin(){
		ProductsPage productsPage = loginPage.loginWith("standard_user", "secret_sauce");
		Assert.assertTrue(productsPage.isProductLabelDisplayed());
		
		
	}
	
	

}
