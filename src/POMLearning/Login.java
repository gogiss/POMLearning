package POMLearning;

import static org.junit.Assert.assertTrue;

import org.junit.Before;

public class Login extends DriverControls {

	@Before
	public void LoginToPage() {

		LoginPage loginPage = new LoginPage(driver);
		assertTrue(loginPage.isInitialized());

		loginPage.enterCredentials(null, null);

		loginPage.submit();
	}

}
