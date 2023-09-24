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

public class NopCommerce {
	WebDriver driver;
	@Given("User is on the Login Page")
	public void user_is_on_the_login_page() {
	  driver=new ChromeDriver(); 
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	  driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}

	@When("User enter EmailID")
	public void user_enter_email_id() {
	    driver.findElement(By.xpath("//input[@class='email valid']")).sendKeys("admin@yourstore.com");
	}

	@And("User Enter the password")
	public void user_enter_the_password() {
	   driver.findElement(By.xpath("//input[@class='password valid']")).sendKeys("admin");
	}

	@And("User click Login button")
	public void user_click_login_button() {
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("User should on the DashBoard")
	public void user_should_on_the_dash_board() {
		String actText = driver.getTitle();
		String expText = "Dashboard";
		Assert.assertEquals(expText, actText);
	}

}
