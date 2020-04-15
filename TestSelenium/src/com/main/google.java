package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Applications\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenium");
		//driver.findElement(By.xpath("//*[@class='RNNXgb']/div/div[2]/input")).sendKeys("Selenium");
		//driver.findElement(By.cssSelector("input#fakebox-input")).sendKeys("test");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Aditya Murti");
		//driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//*[@name = 'btnK']")).click();

		

	}
	//*[@id="fakebox-input"]
	//html/body/div[4]/div[2]/div/input
	//*[@id="tsf"]/div[2]/div[1]/div[1]/div/div[2]/input
	//*[@id="tsf"]/div[2]/div[1]/div[1]/div/div[2]/input
	//*[@class='RNNXgb']/div/div[2]/input
}

/*

//*[@id="tsf"]/div[2]/div[1]/div[1]/div/div[2]/input
/html/body/div/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input
*/