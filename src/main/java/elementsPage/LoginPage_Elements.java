package elementsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Elements {
	WebDriver driver;
	 @FindBy(xpath = "//input[@name='username']") public WebElement username;
	  @FindBy(xpath ="//input[@name='password']") public WebElement pass;
	  @FindBy(xpath="//button[@type='submit']") public WebElement loginbtn;
	//WebElement email=driver.findElement(By.xpath("xpath value")),
	public LoginPage_Elements(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
