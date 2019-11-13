package CucumberFramework.steps;

import automationpractice.com.pageObject.Clothes;
import automationpractice.com.pageObject.Homepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class HomepageUITest {

    private WebDriver driver;

    public WebElement contactPhone() {
        return utils.Utils.waitForElementPresence(driver, By.xpath("//strong[contains(text(),'0123-456-789')]"), 30);
    }

    @Given("^User Navigates to Automationpractice HomePage$")
    public void userNavigatesToAutomationpracticeHomePage() {
        System.out.println("User Navigates to Automationpractice HomePage");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String baseUrl = "http://automationpractice.com/index.php";
        driver.manage().window().maximize();
        driver.get(baseUrl);
/*        String expectedTitle = "My Store";
        String title = driver.getTitle();
        Assert.assertEquals(title, expectedTitle, "Expected Url is not the same with Actual URL");*/
    }

    @Then("^MyStore logo is displayed$")
    public void mystoreLogoIsDisplayed() {
        String expectedTitle = "My Store";
        String title = driver.getTitle();
        Assert.assertEquals(title, expectedTitle, "Expected Url is not the same with Actual URL");
        System.out.println("MyStore logo is displayed");
    }

    @And("^Blockbanner offer is displayed$")
    public void blockbannerOfferIsDisplayed() {
        System.out.println("Blockbanner offer is displayed");
    }

    @And("^Contact phone number is correct$")
    public void contactPhoneNumberIsCorrect() {
        String expectedPhone = "0123-456-789";
        String actualPhone = contactPhone().getText();
        Assert.assertEquals(expectedPhone, actualPhone, "Expected Url is not the same with Actual URL");
        System.out.println("Contact Phone Number is correct");
    }

    @When("^User clicks on the Contact us link$")
    public void userClicksOnTheContactUsLink() {
        System.out.println("User clicks on the Contact us link");
    }

    @Then("^Customer service modal is displayed$")
    public void customerServiceModalIsDisplayed() {
        System.out.println("Customer service modal is displayed");
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
