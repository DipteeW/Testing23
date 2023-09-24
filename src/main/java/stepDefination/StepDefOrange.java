package stepDefination;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefOrange {
	WebDriver driver;
	@Given("User is on LoginPage")
	public void user_is_on_login_page() {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//DriverFile//chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("User Enter Username")
	public void user_enter_username() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	}

	@When("User Enter passwordField")
	public void user_enter_password_field() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	}

	@When("User click on Loginbutton")
	public void user_click_on_loginbutton() {
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("User should be on Dashboard")
	public void user_should_be_on_dashboard() {
	String actText = driver.getTitle();
	String expText = "OrangeHRM";
	Assert.assertEquals(expText, actText);
	
	}
}
