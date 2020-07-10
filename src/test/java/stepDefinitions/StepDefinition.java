package stepDefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition {

    @Given("^user is on netbanking login page$")
    public void user_is_on_netbanking_login_page()throws Throwable  {
      System.out.println("user is on netbanking login page");
    }

    @When("^user logs into application with username and password$")
    public void user_logs_into_application_with_username_and_password() throws Throwable {
    	 System.out.println("user logs into application with username and password");
    }

    @Then("^home page is displayed$")
    public void home_page_is_displayed() throws Throwable {
    	 System.out.println("home page is displayed");
    }

    @And("^card details are displayed$")
    public void card_details_are_displayed() throws Throwable {
    	 System.out.println("card details are displayed");
    }

}