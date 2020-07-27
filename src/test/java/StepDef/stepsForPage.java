package StepDef;

import org.openqa.selenium.support.ui.WebDriverWait;


import PageObject.page1;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.TestBase;

public class stepsForPage extends TestBase{
	
	public page1 page;
	
	@Given("^launch browser and open site \"([^\"]*)\"$")
	public void launch_browser_and_open_site(String arg1) throws Throwable {
		launch(arg1);
		wait=new WebDriverWait(driver, 30);
		
		page=new page1(driver, wait);
	    
	}

	@When("^user clicks on flights$")
	public void user_clicks_on_flights() throws Throwable {
	    page.Click_Flight();
	}

	@Then("^enter San Jose and India$")
	public void enter_San_Jose_and_India() throws Throwable {
	    page.Click_OriginAndDestination();
	}

	@Then("^enter /(\\d+)/(\\d+) and (\\d+)/(\\d+)$")
	public void enter_and(int arg1, int arg2, int arg3, int arg4) throws Throwable {
	    page.enterDates();
	}

	@Then("^click on search$")
	public void click_on_search() throws Throwable {
	    page.search();
	    
	    page.validate();
	    quit();
	}



}
