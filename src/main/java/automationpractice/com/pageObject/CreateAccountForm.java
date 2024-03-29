package automationpractice.com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utils.Utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CreateAccountForm {

    private static final String AccountCreationForm = "account-creation_form";
    private WebDriver driver;

    public CreateAccountForm(WebDriver driver) {
        this.driver = driver;
    }

    public static LinkedList<WebElement> content = new LinkedList<>();

    ArrayList<WebElement> list=(ArrayList<WebElement>) driver.findElements(By.xpath("//li[contains(text(), \"You must register\")]/../.."));

/*
    public static LinkedList<WebElement> getContent() {
        return content;
    }

    {
        driver.findElement(By.id("account-creation_form")), driver.findElement(By.id("uniform-id_gender1"))
    }

    List<WebElement> allLinks = driver.findElements(By.id("//div[@class='datepicker']/div/table/tbody/tr/td/table/tbody[2]/tr/td[@class='' or @class='datepickerSaturday' or @class='datepickerSunday']/a/span"));
    Iterator<WebElement> itr = allLinks.iterator();

    while(itr.hasNext()) {
        System.out.println(itr.next());
    }
*/

    public WebElement getAccountCreationForm() {
        return Utils.waitForElementPresence(driver, By.id("account-creation_form"), 30);
    }

    public WebElement getCustomerTitleMr() {
        return Utils.waitForElementPresence(driver, By.id("uniform-id_gender1"), 30);
    }

    public WebElement getCustomerTitleMrs() {
        return Utils.waitForElementPresence(driver, By.id("uniform-id_gender2"), 30);
    }

    public WebElement getCustomerFirstNameField() {
        return Utils.waitForElementPresence(driver, By.id("customer_firstname"), 30);
    }

    public void setCustomerFirstNameField(String firstName) {
        WebElement customerFirstNameField = this.getCustomerFirstNameField();
        customerFirstNameField.clear();
        customerFirstNameField.sendKeys(firstName);
    }

    public WebElement getCustomerLastNameField() {
        return Utils.waitForElementPresence(driver, By.id("customer_lastname"), 30);
    }

    public void setCustomerLastNameField(String lastName) {
        WebElement customerLastNameField = this.getCustomerLastNameField();
        customerLastNameField.clear();
        customerLastNameField.sendKeys(lastName);
    }

/*    public WebElement getCustomerDateOfBirthDay() {
        return Utils.waitForElementPresence(driver, By.id("uniform-days");
    }*/

    public WebElement getCustomerEmailField() {
        return Utils.waitForElementPresence(driver, By.id("email"), 30);
    }

    //	public WebElement getCustomerDateOfBirthMonth() {
//		return Utils.waitForElementPresence(driver, By.id("uniform-months"), 30);
//	}

    public void setCustomerEmailField(String email) {
        WebElement customerEmailField = this.getCustomerEmailField();
        customerEmailField.clear();
        customerEmailField.sendKeys(email);
    }

//	public WebElement getCustomerDateOfBirthYear() {
//		return Utils.waitForElementPresence(driver, By.id("uniform-years"), 30);
//	}

    public WebElement getCustomerPasswordField() {
        return Utils.waitForElementPresence(driver, By.id("passwd"), 30);
    }

    public void setCustomerPasswordField(String password) {
        WebElement customerPasswordField = this.getCustomerPasswordField();
        customerPasswordField.clear();
        customerPasswordField.sendKeys(password);
    }

    public Select selectCustomerDateOfBirthDay() {
        WebElement dayOfBirth = Utils.waitForElementPresence(driver, By.id("days"), 30);
        return new Select(dayOfBirth);
    }

    public Select selectCustomerDateOfBirthMonth() {
        WebElement monthOfBirth = Utils.waitForElementPresence(driver, By.id("months"), 30);
        return new Select(monthOfBirth);
    }

    public Select selectCustomerDateOfBirthYear() {
        WebElement yearOfBirth = Utils.waitForElementPresence(driver, By.id("years"), 30);
        return new Select(yearOfBirth);
    }

    public WebElement getFirstNameField() {
        return Utils.waitForElementPresence(driver, By.id("firstname"), 30);
    }

    public WebElement getLastNameField() {
        return Utils.waitForElementPresence(driver, By.id("lastname"), 30);
    }

    public WebElement getCompanyField() {
        return Utils.waitForElementPresence(driver, By.id("company"), 30);
    }

    public void setCompanyField(String company) {
        WebElement companyField = this.getCompanyField();
        companyField.clear();
        companyField.sendKeys(company);
    }

    public WebElement getAddressField() {
        return Utils.waitForElementPresence(driver, By.id("address1"), 30);
    }

    public void setAddressField(String address) {
        WebElement addressField = this.getAddressField();
        addressField.clear();
        addressField.sendKeys(address);
    }

    public WebElement getAddressFieldTwo() {
        return Utils.waitForElementPresence(driver, By.id("address2"), 30);
    }

    public void setAddressFieldTwo(String addresTwo) {
        WebElement addresField = this.getAddressFieldTwo();
        addresField.clear();
        addresField.sendKeys(addresTwo);
    }

    public WebElement getCity() {
        return Utils.waitForElementPresence(driver, By.id("city"), 30);
    }

    public Select selectCountry() {
        WebElement country = Utils.waitForElementPresence(driver, By.id("id_country"), 30);
        return new Select(country);
    }

    public Select selectState() {
        WebElement state = Utils.waitForElementPresence(driver, By.id("id_state"), 30);
        return new Select(state);
    }

    // ************ SETTERS **********//

    public WebElement getPostalCodeField() {
        return Utils.waitForElementPresence(driver, By.id("postcode"), 30);
    }

    public void setPostalCodeField(String zip) {
        WebElement postalCode = this.getPostalCodeField();
        postalCode.clear();
        postalCode.sendKeys(zip);
    }

    public WebElement getAdditionalInformationField() {
        return Utils.waitForElementPresence(driver, By.id("other"), 30);
    }

    public WebElement getHomePhoneField() {
        return Utils.waitForElementPresence(driver, By.id("phone"), 30);
    }

    public void setHomePhoneField(String phone) {
        WebElement homePhone = this.getHomePhoneField();
        homePhone.clear();
        homePhone.sendKeys(phone);
    }

    public WebElement getMobilePhoneField() {
        return Utils.waitForElementPresence(driver, By.id("phone_mobile"), 30);
    }

    public void setMobilePhoneField(String phone) {
        WebElement mobilePhone = this.getMobilePhoneField();
        mobilePhone.clear();
        mobilePhone.sendKeys(phone);
    }

    public WebElement getAddressAliasField() {
        return Utils.waitForElementPresence(driver, By.id("alias"), 30);
    }

    public void setAddressAliasField(String alias) {
        WebElement addressAlias = this.getAddressAliasField();
        addressAlias.clear();
        addressAlias.sendKeys(alias);
    }

    public WebElement getRegisterBtn() {
        return Utils.waitToBeClickable(driver, By.id("submitAccount"), 30);
    }

    public WebElement succesfullyCreatedAccount() {
        return Utils.waitForElementPresence(driver, By.xpath("//p[contains(text(), \\\"Welcome to your account.\\\")]"), 30);
    }

    public void setCustomerTitleMr() {
        this.getCustomerTitleMr().click();
    }

    public void setCustomerTitleMrs() {
        this.getCustomerTitleMrs().click();
    }

    public void selectCustomerDateOfBirthDay(String day) {
        Select dayOfBirth = this.selectCustomerDateOfBirthDay();
        dayOfBirth.selectByValue(day);
    }

    public void selectCustomerDateOfBirthMonth(String month) {
        Select monthOfBirth = this.selectCustomerDateOfBirthMonth();
        monthOfBirth.selectByValue(month);
    }

    public void selectCustomerDateOfBirthYear(String year) {
        Select yearOfBirth = this.selectCustomerDateOfBirthYear();
        yearOfBirth.selectByValue(year);
    }

    public void setCityField(String city) {
        WebElement cityField = this.getCity();
        cityField.clear();
        cityField.sendKeys(city);
    }

    public void selectState(String state) {
        Select selectState = this.selectState();
        selectState.selectByValue(state);
    }

    public void selectCountry(String country) {
        Select selectCountry = this.selectCountry();
        selectCountry.selectByVisibleText(country);
    }

    public void setAdditionalInfo(String info) {
        WebElement additionalInfo = this.getAdditionalInformationField();
        additionalInfo.clear();
        additionalInfo.sendKeys(info);
    }

    // *********** ERRORS **************** //

    public WebElement getErrorPanel() {
        return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(), \"You must register\")]/../.."), 30);
    }

    public WebElement getPhoneNumberError() {
        return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(), \"You must register at least one phone number.\")]"), 30);
    }

    public WebElement getHomePhoneInvalidError() {
        return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(), \" is invalid.\")]/b[contains(text(), \"phone\")]"), 30);
    }

    public WebElement getMobilePhoneInvalidError() {
        return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(), \" is invalid.\")]/b[contains(text(), \"phone_mobile\")]"), 30);
    }

    public WebElement getLastNameError() {
        return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(), \"lastname\")]"), 30);
    }

    public WebElement getLastNameInvalidError() {
        return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(), \" is invalid.\")]/b[contains(text(), \"lastname\")]"), 30);
    }

    public WebElement getFirstNameError() {
        return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(), \"firstname\")]"), 30);
    }

    public WebElement getFirstNameInvalidError() {
        return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(), \" is invalid.\")]/b[contains(text(), \"firstname\")]"), 30);
    }

    public WebElement getEmailRequiredError() {
        return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(), \"lastname\")]"), 30);
    }

    public WebElement getEmailInvalidError() {
        return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(), \" is invalid.\")]/b[contains(text(), \"email\")]"), 30);
    }
    public WebElement getCustomerEmailInvalidError() {
        return Utils.waitForElementPresence(driver, By.xpath("//div[@id='center_column']//p[.='There is 1 error']"), 30);
    }

    public WebElement getEmailBeenRegistered() {
        return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(), \"An account using this\")]"), 30);
    }

    public WebElement getPasswordRequiredError() {
        return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(), \"passwd\")]"), 30);
    }

    public WebElement getPasswordInvalidError() {
        return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(), \" is invalid.\")]/b[contains(text(), \"passwd\")]"), 30);
    }

    public WebElement getCountryRequiredError() {
        return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(), \"id_country\")]"), 30);
    }

    public WebElement getAddressAliasRequiredError() {
        return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(), \"alias\")]"), 30);
    }

    public WebElement getAddressRequiredError() {
        return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(), \"address1\")]"), 30);
    }

    public WebElement getCityRequiredError() {
        return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(), \"city\")]"), 30);
    }

    public WebElement getCountryUnselectedError() {
        return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(), \"Country is invalid\")]"), 30);
    }

    public WebElement getStateRequredError() {
        return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(), \"This country requires you to choose a State.\")]"), 30);
    }

    public WebElement getPostalCodeError() {
        return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(), \"The Zip/Postal code you\")]"), 30);
    }


    /****** HIGHLIGHTED ERRORS ******/


    public WebElement getFirstNameHighlightedGreen() {
        return Utils.waitForElementPresence(driver, By.xpath("//div[@class=\"required form-group form-ok\"]//input[@id=\"customer_firstname\"]"), 30);
    }

    public WebElement getFirstNameHighlightedRed() {
        return Utils.waitForElementPresence(driver, By.xpath("//div[@class=\"required form-group form-error\"]//input[@id=\"customer_firstname\"]"), 30);
    }

    public WebElement getLastNameHighlightedGreen() {
        return Utils.waitForElementPresence(driver, By.xpath("//div[@class=\"required form-group form-ok\"]//input[@id=\"customer_lastname\"]"), 30);
    }

    public WebElement getLastNameHighlightedRed() {
        return Utils.waitForElementPresence(driver, By.xpath("//div[@class=\"required form-group form-error\"]//input[@id=\"customer_lastname\"]"), 30);
    }

    public WebElement getEmailHighlightedGreen() {
        return Utils.waitForElementPresence(driver, By.xpath("//div[@class=\"required form-group form-ok\"]//input[@id=\"email\"]"), 30);
    }

    public WebElement getEmailHighlightedRed() {
        return Utils.waitForElementPresence(driver, By.xpath("//div[@class=\"required form-group form-error\"]//input[@id=\"email\"]"), 30);
    }

    public WebElement getPasswordHighlightedGreen() {
        return Utils.waitForElementPresence(driver, By.xpath("//div[@class=\"required password form-group form-ok\"]//input[@id=\"passwd\"]"), 30);
    }

    public WebElement getPasswordHighlightedRed() {
        return Utils.waitForElementPresence(driver, By.xpath("//div[@class=\"required password form-group form-error\"]//input[@id=\"passwd\"]"), 30);
    }

    //Successfully Created Account

    public WebElement successfullyCreatedAccount() {
        return (WebElement) driver;
    }

    public void fillDataInFields(String fieldName) {

        switch (fieldName) {
            case "CustomerFirstNameField":
                setCustomerFirstNameField("Michael");
                break;
            case "CustomerLastNameField":
                setCustomerLastNameField("Daniel");
                break;
            case "CustomerEmailField":
                setCustomerEmailField("mdaniel219test@mailinator.com");
                break;
            case "CustomerPasswordField":
                setCustomerPasswordField("masterPWM222*");
                break;
            case "CustomerDateOfBirthDay":
                selectCustomerDateOfBirthDay().selectByValue("23");
                break;
            case "CustomerDateOfBirthMonth":
                selectCustomerDateOfBirthMonth().selectByValue("7");
                break;
            case "CustomerDateOfBirthYear":
                selectCustomerDateOfBirthYear().selectByValue("1997");
                break;
            case "CompanyField":
                setCompanyField("Softvision");
                break;
            case "setAddressField":
                setAddressField("Sos. Nationala nr. 37, 00000, Softvision");
                break;
            case "AddressFieldTwo":
                setAddressFieldTwo("Cladirea Aria, et. 1, Iasi");
                break;
            case "CityField":
                setCityField("Iasi");
                break;
            case "selectState":
                selectState().selectByVisibleText("Alaska");
                break;
            case "PostalCodeField":
                setPostalCodeField("70054");
            case "HomePhoneField":
                setHomePhoneField("0337455455");
                break;
            case "MobilePhoneField":
                setMobilePhoneField("+40 777 666 555");
                break;
            case "CustomerTitleMr":
                setCustomerTitleMr();
                break;
            case "setAddressAliasField":
                setAddressAliasField("My Address");
            case "setAllFields":
                setCustomerFirstNameField("Michael");
                setCustomerLastNameField("Daniel");
                setCustomerEmailField("mdaniel219test@mailinator.com");
                setCustomerPasswordField("masterPWM222*");
                selectCustomerDateOfBirthDay().selectByValue("23");
                selectCustomerDateOfBirthMonth().selectByValue("7");
                selectCustomerDateOfBirthYear().selectByValue("1997");
                setCustomerFirstNameField("Michael");
                setCustomerLastNameField("Daniel");
                setCompanyField("Softvision");
                setAddressField("Sos. Nationala nr. 37, 00000, Softvision");
                setAddressFieldTwo("Cladirea Aria, et. 1, Iasi");
                setCityField("Iasi");
                selectState().selectByVisibleText("Alaska");
                setPostalCodeField("70054");
                setHomePhoneField("0337455455");
                setMobilePhoneField("+40 777 666 555");

                setCustomerTitleMr();
                setAddressAliasField("My Address");
                break;
            case "setAllFieldsExceptTwo":
                setCustomerFirstNameField("Michael");
                setCustomerLastNameField("Daniel");
                setCustomerEmailField("mdaniel219test@mailinator.com");
                setCustomerPasswordField("masterPWM222*");
                selectCustomerDateOfBirthDay().selectByValue("23");
                selectCustomerDateOfBirthMonth().selectByValue("7");
                selectCustomerDateOfBirthYear().selectByValue("1997");
                setCustomerFirstNameField("Michael");
                setCustomerLastNameField("Daniel");
                setCompanyField("Softvision");
                setAddressField("Sos. Nationala nr. 37, 00000, Softvision");
                //setAddressFieldTwo("Cladirea Aria, et. 1, Iasi");
                setCityField("Iasi");
                selectState().selectByVisibleText("Alaska");
                setPostalCodeField("70054");
                setHomePhoneField("0337455455");
                setMobilePhoneField("+40 777 666 555");

                setCustomerTitleMr();
                setAddressAliasField("My Address");
                break;
        }
    }

    public void clearDataFromFields(String fieldName) {
        switch (fieldName) {
            case "AddressAliasField":
                getAddressAliasField().clear();
                break;
            case "CustomerEmailField":
                setCustomerEmailField("");
                break;
            case "selectCountryOne":
                selectCountry().selectByVisibleText("-");
                break;
            case "CustomerFirstNameField":
                getCustomerFirstNameField().clear();
                ;
                break;
            case "CustomerLastNameField":
                getCustomerLastNameField().clear();
                break;
            case "CustomerPasswordField":
                getCustomerPasswordField().clear();
                break;
            case "CustomerDateOfBirthDay":
                selectCustomerDateOfBirthDay().selectByVisibleText("-");
                break;
            case "CustomerDateOfBirthMonth":
                selectCustomerDateOfBirthMonth().selectByVisibleText("-");
                break;
            case "CustomerDateOfBirthYear":
                selectCustomerDateOfBirthYear().selectByVisibleText("-");
                break;
            case "CompanyField":
                getCompanyField().clear();
                break;
            case "setAddressField":
                getAddressField().clear();
                break;
            case "AddressFieldTwo":
                getAddressFieldTwo().clear();
                break;
            case "CityField":
                getCity().clear();
                break;
            case "selectState":
                selectState().selectByVisibleText("-");
                break;
            case "selectCountry":
                selectCountry().selectByVisibleText("-");
                break;
            case "PostalCodeField":
                setPostalCodeField("");
            case "HomePhoneField":
                getHomePhoneField().clear();
                break;
            case "MobilePhoneField":
                getMobilePhoneField().clear();
                break;
            case "clearAllFields":
                getAddressAliasField().clear();
                //setCustomerEmailField("");
                selectCountry("-");
                setCustomerFirstNameField("");
                setCustomerLastNameField("");
                setCustomerEmailField("");
                setCustomerPasswordField("");
                selectCustomerDateOfBirthDay().selectByVisibleText("-");
                selectCustomerDateOfBirthMonth().selectByVisibleText("-");
                selectCustomerDateOfBirthYear().selectByVisibleText("-");
                getCustomerFirstNameField().clear();
                getCustomerLastNameField().clear();
                getCompanyField().clear();
                getAddressField().clear();
                getAddressFieldTwo().clear();
                getCity().clear();
                selectState().selectByVisibleText("-");
                selectCountry().selectByVisibleText("-");
                getHomePhoneField().clear();
                getMobilePhoneField().clear();
                break;
        }
    }

    public void assertAccountCreateExpectedErrors(String fieldName) {
        switch (fieldName) {
            case "PhoneNumberError":
                Assert.assertTrue(getPhoneNumberError().isDisplayed());
                break;
            case "LastNameError":
                Assert.assertTrue(getLastNameError().isDisplayed());
                break;
            case "FirstNameError":
                Assert.assertTrue(getFirstNameError().isDisplayed());
                break;
            case "EmailRequiredError":
                Assert.assertTrue(getEmailRequiredError().isDisplayed());
                break;
            case "PasswordRequiredError":
                Assert.assertTrue(getPasswordRequiredError().isDisplayed());
                break;
            case "CountryRequiredError":
                Assert.assertTrue(getCountryRequiredError().isDisplayed());
                break;
            case "AddressRequiredError":
                Assert.assertTrue(getAddressRequiredError().isDisplayed());
                break;
            case "AddressAliasRequiredError":
                Assert.assertTrue(getAddressAliasRequiredError().isDisplayed());
                break;
            case "CityRequiredError":
                Assert.assertTrue(getCityRequiredError().isDisplayed());
                break;
            case "CountryUnselectedError":
                Assert.assertTrue(getCountryUnselectedError().isDisplayed());
                break;
            case "AssertAll":
                Assert.assertTrue(getPhoneNumberError().isDisplayed());
                Assert.assertTrue(getLastNameError().isDisplayed());
                Assert.assertTrue(getFirstNameError().isDisplayed());
                Assert.assertTrue(getEmailRequiredError().isDisplayed());
                Assert.assertTrue(getPasswordRequiredError().isDisplayed());
                Assert.assertTrue(getCountryRequiredError().isDisplayed());
                Assert.assertTrue(getAddressRequiredError().isDisplayed());
                Assert.assertTrue(getAddressAliasRequiredError().isDisplayed());
                Assert.assertTrue(getCityRequiredError().isDisplayed());
                Assert.assertTrue(getCountryUnselectedError().isDisplayed());
                break;
        }
    }
}
