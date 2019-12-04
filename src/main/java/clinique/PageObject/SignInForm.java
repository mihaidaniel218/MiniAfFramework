package clinique.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Utils;

public class SignInForm {


        private WebDriver driver;

        public SignInForm(WebDriver driver) {
            this.driver = driver;
        }

        public WebElement getSignInForm(WebDriver driver) {
            return Utils.waitForElementPresence(this.driver, By.id("login_form"), 30);
        }

        public WebElement getSignInEmailField() {
            return Utils.waitForElementPresence(driver, By.id("form--registration_short--field--PC_EMAIL_ADDRESS"), 30);
        }

        public WebElement getSignInPasswordField() {
            return Utils.waitForElementPresence(driver, By.id("form--registration_short--field--PASSWORD"), 30);
        }


    public WebElement getSignInTermsAnsConditionsBtn() {
        return Utils.waitForElementPresence(driver, By.id("form--registration_short--field--ACCEPTED_PRIVACY_POLICY"), 30);
    }

    public WebElement getSignInShowPasswordBtn() {
        return Utils.waitForElementPresence(driver, By.id("form--registration_short--field--SHOW_PASSWORD"), 30);
        }

    public WebElement getSignInEmailSpecialOffersBtn() {
            return Utils.waitForElementPresence(driver, By.id("form--registration_short--field--PC_EMAIL_PROMOTIONS"), 30);
    }

    public WebElement getSignInLoyaltyProgramBtn() {
        return Utils.waitForElementPresence(driver, By.id("form--registration_short--field--LOYALTY_ACTIVE_FLAG"), 30);
    }

        public WebElement getJoinNowBtn() {
            return Utils.waitForElementPresence(driver, By.xpath("//form[@id='registration_short']//input[@class='button form-submit']"), 30);
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
        return Utils.waitForElementPresence(driver, By.xpath("//li[@id='account_exists..']"), 30);
    }

    public WebElement getReturnEmailField() {
        return Utils.waitForElementPresence(driver, By.id("form--signin--field--EMAIL_ADDRESS"), 30);
    }

    public WebElement getReturnPasswordField() {
        return Utils.waitForElementPresence(driver, By.id("form--signin--field--PASSWORD"), 30);
    }

    public WebElement getReturnSignInBtn() {
        return Utils.waitForElementPresence(driver, By.xpath("//form[@id='signin']//input[@class='button form-submit']"), 30);
    }

    public void setReturnPasswordField(String pass) {
        WebElement password = this.getReturnPasswordField();
        password.clear();
        password.sendKeys(pass);
    }

        //    Login ERRORS   //
        public WebElement getEmailRequiredError() {
            return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(),'An email address required.')]"), 30);
        }

        public WebElement getEmailInvalidError() {
            return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(),'Invalid email address.')]"), 30);
        }

        public WebElement getAuthenticationFailedError() {
            return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(),'Authentication failed.')]"), 30);
        }

        public WebElement getPasswordRequiredError() {
            return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(),'Password is required.')]"), 30);
        }

        public WebElement getInvalidPasswordError() {
            return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(), \"Invalid password\")]"), 30);
        }

        //Highlighted Errors

        public WebElement getEmailHighlightedRed() {
            return Utils.waitForElementPresence(driver, By.xpath("//div[@class='form-group form-error']"), 30);
        }

        public WebElement getEmailHighlightedGreen() {
            return Utils.waitForElementPresence(driver, By.xpath("//div[@class=\"form-group form-ok\"]//input[@id=\"email\"]"), 30);

        }
    }


