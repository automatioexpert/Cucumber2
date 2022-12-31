package Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CarSearchStep {
	public static WebDriver driver;

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@After
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed())
		driver.quit();

	}

	@When("I move to Car for sale menu")
	public void i_move_to_car_for_sale_menu() {
		driver.get("https://www.carwale.com/");
		WebElement newCars = driver.findElement(By.xpath("//div[contains(text(),'NEW CARS')]"));
		Actions act = new Actions(driver);
		act.moveToElement(newCars).build().perform();
		
	}

	@Then("I click on search cars")
	public void i_click_on_search_cars() {

	}

	@Then("I select make as BMW")
	public void i_select_make_as_bmw() {

	}
}
