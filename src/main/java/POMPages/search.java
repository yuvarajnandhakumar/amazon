package POMPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethod.CommonAction;

public class search extends CommonAction{

	public search()
	{
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='nav-logo-link']")
	private WebElement Logo;

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchValue;

	@FindBy(xpath="//input[@value='Go']")
	private WebElement search;

	@FindBy(xpath="//div[@id='nav-search-dropdown-card']//select")
	private WebElement drpValue;

	@FindBy(xpath="//div[@id='nav-subnav']//span[normalize-space()='Make-up & Nails']")
	private WebElement subMenu;

	@FindBy(xpath="//h2[text()='Shop by category']/../following-sibling::div//li//a[text()='Lips']")
	private WebElement subCategory;

	@FindBy(xpath="//span[text()='Featured categories']/../following-sibling::div//div/span[text()='Lipsticks']")
	private WebElement product;


	String btn_login ="xpath-//input[]";

	
	public void searchText(){
		try {		
			insertText(searchValue, "Mobile");
			click(search);			
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void searchByDrpValue() throws InterruptedException{		
		try{			
			selectFromDrpValue(drpValue, getproperty("select"));
			click(search);				
		}catch (Exception e) {
			e.getMessage();
		}
		Thread.sleep(3000);
	}

	public void selectSubCategories(){	
		click(subMenu);
		click(subCategory);
		click(product);
	}

	public void selectItemsFromList(){
		try {
			List<WebElement> value = driver.findElements(By.xpath("//span[normalize-space()='Best sellers']/../following-sibling::div//li"));
			value.indexOf(1);		
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
