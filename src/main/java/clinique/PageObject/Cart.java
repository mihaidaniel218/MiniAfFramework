package clinique.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Utils;

import java.util.Collection;
import java.util.List;

import static org.apache.commons.collections.CollectionUtils.size;

public class Cart {
    private WebDriver driver;

    By toClose = By.xpath("//*[@id='lpChat']/div[2]/div[1]/div/div[3]/button[3]");

    public By toCloseBtn(){
        return toClose;
    }

    public boolean checkToCloseButton(){
        return driver.findElement(toClose).isDisplayed();
    }

    public void clickToCloseButton(){
        driver.findElement(toClose).click();
    }

    public Cart(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getBagIconBtn() {
        return Utils.waitForElementPresence(driver, By.xpath("//*[@class='header-gnav-cart__icon svgicon svgicon--bag hide_auth']"), 30);
    }

    public WebElement getCheckoutBtn() {
        return Utils.waitForElementPresence(driver, By.xpath("//*[@id='node-249802']/div/div/div/div[2]/div[2]/div/div/span/div[3]/div[3]/a"), 30);
        //html//nav[@id='header-gnav-navigation']/div[@class='header-gnav__wrapper']/div/div[@class='content']/div[@role='article']/div[@class='content']/div[@class='field-elc-nodeblock-content']/div[@class='gnav-header-formatter js-gnav-header-formatter-v1']/div[@class='gnav-header-formatter__wrapper']//div[@class='gnav-header-formatter__bag']/div/div[@class='content']/div[@role='article']//div[@class='header-gnav-cart js-header-gnav-cart-v1']//div[@class='cart-confirm-wrapper']/span/div[3]/div[@class='right-copy']/a[@href='/checkout/viewcart.tmpl']
        //*[@id="node-249802"]/div/div/div/div[2]/div[2]/div/div/span/div[3]/div[3]/a
        //*[@id="node-249802"]/div/div/div/div[2]/div[2]/div/div/span/div[3]/div[3]/a

    }

    public WebElement getEditCartBtn() {
        return Utils.waitForElementPresence(driver, By.xpath("/html//nav[@id='header-gnav-navigation']/div[@class='header-gnav__wrapper']/div/div[@class='content']/div[@role='article']/div[@class='content']/div[@class='field-elc-nodeblock-content']/div[@class='gnav-header-formatter js-gnav-header-formatter-v1']/div[@class='gnav-header-formatter__wrapper']/div[@class='gnav-header-formatter__gnav']//div[@class='gnav-header-formatter__bag']/div/div[@class='content']/div[@role='article']//div[@class='header-gnav-cart js-header-gnav-cart-v1']//span[@class='cart-confirm-wrapper__bottom-section']/div[3]/div[@class='left-copy']/a[@href='/checkout/viewcart.tmpl']"), 30);
    }

    public WebElement getAddToBagBtn() {
        return Utils.waitForElementPresence(driver, By.xpath("/html//nav[@id='header-gnav-navigation']/div[@class='header-gnav__wrapper']/div/div[@class='content']/div[@role='article']/div[@class='content']/div[@class='field-elc-nodeblock-content']/div[@class='gnav-header-formatter js-gnav-header-formatter-v1']/div[@class='gnav-header-formatter__wrapper']/div[@class='gnav-header-formatter__gnav']//div[@class='gnav-header-formatter__bag']/div/div[@class='content']/div[@role='article']//div[@class='header-gnav-cart js-header-gnav-cart-v1']//span[@class='cart-confirm-wrapper__bottom-section']/div[3]/div[@class='right-copy']/a[@href='/checkout/viewcart.tmpl']"), 30);
    }

    public WebElement getProductNameInCart() {
        return Utils.waitForElementPresence(driver, By.xpath("//*[@id='node-249802']/div/div/div/div[2]/div[2]/div/div/div[2]/div/div/h3/a"), 30);
        //*[@id="node-249802"]/div/div/div/div[2]/div[2]/div/div/span/div[1]/div[1]
        //*[@id="node-249802"]/div/div/div/div[2]/div[2]/div/div/div[2]/div/div/h3/a
        //div[@class='prod clearfix prod-PROD5276SKU31799']
        //*[@id="node-249802"]/div/div/div/div[2]/div[2]/div/div/div[2]/div/div/h3/a

    }

    public WebElement getItemsInCart() {
        return Utils.waitForElementPresence(driver, By.xpath("//div[@class='left-copy']//span[contains(text(),'2')]"), 30);
    }

    public WebElement getProductName() {
        return Utils.waitForElementPresence(driver, By.xpath("//h3[@class='cart-product-name']//a[contains(text(),'Almost Powder Makeup Broad Spectrum SPF 18')]"), 30);
    }

    public WebElement getProductsInCart() {
        return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'Almost Powder Makeup Broad Spectrum SPF 18')]"), 30);
    }

    public WebElement getQuantityOfProductsInCart() {
        return Utils.waitForElementPresence(driver, By.xpath("//*[@id='node-249802']/div/div/div/div[2]/div[2]/div/div/div[2]/div/div/div/div[2]/span"), 30);
    }
    public WebElement getNumberOfProductsInCart() {
    return Utils.waitForElementPresence(driver, By.xpath("//*[@id='node-249802']/div/div/div/div[2]/div[2]/div/div/span/div[1]/div[1]/span[1]"),30);
    }


    //*[@id="node-249802"]/div/div/div/div[2]/div[2]/div/div/span/div[1]/div[1]/span[1]
    //*[@id="node-249802"]/div/div/div/div[2]/div[2]/div/div/div[2]/div/div/div/div[2]/span


    public WebElement getRemoveProductsFromCart() {
        return Utils.waitForElementPresence(driver, By.id("remove_97124"), 30);
    }

    public WebElement getChatPopup() {
        return Utils.waitForElementPresence(driver, By.xpath("//img[@alt='Close chat']"), 30);
    }

    public WebElement getCloseCartModal() {
        return Utils.waitForElementPresence(driver, By.cssSelector(".js-header-gnav-cart__close"), 30);
    }
    //*[@id="x-16"]/path
    //*[@id="node-249802"]/div/div/div/div[2]/div[1]/sv
    //*[@id='node-249802']/div/div/div/div[2]/div[1]/svg
    // Viewcart Page


}
