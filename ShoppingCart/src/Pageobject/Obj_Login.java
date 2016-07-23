package Pageobject;

import org.openqa.selenium.By;




public class Obj_Login {

	public static String StrEmail = "thuonglt1@gmail.com";
  	public static String StrPass = "1";	
	public static By linkLogIn = By.cssSelector("#header-bar > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)");
	public static By linkLogOut = By.cssSelector("#header-bar > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)");
	
  	public static By txtEmail = By.id("login-email");
  	public static By txtPass = By.id("login-password");
  	public static By btnSign = By.cssSelector("button.submit:nth-child(1)");
  	public static By linkForgotPass = By.linkText("Forgot password?");
  	public static By Close = By.cssSelector(".ui-dialog-titlebar-close");
  	
  	//1 success
  	public static final String expectedTitle = "Catalog";
  
	//2 null email
  	public static final String MessNullEmail = "This field is required";
  	public static By actualNullEmail = By.cssSelector("p.error");
  	
	//3 null pass
  	public static final String MessNullPass = "This field is required";
  	public static By actualNullPass = By.cssSelector("p.error");
  	
  	//4 invalid email
  	public static final String MessInvalidEmail = "Invalid email address";
  	public static By actualInvalidEmail = By.cssSelector(".error");
  	
  	//5 invalid pass
	public static final String MessInvalidPass = "Invalid login or password";
  	public static By actualInvalidpass = By.cssSelector(".error");
  	
  	//6 forgot password
  	public static final String MessForgotPass= "Forgot password?";
  	public static By actuaForgotPass = By.cssSelector(".forgot");
}