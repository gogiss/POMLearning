package POMLearning;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LoginTests extends DriverControls {
	
	public String userName = "standard_user";
	public String password = "secret_sauce";
	
	@Test
	public void signUp(){
		
		LoginPage loginPage = new LoginPage(driver);
		assertTrue(loginPage.isInitialized());

		loginPage.enterCredentials(userName, password);

		ShopPage shopPage = loginPage.submit();
		assertTrue(shopPage.isInitialized());
	}	
	
	//@Test// add test with invalid user/credentials
}