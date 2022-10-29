package AmazonPackage;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BrowserDriver.BrowserDriver;


public class AmazonTestRunner extends BrowserDriver  {

WebDriver driver =null;

AmazonTestClass amazonTestClass =null;

	
@BeforeMethod(alwaysRun=true)
 void beforeMethod() {

}
	
public WebDriver setupChromeDriver() {
	driver = setupChromeDriver();
	amazonTestClass = new AmazonTestClass(driver);
	
	return null;
}

@Test

 void amazonTestClass() throws InterruptedException {
	driver.get("https://www.amazon.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	amazonTestClass.clickContinueButn();
	amazonTestClass.email("Email");
	amazonTestClass.title("Amazom");
	amazonTestClass.signIn("user");
	
Thread.sleep(2000);
Assert.assertEquals(driver.getTitle(), "signIn|Amazon");	
	
	
	
	
	
	
}
@AfterMethod(alwaysRun= true)	
void afterMethod () {
	driver.close();
}




}
