package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {

	@Test
	public void verify_account_registration() throws InterruptedException {
		
		logger.info("**** Starting Excution****");
		try
		{
		HomePage hp = new HomePage(driver);
		hp.clickmyaccount();
		logger.info("Click my account......");
		hp.clickregister();
		logger.info("Click my Registration......");
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		
		logger.info("provide the customer details......");
		regpage.setfname(randomString().toUpperCase());
		regpage.setlname(randomString().toUpperCase());
		regpage.setemail(randomString()+"@gmail.com");
		regpage.Settelephone(randomString());
		
		String password=randomalphanumaric();
		
		regpage.setpwd(password);
		regpage.setconfirmpwd(password);
		regpage.clickontoglebtn();
		regpage.clickoncountinuebtn();
		
		String conmsg=regpage.getconfirmation();
		if (conmsg.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Test case Field...");
			logger.debug("debug log...");
			Assert.assertTrue(false);
			
		}
		//Assert.assertEquals(conmsg, "Your Account Has Been Created!!!");
		}
		catch(Exception e)
		{
			
			Assert.fail();
		}
		
		logger.info("**** test excution Finished ***");
	}

}
