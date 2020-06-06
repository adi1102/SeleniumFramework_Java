package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.AccountPage;
import pages.LoginPage;

public class Login {
	
	@Test
	public void loginTestPOM(){
	WebDriver driver = utilities.DriverFactory.open("Chrome");
	driver.get("http://demowebshop.tricentis.com/login");

	LoginPage loginPage = new LoginPage(driver);
	
	loginPage.setEmail("adimurti@gmail.test");
	loginPage.setPassword("Tosca1234!");
	loginPage.clickSubmit();
	
	AccountPage accountPage =  new AccountPage(driver);
	accountPage.clickCart();
}
	
}