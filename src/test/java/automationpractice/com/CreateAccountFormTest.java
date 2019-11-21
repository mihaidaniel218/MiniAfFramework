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
        createAccountForm.setCustomerFirstNameField("Michael");
        createAccountForm.setCustomerLastNameField("Daniel");
        createAccountForm.setCustomerEmailField("mdaniel219test@mailinator.com");
        createAccountForm.setCustomerPasswordField("masterPWM222*");

        createAccountForm.selectCustomerDateOfBirthDay().selectByValue("23");
        createAccountForm.selectCustomerDateOfBirthMonth().selectByValue("7");
        createAccountForm.selectCustomerDateOfBirthYear().selectByValue("1997");

        createAccountForm.setCustomerFirstNameField("Michael");
        createAccountForm.setCustomerLastNameField("Daniel");
        createAccountForm.setCompanyField("Softvision");
        createAccountForm.setAddressField("Sos. Nationala nr. 37, 00000, Softvision");
        createAccountForm.setAddressFieldTwo("Cladirea Aria, et. 1, Iasi");
        createAccountForm.setCityField("Iasi");
        createAccountForm.selectState().selectByVisibleText("Alaska");
        createAccountForm.setPostalCodeField("70054");
        createAccountForm.setHomePhoneField("0337455455");
        createAccountForm.setMobilePhoneField("+40 777 666 555");

        createAccountForm.setCustomerTitleMr();
        createAccountForm.setAddressAliasField("My Address");

        //createAccountForm.getRegisterBtn().click();

    }

    @Test(priority = 4)
    public void requiredFieldsEmpty() throws InterruptedException {
        createAccountForm.getAddressAliasField().clear();
        createAccountForm.setCustomerEmailField("");
        createAccountForm.selectCountry("-");

        createAccountForm.setCustomerFirstNameField("");
        createAccountForm.setCustomerLastNameField("");
        createAccountForm.setCustomerEmailField("");
        createAccountForm.setCustomerPasswordField("");

        createAccountForm.selectCustomerDateOfBirthDay().selectByVisibleText("-");
        createAccountForm.selectCustomerDateOfBirthMonth().selectByVisibleText("-");
        createAccountForm.selectCustomerDateOfBirthYear().selectByVisibleText("-");

        createAccountForm.getCustomerFirstNameField().clear();
        createAccountForm.getCustomerLastNameField().clear();
        createAccountForm.getCompanyField().clear();
        createAccountForm.getAddressField().clear();
        createAccountForm.getAddressFieldTwo().clear();
        createAccountForm.getCity().clear();
        createAccountForm.selectState().selectByVisibleText("-");
        createAccountForm.selectCountry().selectByVisibleText("-");
        createAccountForm.getHomePhoneField().clear();
        createAccountForm.getMobilePhoneField().clear();
        Thread.sleep(3000);
        createAccountForm.getRegisterBtn().click();

        Assert.assertTrue(createAccountForm.getPhoneNumberError().isDisplayed());
        Assert.assertTrue(createAccountForm.getLastNameError().isDisplayed());
        Assert.assertTrue(createAccountForm.getFirstNameError().isDisplayed());
        Assert.assertTrue(createAccountForm.getEmailRequiredError().isDisplayed());
        Assert.assertTrue(createAccountForm.getPasswordRequiredError().isDisplayed());
        Assert.assertTrue(createAccountForm.getCountryRequiredError().isDisplayed());
        Assert.assertTrue(createAccountForm.getAddressRequiredError().isDisplayed());
        Assert.assertTrue(createAccountForm.getAddressAliasRequiredError().isDisplayed());
        Assert.assertTrue(createAccountForm.getCityRequiredError().isDisplayed());
        Assert.assertTrue(createAccountForm.getCountryUnselectedError().isDisplayed());

        createAccountForm.selectCountry("United States");
        createAccountForm.getPostalCodeField().clear();
        createAccountForm.getRegisterBtn().click();

        Assert.assertTrue(createAccountForm.getStateRequredError().isDisplayed());
        Assert.assertTrue(createAccountForm.getPostalCodeError().isDisplayed());
    }
}