package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityClasses.UtilClass;

public class LoginPage extends UtilClass{

	static WebDriver driver;
	
	@FindBy(xpath=("//a[@class='button login']"))
	private WebElement loginButton;
	
	@FindBy(xpath=("//input[@type='text']"))
	private WebElement emailFeild;
	
	@FindBy(xpath=("//input[@type='Password']"))
	private WebElement password;
	
	@FindBy(xpath=("//button[@class='btn btn-primary btn-login']"))
	private WebElement login;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
	
	public void clickEmailFeild()
	{
		explicitWait(driver,emailFeild,5);
		emailFeild.click();
		emailFeild.sendKeys("testprofile@inuvest.tech");
	}
	
	public void clickPassword()
	{
		password.sendKeys("Internshala@123");
	}
	
	public void clickLogin()
	{
		login.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
