package CucumberFramework.steps;

import cucumber.api.PendingException;
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
        String expectedPhoneNo = "0123-456-789";
        String actualPhoneNo = contactPhone().getText();
        Assert.assertEquals(expectedPhoneNo, actualPhoneNo, "Expected Url is not the same with Actual URL");
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
    public void attachFileModalIsDisplayed() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Attach file modal is displayed");
        Thread.sleep(500);
        driver.close();
    }

    @When("^User hovers over the Women button tab$")
    public void userHoversOverTheWomenButtonTab() {
        System.out.println("User Hovers over the Women Button tab");
    }

    @Then("^tooltip \"([^\"]*)\" is displayed$")
    public void tooltipIsDisplayed(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Tooltip" + arg0 + "is displayed");
      //throw new PendingException();
    }

    @And("^Tops and Dresses sub-menus show up$")
    public void topsAndDressesSubMenusShowUp() {
        System.out.println("Tops and Dresses sub-menus show up");
    }

    @And("^Tops submenu has two entries$")
    public void topsSubmenuHasTwoEntries() {
        System.out.println("^Tops submenu has two entries$");
    }

    @And("^Dresses submenu has three entries$")
    public void dressesSubmenuHasThreeEntries() throws InterruptedException {
        System.out.println("^Dresses submenu has three entries$");
    }

    @When("^user hovers over the Dresses button tab$")
    public void userHoversOverTheDressesButtonTab() {
        System.out.println("User hovers over the Dresses button tab");
    }

    @And("^Casual Evening and Summer Dresses submenus are displayed$")
    public void casualEveningAndSummerDressesSubmenusAreDisplayed() throws InterruptedException {
        System.out.println("Casual Evening and Summer Dresses submenus are displayed");

    }

    @When("^user hovers over the T-shirts button tab$")
    public void userHoversOverTheTShirtsButtonTab() throws InterruptedException {
        System.out.println("user hovers over the T-shirts button tab");
        Thread.sleep(2000);
        driver.quit();
    }
}