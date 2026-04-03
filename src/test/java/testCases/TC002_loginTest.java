package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_loginTest extends BaseClass {
	
	
	@Test
	public void verify_login()
	{
		
		logger.info("***** Start TC002 LoginTest Execution ****");
		// Home Page
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickmyaccount();
		hp.clicklogintest();
		
		//LoginPage
		logger.info(" start Login Page test");
		LoginPage lp=new LoginPage(driver);
		lp.setemail(p.getProperty("email"));
		lp.setpassword(p.getProperty("password"));
		lp.clicklogin();
		
		// my account page
		
		MyAccountPage mcc=new MyAccountPage(driver);
		boolean targetpage=mcc.isMyaccountPageExites();
		 Assert.assertEquals(targetpage, true,"test faild");
		 Assert.assertTrue(targetpage);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("Login test Finished");
	}
	

}
