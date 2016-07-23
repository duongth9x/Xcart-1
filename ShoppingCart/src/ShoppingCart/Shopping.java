package ShoppingCart;


	import java.io.IOException;

	import org.openqa.selenium.Keys;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	import Pageobject.Obj_Login;
	import Pageobject.Obj_Shopping;

	import common.OpenBrowser;
	import common.until;
	
	//import log4j
	import org.apache.log4j.Logger;

public class Shopping {
	//private WebDriver  driver;
	
	// Reference variable referencing getLogger method of Logger Class 
		Logger log = Logger.getLogger("devpinoyLogger");
		
			@BeforeTest
			@Parameters("browser")
			public void launchBrowser(String browser) throws Exception{
				OpenBrowser.multi_browser(browser);	
			}
			
			@Test(priority = 1, enabled = true) 
			public void ShCart() throws InterruptedException, IOException 
			{
				until.driver.get(until.URL);
				until.driver.findElement(Obj_Login.linkLogIn).click();
				until.driver.findElement(Obj_Login.txtEmail).clear();
				until.driver.findElement(Obj_Login.txtEmail).sendKeys(Obj_Login.StrEmail);
				until.driver.findElement(Obj_Login.txtPass).sendKeys(Obj_Login.StrPass);
				until.driver.findElement(Obj_Login.btnSign).click();
				
				log.debug("login successful");
				
				Thread.sleep(3000);
				until.driver.findElement(Obj_Shopping.txtSearch).sendKeys(Obj_Shopping.StrSearch);
				until.driver.findElement(Obj_Shopping.txtSearch).sendKeys(Keys.ENTER);
				until.driver.findElement(Obj_Shopping.Selector).click();
				until.driver.findElement(Obj_Shopping.btnAdd_Cart).click();
				
				log.debug("add cart here!!!!!!!!!!");
				
			//verify add to cart 
				String actualMess= until.driver.findElement(Obj_Shopping.actualMessAddCart).getText();
				if(Obj_Shopping.MessAddCart.contentEquals(actualMess))
				{
					System.out.println("Add to cart complete");
				}
				else
				{
					System.out.println("not add to cart ");
				}
			
				Thread.sleep(3000);
			
			//go to your cart 
				
			until.driver.findElement(Obj_Shopping.Goto_Yourcart).click();
			
			// go to checkout
			
			until.driver.findElement(Obj_Shopping.btnCheckout).click();
			
			//Order review
			until.driver.findElement(Obj_Shopping.txtFirstName).clear();
			until.driver.findElement(Obj_Shopping.txtFirstName).sendKeys(Obj_Shopping.StrFirstName);
			until.driver.findElement(Obj_Shopping.txtLastName).clear();
			until.driver.findElement(Obj_Shopping.txtLastName).sendKeys(Obj_Shopping.StrLastName);
			until.driver.findElement(Obj_Shopping.txtAdd).clear();
			until.driver.findElement(Obj_Shopping.txtAdd).sendKeys(Obj_Shopping.StrAdd);
			until.driver.findElement(Obj_Shopping.txtCity).clear();
			until.driver.findElement(Obj_Shopping.txtCity).sendKeys(Obj_Shopping.StrCity);
			until.driver.findElement(Obj_Shopping.txtCountry).sendKeys(Obj_Shopping.StrCountry);
			until.driver.findElement(Obj_Shopping.txtState).sendKeys(Obj_Shopping.StrState);
			//until.driver.findElement(Obj_Shopping.Checkbox).click();
			Thread.sleep(5000);
			until.driver.findElement(Obj_Shopping.btnPlaceOrder).click();
			
			Thread.sleep(3000);
			
			// verify Order 
			
			String actualMessOrder= until.driver.findElement(Obj_Shopping.actualMessOrder).getText();
			if(Obj_Shopping.MessOrder.contentEquals(actualMessOrder))
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail ");
			}
			
			Thread.sleep(3000);
			
		}	
			@AfterTest
			public void tearDown() throws Exception
			{
		//		until.driver.close();
				
			}
	}


