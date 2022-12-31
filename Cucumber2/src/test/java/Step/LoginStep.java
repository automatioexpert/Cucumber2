package Step;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

	@Before
	public void setUp() {
		System.out.println("Launch the browser");
	}

	@After
	public void tearDown() {
		System.out.println("Closing the browser");
	}

	@Given("user navigates to gmail login page")
	public void user_navigates_to_gmail_login_page() {
	}

	@When("user validates the homepage title")
	public void user_validates_the_homepage_title() {
	}

	@Then("user entered {string} username")
	public void user_entered_username(String string) {
	}

	@Then("user entered {string} password")
	public void user_entered_password(String string) {

		System.out.println("pwd: " + string);
	}

	@Then("user select the age category")
	public void user_select_the_age_category(io.cucumber.datatable.DataTable dataTable) {

	}

	@Then("user {string} successfully logged in")
	public void user_successfully_logged_in(String string) {
	}

}
