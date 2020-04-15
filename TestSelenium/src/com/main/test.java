package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Applications\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("adi.911@outlook.com");
		driver.findElement(By.name("pass")).sendKeys("");
		driver.findElement(By.linkText("Forgotten account?")).click();
		//driver.close();
	}

}
