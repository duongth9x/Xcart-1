package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class XCartPage {
	WebDriver driver;

	
	public XCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(css = ".log-in")
	private WebElement linkSign;
	
	@FindBy(id = "login-email")
	private WebElement txtEmail;
	
	@FindBy(id = "login-password")
	private WebElement txtPass;
	
	@FindBy(css = "button.submit:nth-child(1)")
	private WebElement btnSign;
	
	@FindBy(css = "#substring-default")
	private WebElement txtSearch;
	
	@FindBy(css = ".simple-search-box .btn.regular-button.submit-button.submit")
	private WebElement btnSearch;
	
	@FindBy(css = ".product.productid-37.product-added.ui-draggable")
	private WebElement btnProduct;
	
	@FindBy(css = ".btn.regular-button.regular-main-button.add2cart.submit")
	private WebElement btnAddtoCart;
	
	@FindBy(css = ".pp-ec-button")
	private WebElement btnBuy;
	
	@FindBy(css = "#shippingaddress-firstname")
	private WebElement txtFirstName;
	
	@FindBy(css = "#shippingaddress-lastname")
	private WebElement txtLastName;
	
	@FindBy(css = "#shippingaddress-street")
	private WebElement txtAddress;
	
	@FindBy(css = "#shippingaddress-city")
	private WebElement txtCity;
	
	@FindBy(css = "#shippingaddress-country-code option:nth-child(9")
	private WebElement checkboxCountry;
	
	@FindBy(css = "#shippingaddress-state-id option:nth-child(6)")
	private WebElement checkboxState;
	
	@FindBy(css = "#shippingaddress-phone")
	private WebElement txtPhone;
	
	@FindBy(css = ".btn.regular-button.regular-main-button.place-order.submit")
	private WebElement btnPlaceOrder;

	
	public void clickLinkSign() {
		linkSign.click();
	}
	
	public void enterEmailTextbox(String text) {
		txtEmail.clear();
		txtEmail.sendKeys(text);
		
	}
	
	public void enterPassTextbox(String text) {
		txtPass.clear();
		txtPass.sendKeys(text);
		
	}
	
	public void clickSignButton() {
		btnSign.click();
	}
	
	public void enterSearchTextbox(String text) {
		txtSearch.clear();
		txtSearch.sendKeys(text);
	}
	
	public void clickSearchButton() {
		btnSearch.click();
	}
	
	public void clickSelectProduct() {
		btnProduct.click();
	}
	
	public void clickAddtoCartButton() {
		btnAddtoCart.click();
	}
	
	public void clickBuyButton() {
		btnBuy.click();
	}
	
	public void enterFirstNameTextbox(String text) {
		txtFirstName.clear();
		txtFirstName.sendKeys(text);
	}
	
	public void enterLastNameTextbox(String text) {
		txtLastName.clear();
		txtLastName.sendKeys(text);
	}
	
	public void enterAddressTextbox(String text) {
		txtAddress.clear();
		txtAddress.sendKeys(text);
	}
	
	public void enterCityTextbox(String text) {
		txtCity.clear();
		txtCity.sendKeys(text);
	}
	
	public void enterCountryTextbox(String text) {
		checkboxCountry.clear();
		checkboxCountry.sendKeys(text);
	}
	
	public void enterStateTextbox(String text){
		checkboxState.clear();
		checkboxState.sendKeys(text);
	}
	
	public void enterPhoneTextbox(String text) {
		txtPhone.clear();
		txtPhone.sendKeys(text);
	}
	
	public void clickPlaceOrderButton() {
		btnPlaceOrder.click();
	}
	
}
