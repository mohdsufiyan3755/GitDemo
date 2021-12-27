package co.tdd.helper.testcases;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tdd.helper.base.base;
import com.tdd.helper.pageobjects.LandingPage;

public class HomePage extends base{
	public static Logger log= LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		
		driver = initializeDriver();
		log.info("Driver is initialized");
		
		driver.get(prop.getProperty("url"));
		log.info("URL is activated");
		
	}
	
	@Test
	public void loginPage() throws IOException {
		
		String userid= prop.getProperty("admin_user");
		String passcode= prop.getProperty("admin_password");
		
		LandingPage l = new LandingPage(driver);
		l.getUserName().sendKeys(userid);
		l.getpassword().sendKeys(passcode);
		l.getLogin().click();
		log.info("Page Login is successful");
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	

}
