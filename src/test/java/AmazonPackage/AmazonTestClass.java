package AmazonPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTestClass {
	
	WebDriver driver =null;
	
	public AmazonTestClass(WebDriver driver) {
		this.driver = driver;
	}
	
	public void title(String Title) {
		WebElement title = driver.findElement(By.className("//*[@class=\"a-icon a-icon-logo\"]"));
		title.click();
	}
	
	
	 public void signIn (String userID) {
	WebElement signIn = driver.findElement(By.partialLinkText("//*[@id=\"nav-link-accountList\"]"));
     signIn.click();
}
	
	public void email (String Email) {
		WebElement email =driver.findElement(By.id("//*[@id=\"ap_email\"]"));
		email.sendKeys(Email);
	}
	
	public void clickContinueButn () {
		WebElement clickContinueButn = driver.findElement(By.className("//*[id=\"continue\"]"));
		clickContinueButn.click();
	}
	

}
