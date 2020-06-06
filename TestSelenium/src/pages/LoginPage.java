package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public void setEmail(String email){
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
	}
	
	public void setPassword(String password){
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
	}
	
	public void clickSubmit(){
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	//Constructor initializes the state of the driver
	public LoginPage(WebDriver driver){
	
		this.driver = driver;
				
	}

}
