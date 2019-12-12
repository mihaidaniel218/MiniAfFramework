package clinique.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Utils;

public class Cart {
    private WebDriver driver;

    private By toClose = By.xpath("//*[@id='lpChat']/div[2]/div[1]/div/div[3]/button[3]");
    private By BagIconBtn = By.xpath("//*[@class='header-gnav-cart__icon svgicon svgicon--bag hide_auth']");
    private By ProductsInCart = By.xpath("//a[contains(text(),'Almost Powder Makeup Broad Spectrum SPF 18')]");
    private By QuantityOfProductsInCart = By.xpath("//*[@id='node-249802']/div/div/div/div[2]/div[2]/div/div/div[2]/div/div/div/div[2]/span");
    private By NumberOfProductsInCart = By.xpath("//*[@id='node-249802']/div/div/div/div[2]/div[2]/div/div/span/div[1]/div[1]/span[1]");
    private By RemoveProductsFromCart = By.id("remove_97124");
    private By CheckoutBtn = By.xpath("//*[@id='node-249802']/div/div/div/div[2]/div[2]/div/div/span/div[3]/div[3]/a");
    private By EditCartBtn = By.xpath("/html//nav[@id='header-gnav-navigation']/div[@class='header-gnav__wrapper']/div/div[@class='content']/div[@role='article']/div[@class='content']/div[@class='field-elc-nodeblock-content']/div[@class='gnav-header-formatter js-gnav-header-formatter-v1']/div[@class='gnav-header-formatter__wrapper']/div[@class='gnav-header-formatter__gnav']//div[@class='gnav-header-formatter__bag']/div/div[@class='content']/div[@role='article']//div[@class='header-gnav-cart js-header-gnav-cart-v1']//span[@class='cart-confirm-wrapper__bottom-section']/div[3]/div[@class='left-copy']/a[@href='/checkout/viewcart.tmpl']");
    private By AddToBagBtn = By.xpath("/html//nav[@id='header-gnav-navigation']/div[@class='header-gnav__wrapper']/div/div[@class='content']/div[@role='article']/div[@class='content']/div[@class='field-elc-nodeblock-content']/div[@class='gnav-header-formatter js-gnav-header-formatter-v1']/div[@class='gnav-header-formatter__wrapper']/div[@class='gnav-header-formatter__gnav']//div[@class='gnav-header-formatter__bag']/div/div[@class='content']/div[@role='article']//div[@class='header-gnav-cart js-header-gnav-cart-v1']//span[@class='cart-confirm-wrapper__bottom-section']/div[3]/div[@class='right-copy']/a[@href='/checkout/viewcart.tmpl']");
    private By ProductNameInCart = By.xpath("//*[@id='node-249802']/div/div/div/div[2]/div[2]/div/div/div[2]/div/div/h3/a");
    private By ItemsInCart = By.xpath("//div[@class='left-copy']//span[contains(text(),'2')]");
    private By ProductName = By.xpath("//h3[@class='cart-product-name']//a[contains(text(),'Almost Powder Makeup Broad Spectrum SPF 18')]");
    private By ChatPopup = By.xpath("//img[@alt='Close chat']");
    private By CloseCartModal = By.cssSelector(".header-gnav-cart.js-header-gnav-cart-v1  .gnav-header-formatter__close > svg[role='img']");
    // cssSelector = [class='svgicon svgicon--x-16 hide_auth gnav-header-formatter__close-icon js-header-gnav-cart__close']
    //.js-header-gnav-cart__close

    public Cart(WebDriver driver) {
        this.driver = driver;
    }

    public By toCloseBtn() {
        return toClose;
    }

    public By toBagIconBtn() {
        return BagIconBtn;
    }

    public boolean checkToCloseButton() {
        return driver.findElement(toClose).isDisplayed();
    }

    public void clickToCloseButton() {
        driver.findElement(toClose).click();
    }

    public WebElement getBagIconBtn() {
        return Utils.waitForElementPresence(driver, toBagIconBtn(), 30);
    }

    public WebElement getProductsInCart() {
        return Utils.waitForElementPresence(driver, ProductsInCart, 30);
    }

    public WebElement getQuantityOfProductsInCart() {
        return Utils.waitForElementPresence(driver, QuantityOfProductsInCart, 30);
    }

    public WebElement getNumberOfProductsInCart() {
        return Utils.waitForElementPresence(driver, NumberOfProductsInCart, 30);
    }

    public WebElement getRemoveProductsFromCart() {
        return Utils.waitForElementPresence(driver, RemoveProductsFromCart, 30);
    }

    public WebElement getCheckoutBtn() {
        return Utils.waitForElementPresence(driver, CheckoutBtn, 30);
    }

    public WebElement getEditCartBtn() {
        return Utils.waitForElementPresence(driver, EditCartBtn, 30);
    }

    public WebElement getAddToBagBtn() {
        return Utils.waitForElementPresence(driver, AddToBagBtn, 30);
    }

    public WebElement getProductNameInCart() {
        return Utils.waitForElementPresence(driver, ProductNameInCart, 30);
    }

    public WebElement getItemsInCart() {
        return Utils.waitForElementPresence(driver, ItemsInCart, 30);
    }

    public WebElement getProductName() {
        return Utils.waitForElementPresence(driver, ProductName, 30);
    }

    public WebElement getChatPopup() {
        return Utils.waitForElementPresence(driver, ChatPopup, 30);
    }

    public WebElement getCloseCartModal() {
        return Utils.waitForElementPresence(driver, CloseCartModal, 30);
    }

}
