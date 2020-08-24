package TestCase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import POMPages.Amazonpage;
import commonMethod.CommonAction;
import commonMethod.DataInputProvider;

public class AmazonTest extends Amazonpage{

	public AmazonTest(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	public String dataSheetName="TC001";
	

	@Test
	public void AmazonLogin() throws InterruptedException {

		startchrome();
		getSignin();
		//driver.findElement(By.xpath("//span[contains(text(),'Hello,')]")).click();
		//ca.click(ap.getSignin());
		Thread.sleep(2000);
		//ca.insertText(ap.getUserid(),"dd");
		//ca.click(ap.getContinueBtn());
		Thread.sleep(2000);
		//ca.insertText(ap.getPwd(), "ss");
		//ca.click(ap.getSignInSubmit());		
		Thread.sleep(2000);
		System.out.println("amazon login completed");

		//mobile search
		//click

		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='a-section a-spacing-none']/h2"));
		for (WebElement webElement : findElements) 
		{
			String text = webElement.getText();
			System.out.println(text);
		}
		driver.quit();
	}


	@DataProvider(name="fetchData")
	public String[][] getData() 
	{
		return DataInputProvider.getSheet(dataSheetName);
	}	

}

