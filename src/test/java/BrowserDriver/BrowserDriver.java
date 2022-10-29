package BrowserDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserDriver{
public  WebDriver chromeDriver;
public  WebDriver setupChromeDriver() {
	WebDriverManager.chromedriver().setup();
	WebDriver  driver = new ChromeDriver();
	return driver;
}
}
	
	
		
	


