package stepDefination;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
	   System.out.println("hello");
	}

	@When("User Enter EmailID")
	public void user_enter_email_id() {
		 System.out.println("hello");
	}

	@And("User Enter password")
	public void user_enter_password() {
		 System.out.println("hello");
	}

	@And("User click on Login button")
	public void user_click_on_login_button() {
	   
	}

	@Then("User should be on HomePage")
	public void user_should_be_on_home_page() {
		 System.out.println("hello");
	}
}
