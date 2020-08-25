package POMPages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethod.CommonAction;

public class LoginPage extends CommonAction {
	public LoginPage()
	{
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[contains(text(),'Hello,')]")
	private WebElement signin;

	@FindBy(name = "email")
	private WebElement userid;

	@FindBy(name = "password")
	private WebElement pwd;

	@FindBy(id = "continue")
	private WebElement continueBtn;

	@FindBy(id = "signInSubmit")
	private WebElement signInSubmit;

	
	
	public void signinaction() {
		click(signin);
	}

	
	public void getUserid() throws FileNotFoundException, IOException {
		insertText(userid, getproperty("username")); 
	}

	public void getPwd() throws FileNotFoundException, IOException {
		insertText(pwd,getproperty("password"));
	}

	public void getContinueBtn() {
		click(continueBtn);
	}

	public void getSignInSubmit() {
		click(signInSubmit);
	}
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchValue;
	
	
	public void drpvalue()
	{
		String text = searchValue.getText();
		System.out.println(text);
	}

}