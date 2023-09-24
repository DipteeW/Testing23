package stepDefination;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginF {
	WebDriver driver;
	@Given("User is on Login Web Page")
	public void user_is_on_login_web_page() {
	   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\DriverFile\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	   driver.get("https://www.facebook.com/");
	}

	@When("User Enter Email")
	public void user_enter_email() {
	   driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
	}

	@And("User Enter password Field")
	public void user_enter_password_field() {
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345");
	}

	@And("User click on Login")
	public void user_click_on_login() {
	  driver.findElement(By.xpath("//button[@name='login']")).click();
	}

	@Then("User should be on Home Page")
	public void user_should_be_on_home_page() {
	  String actValue = driver.getTitle();
	  String expValue = "Log in to Facebook";
	  Assert.assertEquals(expValue,actValue);
	}
	@And("User closes browser")
	public void user_closes_browser() {
	   driver.close();
	}
	@When("User Enter {string} as EmailID")
	public void user_enter_as_email_id(String email) {
		System.out.println(email);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email); 
		
	}

	@When("User Enter {string} password Field")
	public void user_enter_password_field(String pwd) {
		System.out.println(pwd);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(pwd);
		
	}
	@When("When User Enter credetials for email and password")
	public void when_user_enter_credetials_for_email_and_password(DataTable data) {
	List<List<String>> d = data.asLists(); 
	 //outer list --> rows
	 //inner list --> columns/cells

	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(d.get(0).get(1));
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(d.get(3).get(1));
	}
	@And("User Send Number {string}")
	public void User_Send_Number(String s)
	{
		
	}
}

