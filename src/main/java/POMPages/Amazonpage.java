package POMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestCase.AmazonTest;
import commonMethod.CommonAction;


public class Amazonpage  extends AmazonTest{


	 public Amazonpage(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	        this.driver = driver;
	    }

	@FindBy(xpath="//span[contains(text(),'Hello,')]")
	private WebElement signin;

	@FindBy(name="email")
	private WebElement userid;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(id="continue")
	private WebElement continueBtn;
	
	@FindBy(id="signInSubmit")
	private WebElement signInSubmit;

	public void signinaction() {
		signin.click();
    }
	
	public WebElement getSignin() {
		return signin;
	}

	public WebElement getUserid() {
		return userid;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getSignInSubmit() {
		return signInSubmit;
	}
		
	
}