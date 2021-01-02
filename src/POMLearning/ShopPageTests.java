package POMLearning;

import org.junit.Test;

public class ShopPageTests extends Login {
	
	@Test
	public void areSocialMediaIconsShown() {
		ShopPage shopPage = new ShopPage(driver);
		
		shopPage.isFacebookIconShown();
		shopPage.isLinkedinIconShown();
		shopPage.isTwitterIconShown();
	}

}
