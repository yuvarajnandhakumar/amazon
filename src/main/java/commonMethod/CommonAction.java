package commonMethod;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CommonAction{

	public static  WebDriver driver;
	
	
	public WebDriver getdriver() {
		
		return driver;
		
	}
	
	
	public CommonAction(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void startchrome()
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://amazon.in");
	driver.manage().window().maximize();
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
