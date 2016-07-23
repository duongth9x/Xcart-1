package Pageobject;

import org.openqa.selenium.By;

public class Obj_Shopping {
	
	public static String StrSearch = "iphone";
	public static By txtSearch = By.xpath(".//*[@id='substring-default']");
	public static By Selector = By.cssSelector(".productid-37 > div:nth-child(4) > a:nth-child(1)");
	public static By btnAdd_Cart = By.cssSelector(".add2cart");
	
	//verify add to cart 
	public static final String MessAddCart  = "Product has been added to your cart";
 	public static final By actualMessAddCart = By.cssSelector("#status-messages > ul:nth-child(2)");
 	// go to your cart 
	public static By Goto_Yourcart = By.cssSelector(".product-added-note > a:nth-child(2)");
 	
	//go to checkout
	public static By btnCheckout = By.cssSelector("button.regular-main-button");
	
	//Order review
	public static String StrFirstName = "abc";
	public static String StrLastName = "aa";
	public static String StrAdd= "abcd - abcd";
	public static String StrCity= "xyz";
	public static String StrCountry = "Thailand";
	public static String StrState = "Ang Thong";
	
	public static By txtFirstName = By.id("shippingaddress-firstname");
	public static By txtLastName = By.id("shippingaddress-lastname");
	public static By txtAdd = By.id("shippingaddress-street");
	public static By txtCity = By.id("shippingaddress-city");
	public static By txtCountry = By.id("shippingaddress-country-code");
	public static By txtState = By.id("shippingaddress-state-id");
	public static By Checkbox = By.id("pmethod2");
	
	public static By btnPlaceOrder = By.cssSelector(".regular-main-button");
	//verify order 
	public static final String MessOrder  = "Thank you for your order";
 	public static final By actualMessOrder= By.cssSelector("#page-title");
 	
}
