package commonMethod;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
public class CommonAction{

	public static WebDriver driver;
	
	public CommonAction(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		CommonAction.driver = new ChromeDriver();
		driver=CommonAction.driver;
        PageFactory.initElements(driver, this);
       
	}
		
	public void startchrome()
	{
	driver.get("https://amazon.in");
	driver.manage().window().maximize();
	PageFactory.initElements(driver, this);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
		
	public void insertText(WebElement element, String value) {
		try{
			try{
			element.clear();
			}catch(Exception e1){
				element.sendKeys(Keys.DELETE);
			}
		}catch (Exception e) {
			
		}
		element.sendKeys(value);

	}
	
	public static void closeBrowser() {
		try {
			driver.close();
			//Reporter.addStepLogPass("Browser closed successfully");
		} catch (Exception e) {
			//Reporter.addStepLogInfo("Browser is not closed");
		}
	}
	
	
	public void click(WebElement element) {

        element.click();

	}

}
