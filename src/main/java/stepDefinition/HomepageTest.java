package stepDefinition;

import cucumber.api.java.en.*;
import pageObjects.HomepageObjects;
import utility.BasePage;

public class HomepageTest {
	BasePage bp;
	HomepageObjects hp;
	
	public HomepageTest() {
		hp = new HomepageObjects();
	}
	
	@Given("^Launch the application$")
	public void launch_the_application() throws Throwable {
	    bp= new BasePage();
	}

	@When("^Women Dresses and T-shirt tabs are present in homepage$")
	public void women_Dresses_and_T_shirt_tabs_are_present_in_homepage() throws Throwable {
	    hp.verifyitems();
	}

	@Then("^Verify the tabs$")
	public void verify_the_tabs() throws Throwable {
	   hp.verifyitems();
	   System.out.println("Test");
	}

}
