package rediffPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffTestClass {
	WebDriver driver = null;

public RediffTestClass(WebDriver driver) {
	this.driver = driver;
	}
public void clicksignInButton()	{
	WebElement signInButton = driver.findElement(By.className("//*[@class=\"sign\""));
	signInButton.click();
}
	public void clickRediffLogo (String logo) {
		WebElement redifflogo = driver.findElement(By.className("/*[@class=\"hmsprite logo\"]"));
		redifflogo.click();
	}

	public void shoppingCart() {
		WebElement shopingcart = driver.findElement(By.className("/*[@class=\"shopicon relative\"]"));
		shopingcart.click();
	}
	
	public void vidoes() {
		WebElement vidoes = driver.findElement(By.className("//*[@class=\"vdicon\"]"));
	vidoes.click();
	}
	public void businessEmail() {
		WebElement businessEmail = driver.findElement(By.className("//*[@class=\"bmailicon relative\"]"));
businessEmail.click();
	}
	
	public String getAlertText() {
		Alert alert =driver.switchTo().alert();
	String alertText = alert.getText();
	alert.accept();
	return alertText;
	}
}
