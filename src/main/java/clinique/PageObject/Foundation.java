package clinique.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Utils;

public class Foundation {

    private WebDriver driver;

    public Foundation(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFoundationsBanner() {
        return Utils.waitForElementPresence(driver, By.xpath("//div[contains(@class,'content-block__content')]//div[contains(@class,'hero-full-width__content')]//div[contains(@class,'hero-full-width__content-text')]//p[contains(text(),'Foundations')]"), 30);
    }

    public WebElement getNewMouseOverProduct() {
        return Utils.waitForElementPresence(driver, By.xpath("///a[@innertext>'More than minerals. Long-wear formula helps keep pores out o']"), 30);
    }

    public WebElement getNewProduct() {
        return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'Almost Powder Makeup Broad Spectrum SPF 18')]"), 30);
    }

    public WebElement getBestSellerProduct() {
        return Utils.waitForElementPresence(driver, By.xpath("///a[@innertext>'Dermatologist-developed foundation perfects instantly, lasts']"), 30);
    }

    public WebElement getQuantity() {
        return Utils.waitForElementPresence(driver, By.xpath("//div[@safeclass~'\bdxkWNN\b.*\belc-spinner-selector-data-wrapper\b.*\bjs-spinner-selector-data-wrapper\b']/h6[@innertext='1']"), 30);
    }

    public WebElement getIncreaseQuantity() {
        return Utils.waitForElementPresence(driver, By.xpath("//div[@safeclass~'\bdxkWNN\b.*\belc-spinner-selector-data-wrapper\b.*\bjs-spinner-selector-data-wrapper\b']/h6[@innertext='1']"), 30);
    }

    public WebElement getDecreaseQuantity() {
        return Utils.waitForElementPresence(driver, By.xpath("//button[@safeclass~'\\belc-spinner-selector-button\\b.*\\biiwOfT\\b.*\\bjs-spinner-selector-button-back\\b']/svg[@safeclass~'\\belc-spinner-minus-icon\\b.*\\bjs-spinner-minus-icon\\b.*\\bvqYoT\\b']"), 30);
    }

    public WebElement getCloseChatBtn() {
        return Utils.waitForElementPresence(driver, By.xpath("/html/body/div[13]/table//a/img[@alt='Close chat']"), 30);
    }

    public WebElement getAddToBagBtn() {
        return Utils.waitForElementPresence(driver, By.xpath("//*[@id='content']/div/div/div/div[1]/div/div/div[2]/div[1]/div[2]/div[6]/div/div/div[2]/div/div/div/button"), 30);
        //*[@id="content"]/div/div/div/div[1]/div/div/div[2]/div[1]/div[2]/div[6]/div/div/div[2]/div/div/div/button
        //*[@id="content"]/div/div/div/div[1]/div/div/div[2]/div[1]/div[2]/div[6]/div/div/div[2]/div/div/div/button
    }

public WebElement getProductShade() {
        return Utils.waitForElementPresence(driver, By.cssSelector(".ProductShadesSidebarButton__StyledSquareIcon-pxsl7q-1.hVRVvH"), 30);
    }

    public WebElement getShadeLevel4() {
        return Utils.waitForElementPresence(driver, By.cssSelector("[class] [class] [color='\\#DCB286']:nth-child(3)"), 30);
    }

    public WebElement getShadeLevel5() {
        return Utils.waitForElementPresence(driver, By.cssSelector("[class] [class] [color='\\#D5A179']:nth-child(2)"), 30);
    }

    public WebElement getShadeLevel6() {
        return Utils.waitForElementPresence(driver, By.cssSelector("[class] [class] [color='\\#D7AA8E']:nth-child(2)"), 30);
    }

    public WebElement getAddToBagShadeBtn() {
        return Utils.waitForElementPresence(driver, By.cssSelector("[class='ProductShadesSidebarContent__StyledAddToBagButton-u5w55u-13 iTPdRG ProductFullAddToBagButton__Wrapper-injdp6-0 NppMt'] [data-test-id]"), 30);
    }

    public WebElement getClickOutOfShadeMenu() {
        return Utils.waitForElementPresence(driver, By.xpath("//div[@id='content']/div/div/div/div/div/div/div/div/div"), 30);
    }

}
