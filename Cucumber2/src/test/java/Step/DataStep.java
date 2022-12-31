package Step;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DataStep {

	@Given("user has loaded the data")
	public void user_has_loaded_the_data() {

		System.out.println("user_has_loaded_the_data");

	}

	@Then("user should be logged in")
	public void user_should_be_logged_in() {
		System.out.println("user_should_be_logged_in");
	}

	@Then("user select the category")
	public void user_select_the_category(DataTable table) {

		List<Map<String, String>> data = table.asMaps(String.class, String.class);
		
		System.out.println("user_select_the_category "+data.get(0).get("Age"));
		
		System.out.println("user_select_the_category "+data.get(1).get("Age"));
		
		System.out.println("user_select_the_category "+data.get(2).get("Age"));
		System.out.println("user_select_the_category "+data.get(3).get("Age"));
		//System.out.println("user_select_the_category "+data.get(4).get("Age"));
		
	}

}
