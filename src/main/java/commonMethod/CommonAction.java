package commonMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
public class CommonAction{

	public static WebDriver driver;

	/*public CommonAction(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		CommonAction.driver = new ChromeDriver();
		driver=CommonAction.driver;
		PageFactory.initElements(driver, this);

	}*/

	public void startchrome()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		CommonAction.driver = new ChromeDriver();
		driver=CommonAction.driver;
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
		} catch (Exception e) {
		}
	}


	public void click(WebElement element) {
		element.click();
	}
	
	public String getproperty(String value) throws FileNotFoundException, IOException
	{
		Properties prp= new Properties();
		prp.load(new FileInputStream(new File(".//TestData//amazon.properties")));
		String property = prp.getProperty(value);
		return property;
	}
	
	

	public void selectFromDrpValue(WebElement element , String value){
		try{
			
			Select selectObject = new Select(element);
			selectObject.selectByVisibleText(value);
			
		}catch(Exception e){
			System.out.println("Cant able to getText of " + value + "\n\n" + "ERROR MESSAGE :: " + e.toString());
		}
	}
}
