package POMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import TestCase.CommonAction;

public class Amazonpage  {

	RemoteWebDriver driver;
	private static WebElement element = null;
	public static WebElement signin(WebDriver driver){
		element = driver.findElement(By.xpath("//span[contains(text(),'Hello,')]"));
		element.click();
		return element;
	}

	public static WebElement Userid(WebDriver driver,String Value){
		element = driver.findElement(By.name("email"));
		element.sendKeys(Value);
		return element;
	}

	public static WebElement Password(WebDriver driver,String Value){
		element = driver.findElement(By.name("password"));
		element.sendKeys(Value);
		return element;
	}


	public static WebElement continueBtn(WebDriver driver){
		element = driver.findElement(By.id("continue"));
		element.click();
		return element;
	}

	public static WebElement signInSubmit(WebDriver driver){
		element = driver.findElement(By.id("signInSubmit"));
		element.click();
		return element;
	}

	


}