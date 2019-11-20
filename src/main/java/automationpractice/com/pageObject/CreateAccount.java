package automationpractice.com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Utils;

public class CreateAccount {

    private WebDriver driver;

    public CreateAccount(WebDriver driver) {
        this.driver = driver;
    }

     //form[@id='create-account_form']

    public WebElement getCreateAccountForm() {
        return Utils.waitForElementPresence(driver, By.id("create-account_form"), 30);
    }

    public WebElement getCreateAccountEmailField() {
        return Utils.waitForElementPresence(driver, By.id("//input[@id='email_create']"), 30);
    }
    public WebElement getCreateAccountBtn() {
        return Utils.waitForElementPresence(driver, By.xpath("//form[@id='create-account_form']//span[1]"), 30);
    }

    public void setCreateAccountEmailField(String email) {
        WebElement element = this.getCreateAccountEmailField();
        element.clear();
        element.sendKeys(email);
    }

    public WebElement getEmailFieldHighlightedRed() {
        return Utils.waitForElementPresence(driver, By.xpath("//div[@class='form-group form-error']"), 30);
    }

    public WebElement getEmailFieldHighlightedGreen() {
        return Utils.waitForElementPresence(driver, By.xpath("//div[@class='form-group form-ok']"), 30);
    }

    public WebElement getEmailErrorMessage() {
        return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(), \"Invalid email address.\")]"), 30);
    }

    public WebElement getEmailBeenRegistered() {
        return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(), \"An account using this email\")]"), 30);
    }

}