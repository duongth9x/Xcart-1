package common;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import common.until;


public class OpenBrowser {
	
	public static void multi_browser(String browser) throws Exception{
		//Firefox
		if (browser.equalsIgnoreCase("firefox")) {
			until.driver = new FirefoxDriver();
			until.driver.manage().window().maximize();
		//Chrome	
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", common.until.CHROME_DRIVER);
			until.driver = new ChromeDriver();	
			until.driver.manage().window().maximize();
		//CocCoc	
		} else if (browser.equalsIgnoreCase("coccoc")) {
			System.setProperty("webdriver.chrome.driver",common.until.CHROME_DRIVER);			
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			options.setBinary(until.COCCOC_PATH);
			until.driver = new ChromeDriver(options);					
		//IE	
		} else if (browser.equalsIgnoreCase("ie")) {
			 System.setProperty("webdriver.ie.driver", common.until.IE_PATH);			  
			  
			  DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			  caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			  caps.setCapability("nativeEvents",false);
			  until.driver = new InternetExplorerDriver(caps);			  			  
			  until.driver.manage().window().maximize();
		//Other	
		} else {
			throw new IllegalArgumentException("The Browser Type is undefined");
		}		
		until.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);				
	}	
}