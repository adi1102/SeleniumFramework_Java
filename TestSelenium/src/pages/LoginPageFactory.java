package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

	WebDriver driver;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement emailBox;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement passwordBox;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement loginButton;
	
	public void setEmail(String email){
		
		emailBox.sendKeys(email);
	}
	
	public void setPassword(String password){
		
		passwordBox.sendKeys(password);
	}
	
	public void clickSubmit(){
		
		loginButton.click();
	}
	
	public void login(String email, String password){
		
		setEmail(email);
		setPassword(password);
		clickSubmit();
	}
	
	//Constructor initializes the state of the driver
	public LoginPageFactory(WebDriver driver){
	
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
}
