package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import builder.CheckoutDetailBuilder;
import builder.LogInDetailBuilder;
import builder.ProductListDetailBuilder;
import detail.CheckoutDetail;
import detail.LoginDetail;
import detail.ProductListDetail;
import event.XcartEvent;

public class Checkout {
	WebDriver driver;

	@BeforeTest
	public void setup() {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/xcart/");

	}

	@Test(priority = 0)
	public void test_Checkout() throws InterruptedException {
		LogInDetailBuilder logindetailbuilder = new LogInDetailBuilder();
		ProductListDetailBuilder productlistdetailbuilder = new ProductListDetailBuilder();
		CheckoutDetailBuilder checkoutdatailbuilder = new CheckoutDetailBuilder();

		logindetailbuilder.withEmail("huong@gmail.com").withPass("1");
		productlistdetailbuilder.withSearch("iphone");
		checkoutdatailbuilder.withFirstName("aa").withLastName("bb").withCity("sg").withAddress("sagsg")
				.withCountry("United States").withPhone("824").withState("California");

		LoginDetail logindetail = logindetailbuilder.loginbuild();
		ProductListDetail productlistdetail = productlistdetailbuilder.productlistbuild();
		CheckoutDetail checkoutdetail = checkoutdatailbuilder.checkoutbuild();

		XcartEvent user = new XcartEvent(driver, logindetail, productlistdetail, checkoutdetail);

		user.navigateToLogInForm();

		Thread.sleep(3000);
		user.navigateToProductList();

		Thread.sleep(3000);
		user.navigateToCheckoutForm();

	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
