package pageObjectModelTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectModel.*;

public class TestBackPack extends BaseTest {
	
	@Test
	public void testAddBackPack(){
		ProductsPage productsPage = loginPage.loginWith("standard_user","secret_sauce") ;
		productsPage.addBackPack();
		Assert.assertEquals(productsPage.getButtonName(), "REMOVE");
	}

}
