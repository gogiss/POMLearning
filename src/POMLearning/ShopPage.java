package POMLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopPage extends PageObject {

	@FindBy(id = "inventory_container")
	private WebElement shopInventory;
	
	@FindBy(className = "social_twitter")
	private WebElement twitterIcon;
	
	@FindBy(className = "social_facebook")
	private WebElement facebookIcon;
	
	@FindBy(className = "social_linkedin")
	private WebElement linkedinIcon;
	
	public ShopPage(WebDriver driver) {
		super(driver);
	}

	public boolean isInitialized() {
		return shopInventory.isDisplayed();
	}
	
	public boolean isTwitterIconShown() {
		return twitterIcon.isDisplayed();
	}
	
	public boolean isFacebookIconShown() {
		return facebookIcon.isDisplayed();
	}
	
	public boolean isLinkedinIconShown() {
		return linkedinIcon.isDisplayed();
	}

}