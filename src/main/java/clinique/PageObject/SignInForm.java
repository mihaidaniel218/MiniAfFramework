package clinique.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Utils;

public class SignInForm {

    private WebDriver driver;
    private By SignInFormm = By.id("login_form");
    private By SignInEmailField = By.id("form--registration_short--field--PC_EMAIL_ADDRESS");
    private By SignInPasswordField = By.id("form--registration_short--field--PASSWORD");
    private By SignInTermsAnsConditionsBtn = By.id("form--registration_short--field--ACCEPTED_PRIVACY_POLICY");
    private By EmailHighlightedGreen = By.xpath("//div[@class='form-group form-ok']//input[@id='email']");
    private By SignInShowPasswordBtn = By.id("form--registration_short--field--SHOW_PASSWORD");
    private By SignInEmailSpecialOffersBtn = By.id("form--registration_short--field--PC_EMAIL_PROMOTIONS");
    private By SignInLoyaltyProgramBtn = By.id("form--registration_short--field--LOYALTY_ACTIVE_FLAG");
    private By JoinNowBtn = By.xpath("//form[@id='registration_short']//input[@class='button form-submit']");
    private By AccountExistsWarning = By.xpath("//li[@id='account_exists..']");
    private By ReturnEmailField = By.id("form--signin--field--EMAIL_ADDRESS");
    private By ReturnPasswordField = By.id("form--signin--field--PASSWORD");
    private By ReturnSignInBtn = By.xpath("//form[@id='signin']//input[@class='button form-submit']");
    private By EmailRequiredError = By.xpath("//li[contains(text(),'An email address required.')]");
    private By EmailInvalidError = By.xpath("//li[contains(text(),'Invalid email address.')]");
    private By AuthenticationFailedError = By.xpath("//li[contains(text(),'Authentication failed.')]");
    private By PasswordRequiredError = By.xpath("//li[contains(text(),'Password is required.')]");
    private By InvalidPasswordError = By.xpath("//li[contains(text(), 'Invalid password')]");
    private By EmailHighlightedRed = By.xpath("//div[@class='form-group form-error']");

    public SignInForm(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSignInForm(WebDriver driver) {
        return Utils.waitForElementPresence(this.driver, SignInFormm, 30);
    }

    public WebElement getSignInEmailField() {
        return Utils.waitForElementPresence(driver, SignInEmailField, 30);
    }

    public WebElement getSignInPasswordField() {
        return Utils.waitForElementPresence(driver, SignInPasswordField, 30);
    }

    public WebElement getSignInTermsAnsConditionsBtn() {
        return Utils.waitForElementPresence(driver, SignInTermsAnsConditionsBtn, 30);
    }

    public WebElement getSignInShowPasswordBtn() {
        return Utils.waitForElementPresence(driver, SignInShowPasswordBtn, 30);
    }

    public WebElement getSignInEmailSpecialOffersBtn() {
        return Utils.waitForElementPresence(driver, SignInEmailSpecialOffersBtn, 30);
    }

    public WebElement getSignInLoyaltyProgramBtn() {
        return Utils.waitForElementPresence(driver, SignInLoyaltyProgramBtn, 30);
    }

    public WebElement getJoinNowBtn() {
        return Utils.waitForElementPresence(driver, JoinNowBtn, 30);
    }

    public void setEmailField(String mail) {
        WebElement email = this.getSignInEmailField();
        email.clear();
        email.sendKeys(mail);
    }

    public void setPasswordField(String pass) {
        WebElement password = this.getSignInPasswordField();
        password.clear();
        password.sendKeys(pass);
    }

    public WebElement getAccountExistsWarning() {
        return Utils.waitForElementPresence(driver, AccountExistsWarning, 30);
    }

    public WebElement getReturnEmailField() {
        return Utils.waitForElementPresence(driver, ReturnEmailField, 30);
    }

    public WebElement getReturnPasswordField() {
        return Utils.waitForElementPresence(driver, ReturnPasswordField, 30);
    }

    public void setReturnPasswordField(String pass) {
        WebElement password = this.getReturnPasswordField();
        password.clear();
        password.sendKeys(pass);
    }

    public WebElement getReturnSignInBtn() {
        return Utils.waitForElementPresence(driver, ReturnSignInBtn, 30);
    }

    //    Login ERRORS   //
    public WebElement getEmailRequiredError() {
        return Utils.waitForElementPresence(driver, EmailRequiredError, 30);
    }

    public WebElement getEmailInvalidError() {
        return Utils.waitForElementPresence(driver, EmailInvalidError, 30);
    }

    public WebElement getAuthenticationFailedError() {
        return Utils.waitForElementPresence(driver, AuthenticationFailedError, 30);
    }

    public WebElement getPasswordRequiredError() {
        return Utils.waitForElementPresence(driver, PasswordRequiredError, 30);
    }

    public WebElement getInvalidPasswordError() {
        return Utils.waitForElementPresence(driver, InvalidPasswordError, 30);
    }

    //Highlighted Errors

    public WebElement getEmailHighlightedRed() {
        return Utils.waitForElementPresence(driver, EmailHighlightedRed, 30);
    }

    public WebElement getEmailHighlightedGreen() {
        return Utils.waitForElementPresence(driver, EmailHighlightedGreen, 30);
    }

}