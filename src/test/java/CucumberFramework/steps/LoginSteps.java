package CucumberFramework.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    private WebDriver driver;


    @Given("^User Navigates to StackOverflow website$")
    public void user_Navigates_to_StackOverflow_website() throws Throwable {
        // Write code here that turns the phrase above into concrete action
        System.out.println("User Navigates to AutomationPractice website");
/*        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        String baseUrl = "http://automationpractice.com/index.php";
        driver.manage().window().maximize();
        driver.get(baseUrl);
        String expectedTitle = "My Store";
        String title = driver.getTitle();
        Assert.assertEquals(title, expectedTitle, "Expected Url is not the same with Actual URL");*/
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

    @Then("^User should be taken to the successful login page$")
    public void user_should_be_taken_to_the_successful_login_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User should be taken to the successful login page");
        //throw new PendingException();
    }



}
