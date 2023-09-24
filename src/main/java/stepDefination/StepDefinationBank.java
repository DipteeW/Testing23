package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationBank {
	@Given("the user is on the bank login page")
	public void the_user_is_on_the_bank_login_page() {
	   System.out.println("bank login");
	}

	@When("the user enters valid credentials")
	public void the_user_enters_valid_credentials() {
		 System.out.println("bank login");
	}

	@And("clicks the login button")
	public void clicks_the_login_button() {
		 System.out.println("bank login");
	}

	@Then("the user should be logged into their account")
	public void the_user_should_be_logged_into_their_account() {
		 System.out.println("bank login");
	}
}
