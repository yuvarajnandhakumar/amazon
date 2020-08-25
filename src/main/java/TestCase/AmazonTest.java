package TestCase;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import POMPages.search;
import Scenario.Loginmethod;
import Scenario.SearchMethod;
import commonMethod.CommonAction;

public class AmazonTest {

	WebDriver driver;
	Loginmethod ll ;
	CommonAction ca;
	search ss;
	SearchMethod si;
		
	@BeforeSuite
	public void browser()
	{
		ca=new CommonAction();
		ca.startchrome();
		ll=new Loginmethod();
		ss= new search();
		si=new SearchMethod();
	}
	
	@Test
	public void Loginfunction() throws FileNotFoundException, IOException, InterruptedException
	{
		ll.Login();
		si.SearchItems();
		
	}
}
