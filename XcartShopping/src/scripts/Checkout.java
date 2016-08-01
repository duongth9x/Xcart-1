package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import builder.XCartDetailBuilder;
import detail.XCartDetail;
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
		XCartDetailBuilder builder = new XCartDetailBuilder();

		builder.withEmail("huong@gmail.com").withPass("1").withSearch("iphone").withFirstName("aa").withLastName("bb");
		builder.withCity("sg").withAddress("sagsg").withCountry("United States").withPhone("824")
				.withState("California");

		XCartDetail detail = builder.build();

		XcartEvent user = new XcartEvent(driver, detail);
		user.navigateToLogInForm();

		Thread.sleep(3000);
		user.LogIn();

		Thread.sleep(3000);
		user.navigateToProductList();

		Thread.sleep(3000);
		user.SearchProduct();

		Thread.sleep(3000);
		user.navigateToCheckoutForm();

		Thread.sleep(3000);
		user.FillCheckoutForm();

	}

	// @Test(priority = 1)
	// public void test_Checkout1() throws InterruptedException {
	// XCartDetailBuilder builder = new XCartDetailBuilder();
	//
	// builder.withEmail("huong@gmail.com").withPass("1").withSearch("iphone").withFirstName("HOANGNL").withLastName("DEPTRAI");
	// builder.withCity("sg").withAddress("sagsg").withCountry("United
	// States").withPhone("824")
	// .withState("California");
	//
	// XCartDetail detail = builder.build();
	//
	// XcartEvent user = new XcartEvent(driver, detail);
	// user.navigateToLogInForm();
	// user.LogIn();
	// user.navigateToProductList();
	// user.SearchProduct();
	// user.navigateToCheckoutForm();
	// user.FillCheckoutForm();

	// }

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
