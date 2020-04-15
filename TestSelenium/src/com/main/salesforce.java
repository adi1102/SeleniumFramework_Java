package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Applications\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://login.salesforce.com//?locale=in");
		driver.findElement(By.id("username")).sendKeys("adi.911@outlook.com");
		driver.findElement(By.name("pw")).sendKeys("dsada");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		//driver.close();
	}
	
}
//*[@id="username"]
//*[@id="password"]
//*[@id="Login"]
//*[@id="forgot_password_link"]