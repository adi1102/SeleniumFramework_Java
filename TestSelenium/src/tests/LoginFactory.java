package tests;

import org.openqa.selenium.WebDriver;

import pages.LoginPageFactory;

public class LoginFactory {
	
	String email = "adimurti@gmail.test";
	String password = "Tosca1234!";
	
	public void loginTestFactory(){
	WebDriver driver = utilities.DriverFactory.open("Chrome");
	driver.get("http://demowebshop.tricentis.com/login");
	
	LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
	loginPageFactory.login(email, password);
	
	
	}

}
