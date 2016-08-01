package event;

import org.openqa.selenium.WebDriver;
import detail.XCartDetail;
import pages.CheckoutPage;
import pages.LogInPage;
import pages.ProductListPage;

public class XcartEvent {
	WebDriver driver;
	XCartDetail detail;

	LogInPage logInPage;
	ProductListPage productListPage;
	CheckoutPage checkoutPage;

	public XcartEvent(WebDriver driver, XCartDetail detail) {
		this.driver = driver;
		this.detail = detail;
		this.logInPage = new LogInPage(driver);
		this.productListPage = new ProductListPage(driver);
		this.checkoutPage = new CheckoutPage(driver);
	}

	public void LogIn() throws InterruptedException {

		logInPage.clickLinkSign();
		logInPage.enterEmailTextbox(detail.getEmail());
		logInPage.enterPassTextbox(detail.getPass());
		logInPage.clickSignButton();

		Thread.sleep(3000);
	}

	public void SearchProduct() throws InterruptedException {
		// enter keywork into Search textbox
		productListPage.enterSearchTextbox(detail.getSearch());

		Thread.sleep(2000);
		// click button Search
		productListPage.clickSearchButton();

		// click select product
		productListPage.clickSelectProduct();

		// add product to Cart
		productListPage.clickAddtoCartButton();

		Thread.sleep(3000);
		// click into Buy now with PayPay Button
		productListPage.clickBuyButton();
	}

	public void FillCheckoutForm() throws InterruptedException {
		Thread.sleep(3000);
		// enter full information include: first name, last name,..
		checkoutPage.enterFirstNameTextbox(detail.getFirstName());
		checkoutPage.enterLastNameTextbox(detail.getLastName());
		checkoutPage.enterAddressTextbox(detail.getAddress());
		checkoutPage.enterCityTextbox(detail.getCity());
		checkoutPage.enterCountryTextbox(detail.getCountry());
		checkoutPage.enterStateTextbox(detail.getState());
		checkoutPage.enterPhoneTextbox(detail.getPhone());

		// click into Place Order Button
		checkoutPage.clickPlaceOrderButton();
	}

	public void navigateToLogInForm() {
		// TODO Auto-generated method stub
		LogInPage obj = new LogInPage(driver);
		obj.clickLinkSign();
		obj.enterEmailTextbox(detail.getEmail());
		obj.enterPassTextbox(detail.getPass());
		obj.clickSignButton();
	}

	public void navigateToProductList() throws InterruptedException {
		// TODO Auto-generated method stub
		ProductListPage obj = new ProductListPage(driver);

		obj.enterSearchTextbox(detail.getSearch());
		obj.clickSearchButton();
		obj.clickSelectProduct();
		obj.clickAddtoCartButton();
		obj.clickBuyButton();
	}

	public void navigateToCheckoutForm() {
		// TODO Auto-generated method stub
		CheckoutPage obj = new CheckoutPage(driver);
		obj.enterFirstNameTextbox(detail.getFirstName());
		obj.enterLastNameTextbox(detail.getLastName());
		obj.enterAddressTextbox(detail.getAddress());
		obj.enterCityTextbox(detail.getCity());
		obj.enterCountryTextbox(detail.getCountry());
		obj.enterStateTextbox(detail.getState());
		obj.enterPhoneTextbox(detail.getPhone());
		obj.clickPlaceOrderButton();
	}
}