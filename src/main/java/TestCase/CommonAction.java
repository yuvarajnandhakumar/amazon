package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import POMPages.Amazonpage;
import commonMethod.DataInputProvider;

public class CommonAction {
	public  RemoteWebDriver driver;
	public String dataSheetName="TC001";
	Amazonpage ap= new Amazonpage();

	@Test(dataProvider="fetchData")
	public void startApp(String uname, String pwd) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ap.signin(driver);
		Thread.sleep(2000);
		ap.Userid(driver, uname);
		ap.continueBtn(driver);
		Thread.sleep(2000);
		ap.Password(driver,pwd);
		ap.signInSubmit(driver);
		Thread.sleep(2000);
		System.out.println("amazon login completed");
	}

	
	@DataProvider(name="fetchData")
	public String[][] getData() 
	{
		return DataInputProvider.getSheet(dataSheetName);
	}	

}

