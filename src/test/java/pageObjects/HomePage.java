package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {

		super(driver);
	}

	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement linkmyaccount;
	
	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement linkregister;
	
	//@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Login']")
	@FindBy(xpath="(//a[text()='Login'])[1]")
	WebElement linklogin;
	
	@FindBy(linkText="Login")
	WebElement  btn_login1;
	
	public void clickmyaccount() {
		
		 linkmyaccount.click();
	}

	public void clickregister() {
		
		linkregister.click();
	}
	public void clicklogintest()
	{
		linklogin.click();
	}
}

