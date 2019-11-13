package CucumberFramework.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomepageUITest {

    @Given("^User Navigates to Automationpractice HomePage$")
    public void userNavigatesToAutomationpracticeHomePage() {
        System.out.println("User Navigates to Automationpractice HomePage");
    }

    @Then("^MyStore logo is displayed$")
    public void mystoreLogoIsDisplayed() {
        System.out.println("MyStore logo is displayed");
    }

    @And("^Blockbanner offer is displayed$")
    public void blockbannerOfferIsDisplayed() {
        System.out.println("Blockbanner offer is displayed");
    }

    @And("^Contact phone number is correct$")
    public void contactPhoneNumberIsCorrect() {
        System.out.println("Contact Phone Number is correct");
    }

    @When("^User clicks on the Contact us link$")
    public void userClicksOnTheContactUsLink() {
        System.out.println("User clicks on the Contact us link");
    }

    @Then("^Customer service modal is displayed$")
    public void customerServiceModalIsDisplayed() {
        System.out.println("Customer service modal is displayed$");
    }

    @And("^Subject Heading dropdown is displayed$")
    public void subjectHeadingDropdownIsDisplayed() {
        System.out.println("Subject Heading dropdown is displayed");
    }


    @And("^User's Email adress is displayed correctly$")
    public void userSEmailAdressIsDisplayedCorrectly() {
        System.out.println("User's Email address is displayed correctly");
    }

    @And("^Order reference dropdown is displayed$")
    public void orderReferenceDropdownIsDisplayed() {
        System.out.println("Order reference dropdown is displayed");
    }


    @And("^Attach file modal is displayed$")
    public void attachFileModalIsDisplayed() {
        System.out.println("Attach file modal is displayed");
    }
}
