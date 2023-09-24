package actionPage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import elementsPage.LoginPage_Elements;
import stepDefination.CommonActions;
//wrapper class
public class LoginPage_Actions {
	WebDriver driver;
	LoginPage_Elements lp;
		public LoginPage_Actions(CommonActions ca)
		{
			this.driver=ca.getDriver(); //new chromeDriver()
			lp= new LoginPage_Elements(driver);
		}
		public void enterCredentials(String un, String pwd)
		{
			lp.username.sendKeys(un);
			lp.pass.sendKeys(pwd);
		}
		public void clickLoginButton()
		{
			lp.loginbtn.click();
		}
}
