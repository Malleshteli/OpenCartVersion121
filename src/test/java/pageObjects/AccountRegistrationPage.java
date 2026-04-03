package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
		
	
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txt_Firstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txt_Lastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txt_Email;
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txt_Tel;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txt_pwd;
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txt_confirmpwd;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement btn_Agree;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btn_Continue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgconfirmation;
	
	
	public void setfname(String fname)
	{
		txt_Firstname.sendKeys(fname);
		
	}
	
	public void setlname(String lname)
	{
		txt_Lastname.sendKeys(lname);
	}
	
	public void setemail(String email)
	{
		txt_Email.sendKeys(email);
		
	}
	public void Settelephone(String tel)
	{
		txt_Tel.sendKeys(tel);
	}
	
	public void setpwd(String pwd)
	{
		txt_pwd.sendKeys(pwd);	
	}
	public void setconfirmpwd(String pwd)
	{
		txt_confirmpwd.sendKeys(pwd);
	}
	public void clickontoglebtn()
	{
		btn_Agree.click();
		
	}
	
	public void clickoncountinuebtn()
	{
		btn_Continue.click();
	}
	
	
	public String getconfirmation()
	{
	try
	{
		 return(msgconfirmation.getText());		
	}	
	catch(Exception e)
	{
		return(e.getMessage());
	}
}
	
		
}
	
	
	
