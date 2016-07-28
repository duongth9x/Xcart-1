package scripts;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pages.XCartPage;

public class Checkout {
	WebDriver driver;

	@BeforeTest
	public void setup() {

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/xcart/");

	}

	@Test(priority = 0)
	public void test_Home_Page_Appear_Correct() throws InterruptedException {
		XCartPage user = new XCartPage(driver);
		user.clickLinkSign();
		user.enterEmailTextbox("ltthuong1@gmail.com");
		user.enterPassTextbox("1");
		user.clickSignButton();
		
		Thread.sleep(3000);
		
		//enter keywork into Search textbox
		user.enterSearchTextbox("iphone");
		
		Thread.sleep(2000);
		//click button Search
		user.clickSearchButton();
		
		//click select product
		user.clickSelectProduct();
		
		//add product to Cart 
		user.clickAddtoCartButton();
		
		Thread.sleep(3000);
		//click into Buy now with PayPay Button
		user.clickBuyButton();
		
		Thread.sleep(3000);
		//enter full information include: first name, last name,..
		user.enterFirstNameTextbox("lt");
		user.enterLastNameTextbox("bb");
		user.enterAddressTextbox("hidhdj");
		user.enterCityTextbox("hihi");
		user.enterCountryTextbox("United States");
		user.enterStateTextbox("California");
		user.enterPhoneTextbox("068568");
		
		//click into Place Order Button
		user.clickPlaceOrderButton();
		
		 //close the browser
        driver.close();
	}
}
