package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {

WebDriver driver;
	
	public void clickCart(){
		
		driver.findElement(By.linkText("Shopping cart")).click();
	}
	
	//Constructor initializes the state of the driver
	public AccountPage(WebDriver driver){
	
		this.driver = driver;
				
	}
	
	
}
