/*package Scenario;

import POMPages.Amazonpage;
import commonMethod.CommonAction;

public class AmazonMethods extends CommonAction{
	CommonAction ca = new CommonAction();
	Amazonpage ap= new Amazonpage();

	public void Login() throws InterruptedException {
		startchrome();
		ap.getSignin().click();
		ca.click(ap.getSignin());
		Thread.sleep(2000);
		ca.insertText(ap.getUserid(),"yuvarajsrec4@gmail.com");
		ca.click(ap.getContinueBtn());
		Thread.sleep(2000);
		ca.insertText(ap.getPwd(), "B@positive5");
		ca.click(ap.getSignInSubmit());		
		Thread.sleep(2000);
		System.out.println("amazon login completed");
	}
	
	public static void main(String[] args) throws InterruptedException {
		AmazonMethods a=new AmazonMethods();
		a.Login();
	}

}
*/