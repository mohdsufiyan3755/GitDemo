package com.tdd.helper.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\SelfProject\\src\\main\\java\\com\\tdd\\helper\\config\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Work\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")){
			//for firefox driver
			
		}
		else if(browserName.equals("IE")) {
			//for IE driver
			
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
		
	}

}
