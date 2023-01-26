package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	
	public static WebDriver getDriver()
	{
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://inuvest.tech/");
		//driver.manage().window().maximize();
		
		return driver;
	}
}
