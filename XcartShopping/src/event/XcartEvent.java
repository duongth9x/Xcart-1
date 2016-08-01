package event;

import org.openqa.selenium.WebDriver;

import detail.CheckoutDetail;
import detail.LoginDetail;
import detail.ProductListDetail;
import pages.CheckoutPage;
import pages.LogInPage;
import pages.ProductListPage;

public class XcartEvent {
	WebDriver driver;
	LoginDetail logindetai;
	ProductListDetail productlistdetail;
	CheckoutDetail checkoutdetail;

	LogInPage logInPage;
	ProductListPage productListPage;
	CheckoutPage checkoutPage;

	public XcartEvent(WebDriver driver, LoginDetail logindetai, ProductListDetail productlistdetail,
			CheckoutDetail checkoutdetail) {
		this.driver = driver;
		this.logindetai = logindetai;
		this.productlistdetail = productlistdetail;
		this.checkoutdetail = checkoutdetail;

		this.logInPage = new LogInPage(driver);
		this.productListPage = new ProductListPage(driver);
		this.checkoutPage = new CheckoutPage(driver);
	}

	public void navigateToLogInForm() {
		// TODO Auto-generated method stub
		LogInPage obj = new LogInPage(driver);
		obj.clickLinkSign();
		obj.enterEmailTextbox(logindetai.getEmail());
		obj.enterPassTextbox(logindetai.getPass());
		obj.clickSignButton();
	}

	public void navigateToProductList() throws InterruptedException {
		// TODO Auto-generated method stub
		ProductListPage obj = new ProductListPage(driver);

		obj.enterSearchTextbox(productlistdetail.getSearch());
		obj.clickSearchButton();
		obj.clickSelectProduct();
		obj.clickAddtoCartButton();
		obj.clickBuyButton();
	}

	public void navigateToCheckoutForm() {
		// TODO Auto-generated method stub
		CheckoutPage obj = new CheckoutPage(driver);
		obj.enterFirstNameTextbox(checkoutdetail.getFirstName());
		obj.enterLastNameTextbox(checkoutdetail.getLastName());
		obj.enterAddressTextbox(checkoutdetail.getAddress());
		obj.enterCityTextbox(checkoutdetail.getCity());
		obj.enterCountryTextbox(checkoutdetail.getCountry());
		obj.enterStateTextbox(checkoutdetail.getState());
		obj.enterPhoneTextbox(checkoutdetail.getPhone());
		obj.clickPlaceOrderButton();
	}
}