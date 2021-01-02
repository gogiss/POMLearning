package POMLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

	@FindBy(name="user-name")
	private WebElement userNameBox;
	
	@FindBy(name="password")
	private WebElement passwordBox;
	
	@FindBy(id="login-button")
	private WebElement loginButton;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public boolean isInitialized() {
		return userNameBox.isDisplayed();
	}
	
	public void enterCredentials(String userName, String password){
		if (userName == null) {
			userName = "standard_user";
		}
		if (password == null) {
			password = "secret_sauce";
		}
		
		this.userNameBox.clear();
		this.userNameBox.sendKeys(userName);

		this.passwordBox.clear();
		this.passwordBox.sendKeys(password);
	}
	
	public ShopPage submit(){
		loginButton.click();
		return new ShopPage(driver);
	}
}