package Step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoStep {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("user_is_on_login_page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("user_enters_username_and_password");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("clicks_on_login_button");
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
		System.out.println("user_is_navigated_to_homepage");
	}

	@When("^user entered [a-zA-Z]{1,} username$")
	public void user_entered_invalid_username() {
		
		System.out.println("user_entered_invalid_username : ");
	}

	@When("^user entered [a-zA-Z]{1,} password$")
	public void user_entered_invalid_password() {
		System.out.println("user_entered_invalid_password : ");
		
		
	}

}
