package com.tdd.helper.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By userName = By.id("txtUsername");
	By password = By.id("txtPassword");
	By login = By.id("btnLogin");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}

	public WebElement getUserName() {
		
		return driver.findElement(userName);
			
	}
	
public WebElement getpassword() {
		
		return driver.findElement(password);
			
	}

public WebElement getLogin() {
	
	return driver.findElement(login);
		
}
 

}
