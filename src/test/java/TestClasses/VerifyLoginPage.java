package TestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import PomClasses.LoginPage;
import PomClasses.ScrollDown;
import UtilityClasses.UtilClass;



public class VerifyLoginPage{
	
	static WebDriver driver;
	LoginPage lp;
	ScrollDown sd;
	
	@BeforeClass
	public void beforeClass()
	{
         driver = BaseClass.getDriver();
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		lp = new LoginPage(driver);
		sd = new ScrollDown(driver);
	}
	
	@Test 
	public void verifyLoginPage() throws InterruptedException
	{
		lp.clickLoginButton();
		Thread.sleep(10);
		lp.clickEmailFeild();
		Thread.sleep(10);
		lp.clickPassword();
		lp.clickLogin();
		Thread.sleep(10);
		driver.navigate().back();
		Thread.sleep(10);
	}
	
	@Test
	public void scrollDown() throws InterruptedException
	{
		Thread.sleep(10);
		sd.clickScrollDown();
	}

	@AfterMethod
	public void afterMethod()
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
