package automationpractice.com;

import automationpractice.com.pageObject.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateAccountFormTest {
    private WebDriver driver;

    private Homepage homepage;
    private CreateAccount createAccount;
    private CreateAccountForm createAccountForm;
    private SignInForm signIn;
    private Account account;


    @BeforeClass
    public void setup() {
    System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
    driver = new ChromeDriver();

    homepage = new Homepage(driver);
    createAccount = new CreateAccount(driver);
    createAccountForm = new CreateAccountForm(driver);
    signIn = new SignInForm(driver);
    account = new Account(driver);

        String baseUrl = "http://automationpractice.com/index.php";
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
    @AfterClass
    public void closeAll() {
        //account.getAccountLogout().click();
        driver.quit();
    }
    @Test(priority = 1)
    public void autenthicationPage() {
        homepage.getSignInBtn().click();

        Assert.assertTrue(createAccount.getCreateAccountForm().isDisplayed());
        Assert.assertTrue(createAccount.getCreateAccountEmailField().isDisplayed());
        Assert.assertTrue(createAccount.getCreateAccountBtn().isDisplayed());
        Assert.assertTrue(signIn.getSignInForm(driver).isDisplayed());
    }
    @Test(priority = 2)
    public void authenticationPageEmailField() {
        //without email
        createAccount.getCreateAccountBtn().click();

        Assert.assertTrue(createAccount.getEmailErrorMessage().isDisplayed());

        //Wrong Email format
        createAccount.setCreateAccountEmailField("mkdaniel219");
        createAccount.getCreateAccountBtn().click();
        Assert.assertTrue(createAccount.getEmailErrorMessage().isDisplayed());
        Assert.assertTrue(createAccount.getEmailFieldHighlightedRed().isDisplayed());

        //Registered email
        createAccount.setCreateAccountEmailField("email@email.email");
        createAccount.getCreateAccountBtn().click();
        Assert.assertTrue(createAccount.getEmailBeenRegistered().isDisplayed());

        //Correct email
        createAccount.setCreateAccountEmailField("mkdaniel219@mailinator.com");
        createAccount.getCreateAccountBtn().click();
        Assert.assertTrue(createAccountForm.getAccountCreationForm().isDisplayed());

    }

    @Test(priority = 3)
    public void personalInfoFields() {

        createAccountForm.fillDataInFields("setAllFields");

        //createAccountForm.getRegisterBtn().click();

    }

    @Test(priority = 3)
    public void requiredFieldsEmpty() throws InterruptedException {

        createAccountForm.clearDataFromFields("clearAllFields");
        Thread.sleep(3000);
        createAccountForm.getRegisterBtn().click();
        createAccountForm.assertAccountCreateExpectedErrors("AssertAll");
        createAccountForm.selectCountry("United States");
        createAccountForm.getPostalCodeField().clear();
        createAccountForm.getRegisterBtn().click();

        Assert.assertTrue(createAccountForm.getStateRequredError().isDisplayed());
        Assert.assertTrue(createAccountForm.getPostalCodeError().isDisplayed());
    }

    @Test(priority = 4)
    public void negativeInfoFieldsCustomerFirstNameField() {

        createAccountForm.fillDataInFields("setAllFieldsExceptTwo");
        createAccountForm.clearDataFromFields("CustomerFirstNameField");
        createAccountForm.getRegisterBtn().click();
        createAccountForm.assertAccountCreateExpectedErrors("FirstNameError");

        //createAccountForm.getRegisterBtn().click();
    }

    @Test(priority = 4)
    public void negativeInfoFieldsCustomerLastNameField() {

        createAccountForm.fillDataInFields("setAllFieldsExceptTwo");
        createAccountForm.clearDataFromFields("CustomerLastNameField");
        createAccountForm.getRegisterBtn().click();
        createAccountForm.assertAccountCreateExpectedErrors("LastNameError");

        //createAccountForm.getRegisterBtn().click();
    }

    @Test(priority = 4)
    public void negativeInfoFieldsCustomerEmailField() {

        createAccountForm.fillDataInFields("setAllFieldsExceptTwo");
        createAccountForm.clearDataFromFields("CustomerEmailField");
        createAccountForm.setCustomerEmailField("mambojambo");
        createAccountForm.getRegisterBtn().click();

        Assert.assertTrue(createAccountForm.getCustomerEmailInvalidError().isDisplayed());

    }
}