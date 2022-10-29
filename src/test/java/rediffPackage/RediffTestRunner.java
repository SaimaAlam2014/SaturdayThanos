package rediffPackage;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BrowserDriver.BrowserDriver;



public class RediffTestRunner extends BrowserDriver {
WebDriver driver = null;
RediffTestClass  rediffTestClass ; 

@BeforeMethod(alwaysRun = true)
void beforeMethod() {
	
	
}

public WebDriver setupChromeDriver() {
	driver = setupChromeDriver();
	rediffTestClass = new RediffTestClass(driver);
	return null;
}

@Test
public void rediffTestClass() throws InterruptedException {
driver.get("https://www.rediff.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
rediffTestClass.clickRediffLogo("Logo");
rediffTestClass.clicksignInButton();
rediffTestClass.shoppingCart();
rediffTestClass.vidoes();


Thread.sleep(2000);
String expectedAlertText = "Please enter vaild username";
String actualAlertText = rediffTestClass.getAlertText();
AssertJUnit.assertEquals(actualAlertText, expectedAlertText);
}
@AfterMethod(alwaysRun =true)
void afterMethod () {
	driver.close();
}


}
