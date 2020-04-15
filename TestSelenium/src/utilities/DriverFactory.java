package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

		// TODO Auto-generated method stub
		
		public static WebDriver open (String browserType){
			
			if (browserType.equalsIgnoreCase("Chrome")){
				
				System.setProperty("webdriver.chrome.driver", "C:\\Applications\\chromedriver_win32\\chromedriver.exe");
				return new ChromeDriver();
				
			}
			else {
				
				System.setProperty("webdriver.gecko.driver", "C:\\Applications\\chromedriver_win32\\geckodriver.exe");
				return new FirefoxDriver();
				}
			
		}
	}

