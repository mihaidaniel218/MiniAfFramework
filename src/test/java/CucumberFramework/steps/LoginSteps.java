package CucumberFramework.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

    @Given("^User Navigates to StackOverflow website$")
    public void user_Navigates_to_StackOverflow_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User Navigates to StackOverflow website");
        //throw new PendingException();
    }

    @And("^User clicks on the login link$")
    public void user_clicks_on_the_login_link() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User clicks on the login link");
        //throw new PendingException();
    }

    @And("^User enters a valid username$")
    public void user_enters_a_valid_username() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User enters a valid username");
        //throw new PendingException();
    }

    @And("^User enters a valid password$")
    public void user_enters_a_valid_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User enters a valid password");
       //throw new PendingException();
    }

    @When("^User clicks on the login button$")
    public void user_clicks_on_the_login_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User clicks on the login button");
        //throw new PendingException();
    }

    @Then("^User should be taken to the succesfull login page$")
    public void user_should_be_taken_to_the_succesfull_login_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User should be taken to the succesfull login page");
        //throw new PendingException();
    }



}
