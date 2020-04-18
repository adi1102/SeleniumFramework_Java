package tests;

import java.awt.Window;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Expedia {

	 WebDriver driver;
	 String browserType = "Chrome";
	 String city = "Chicago";
	 String checkIn = "10/02/2020";
	 String checkOut = "10/08/2020";
	 
		@Test
		
		public void hotelReservation(){
		//1. Search 
			driver.findElement(By.id("tab-hotel-tab-hp")).click();
			driver.findElement(By.id("hotel-destination-hp-hotel")).clear();
			driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys(city);
			driver.findElement(By.id("hotel-checkin-hp-hotel")).clear();
			driver.findElement(By.id("hotel-checkin-hp-hotel")).sendKeys(checkIn);
			driver.findElement(By.id("hotel-checkout-hp-hotel")).clear();
			driver.findElement(By.id("hotel-checkout-hp-hotel")).clear();			
			driver.findElement(By.id("hotel-checkout-hp-hotel")).sendKeys(checkOut);
			driver.findElement(By.xpath("//*[@id='gcw-hotel-form-hp-hotel']/div[13]/label/button")).click();
			//driver.findElement(By.id("hotel-checkin-hp-hotel"))
			//new Select (driver.findElement(By.xpath("//*[@id='traveler-selector-hp-hotel]/div/ul/li/button"))).selectByValue("2");
			
			//*[@id="traveler-selector-hp-hotel"]/div/ul/li/button
			
			//2. Modify the search results criteria
			//driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div/div[1]/div[1]/main/div[2]/div/div[1]/section/form/fieldset[5]/div/div/div[4]/label/span[1]")).click();
			//driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div/div[1]/div[1]/main/div[2]/div/div[1]/section/form/fieldset[7]/div/div/div[4]/label/span[1]")).click();
			//driver.findElement(By.cssSelector("input[id = 'star-4']")).click();
			//driver.findElement(By.partialLinkText("4")).click();
					
			  
			driver.findElement(By.cssSelector("input[id='price-1-1'][value='1']")).click();

			//3. Analyze the results and make our selection
			//driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div/div[1]/div[1]/main/div[2]/section[2]/ol/li[3]/div/div/a")).click();
			//driver.findElement(By.xpath("//*[@id="app"]/div[1]/div/div/div[1]/div[1]/main/div[2]/section[2]/ol/li[3]/div/div/a"))
			  driver.findElement(By.xpath("//*[@class='results']/ol/li[3]/div/div/a")).click();
			  
			//Switch windows 
			
			ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(windows.get(1));

			//Print Hotel Name
			
			String hotelName=driver.findElement(By.className("uitk-cell all-cell-shrink uitk-type-heading-600 all-b-padding-half")).getText();
			System.out.println("Hotel Name :" +hotelName);
			  
	    //4. Fill contact and billing 
			
			
		//5. Get the confirmation
			
	
		}
		
		@BeforeMethod
		public void setUp(){
			driver = utilities.DriverFactory.open(browserType);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.expedia.com/");
			driver.manage().window().maximize();
		}
		
		@AfterMethod
		public void tearDown(){
		
			//driver.quit();
		
		}
		

	}

