package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityClasses.UtilClass;

public class ScrollDown extends UtilClass{

	static WebDriver driver;
	
	@FindBy(xpath=("//img[@class='logo']"))
	private WebElement imgLogo;
	
	@FindBy(xpath=("(//button[text()=' 6 MONTHS '])[1]"))
	private WebElement months;
	
	
	
	public ScrollDown(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
			
	
	public void clickScrollDown() throws InterruptedException
	{
		imgLogo.click();
		Thread.sleep(10);
		moveToElement(driver,months);
		months.click();
		
	}
	
	
	
	
	
	
}
