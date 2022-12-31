package Step;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AppLogin {

	@Before
	public void setUp() {
		System.out.println("Set called and browser is launched");
	}

	@After
	public void tearDown() {
		System.out.println("TearDown called and broser is closed");

	}

	@Before("@prod")
	public void setUpProd() {
		System.out.println("setUpProd called Launch prod url");
	}

	@After("@prod")
	public void tearDownProd() {
		System.out.println("tearDownProd called and prod broser is closed");

	}

	@Given("user has launched the url")
	public void user_has_launched_the_url() {
		System.out.println("user_has_launched_the_url");
	}

	@When("user has entered the pwd and username")
	public void user_has_entered_the_pwd_and_username() {
		System.out.println("user_has_entered_the_pwd_and_username");
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		System.out.println("user_click_on_login_button");
	}

	@Then("user is logged in successfully")
	public void user_is_logged_in_success() {

	}

}
