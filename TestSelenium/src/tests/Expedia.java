package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Expedia {

	 WebDriver driver;
	 String browserType = "Chrome";
		@Test
		
		public void hotelReservation(){
		//1. Search 
			driver.findElement(By.id("tab-hotel-tab-hp")).click();
			driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys("");
		//2. Modify the search results criteria
			
			
		//3. Analyze the results and make our selection
			
			
	    //4. Fill contact and billing 
			
			
		//5. Get the confirmation
			
			
		}
		
		@BeforeMethod
		public void setUp(){
			driver = utilities.DriverFactory.open(browserType);
			driver.get("https://www.expedia.com/");
			driver.manage().window().maximize();
		}
		
		@AfterMethod
		public void tearDown(){
		
			driver.quit();
		
		}
		

	}

