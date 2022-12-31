package Step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class readStep {

	@Given("user loads the source document")
	public void user_loads_the_source_document() {
		System.out.println("user_loads_the_source_document");
	}

	@When("user downloads the file")
	public void user_downloads_the_file() {
		System.out.println("user_downloads_the_file");
	}

	@Then("check for data entry")
	public void check_for_data_entry() {
		System.out.println("check_for_data_entry");

	}

	@Then("check for size of the file")
	public void check_for_size_of_the_file() {
		System.out.println("check_for_size_of_the_file");
	}

}
