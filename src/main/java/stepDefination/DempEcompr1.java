package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DempEcompr1 {
	WebDriver driver;
	@Given("the user is on the e-commerce website")
	public void the_user_is_on_the_e_commerce_website() {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\CucumberProject\\DriverFile\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.get("https://www.amazon.in/");
	}

	@When("the user adds a product to the cart")
	public void the_user_adds_a_product_to_the_cart() {
	   driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("mobiles",Keys.ENTER);
	   
	   driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	}

	@Then("the cart should contain the product")
	public void the_cart_should_contain_the_product() {
	  System.out.println(driver.getTitle());
	}

	@Given("the user has items in the cart")
	public void the_user_has_items_in_the_cart() {
	  System.out.println("Item in Cart");
	}

	@When("the user proceeds to checkout")
	public void the_user_proceeds_to_checkout() {
	    driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();
	}

	@Then("the user should receive a confirmation email")
	public void the_user_should_receive_a_confirmation_email() {
	   System.out.println("confirmation Email");
	}
}
