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

/*    public WebElement getCheckoutBtn() {
        return Utils.waitForElementPresence(driver, By.xpath("//div[@safeclass~'\bMQttm\b.*\beMxyAv\b.*\belLGxx\b.*\belc-grid-column\b.*\belc-right-sticky-column\b.*\bjs-grid-column\b.*\bjs-right-sticky-column\b.*\bsc-eNQAEJ\b']//div[@safeclass~'\belc-service-view-renderer\b']/?/?/button[@innertext='Add To Bag']"), 30);
    }

    public WebElement getEditCartBtn() {
        return Utils.waitForElementPresence(driver, By.xpath("/html//nav[@id='header-gnav-navigation']/div[@class='header-gnav__wrapper']/div/div[@class='content']/div[@role='article']/div[@class='content']/div[@class='field-elc-nodeblock-content']/div[@class='gnav-header-formatter js-gnav-header-formatter-v1']/div[@class='gnav-header-formatter__wrapper']/div[@class='gnav-header-formatter__gnav']//div[@class='gnav-header-formatter__bag']/div/div[@class='content']/div[@role='article']//div[@class='header-gnav-cart js-header-gnav-cart-v1']//span[@class='cart-confirm-wrapper__bottom-section']/div[3]/div[@class='left-copy']/a[@href='/checkout/viewcart.tmpl']"), 30);
    }

    public WebElement getAddToBagBtn() {
        return Utils.waitForElementPresence(driver, By.xpath("/html//nav[@id='header-gnav-navigation']/div[@class='header-gnav__wrapper']/div/div[@class='content']/div[@role='article']/div[@class='content']/div[@class='field-elc-nodeblock-content']/div[@class='gnav-header-formatter js-gnav-header-formatter-v1']/div[@class='gnav-header-formatter__wrapper']/div[@class='gnav-header-formatter__gnav']//div[@class='gnav-header-formatter__bag']/div/div[@class='content']/div[@role='article']//div[@class='header-gnav-cart js-header-gnav-cart-v1']//span[@class='cart-confirm-wrapper__bottom-section']/div[3]/div[@class='right-copy']/a[@href='/checkout/viewcart.tmpl']"), 30);
    }*/

}
