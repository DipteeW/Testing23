package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AtmStepDef {

@Given("the user inserts a valid ATM card")
public void the_user_inserts_a_valid_atm_card() {
   System.out.println("Atm card Valid");
}

@When("the user enters their PIN")
public void the_user_enters_their_pin() {
	 System.out.println("Atm card Valid");
}

@And("selects the {string} option")
public void selects_the_option(String string) {
	 System.out.println("Atm card Valid");
}

@And("enters the withdrawal amount")
public void enters_the_withdrawal_amount() {
	 System.out.println("Atm card Valid");
}

@And("confirms the transaction")
public void confirms_the_transaction() {
	 System.out.println("Atm card Valid");
}

@Then("money should be dispensed")
public void money_should_be_dispensed() {
	 System.out.println("Atm card Valid");
}
}
