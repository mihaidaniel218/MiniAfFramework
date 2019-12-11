package clinique.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class Foundation {

    private WebDriver driver;
    private By FoundationsBanner = By.cssSelector(".block.block-nodeblock.block-nodeblock-249396.block-template-hero-full-width-v1 > .content > div[role='article'] .content-block__content.horizontal-align-start.justify-center");
    private By NewMouseOverProduct = By.xpath("///a[@innertext>'More than minerals. Long-wear formula helps keep pores out o']");
    private By NewProduct = By.xpath("//a[contains(text(),'Almost Powder Makeup Broad Spectrum SPF 18')]");
    private By BestSellerProduct = By.xpath("///a[@innertext>'Dermatologist-developed foundation perfects instantly, lasts']");
    private By AddToBagBtn = By.xpath("//*[@id='content']/div/div/div/div[1]/div/div/div[2]/div[1]/div[2]/div[6]/div/div/div[2]/div/div/div/button");
    private By ProductShade = By.cssSelector(".ProductShadesSidebarButton__StyledSquareIcon-pxsl7q-1.hVRVvH");
    private By ShadeLevel4 = By.cssSelector("[class] [class] [color='\\#DCB286']:nth-child(3)");
    private By ShadeLevel5 = By.cssSelector("[class] [class] [color='\\#D5A179']:nth-child(2)");
    private By ShadeLevel6 = By.cssSelector("[class] [class] [color='\\#D7AA8E']:nth-child(2)");
    private By AddToBagShadeBtn = By.cssSelector("[class='ProductShadesSidebarContent__StyledAddToBagButton-u5w55u-13 iTPdRG ProductFullAddToBagButton__Wrapper-injdp6-0 NppMt'] [data-test-id]");
    private By CloseCliniqueSmartRewards = By.xpath("//*[@id='foreground-node']/div[1]/a");
    private By Quantity = By.xpath("//div[@safeclass~'\\bdxkWNN\\b.*\\belc-spinner-selector-data-wrapper\\b.*\\bjs-spinner-selector-data-wrapper\\b']/h6[@innertext='1']");
    private By IncreaseQuantity = By.xpath("//div[@safeclass~'\bdxkWNN\b.*\belc-spinner-selector-data-wrapper\b.*\bjs-spinner-selector-data-wrapper\b']/h6[@innertext='1']");
    private By DecreaseQuantity = By.xpath("//button[@safeclass~'\\belc-spinner-selector-button\\b.*\\biiwOfT\\b.*\\bjs-spinner-selector-button-back\\b']/svg[@safeclass~'\\belc-spinner-minus-icon\\b.*\\bjs-spinner-minus-icon\\b.*\\bvqYoT\\b']");
    private By CloseChatBtn = By.xpath("/html/body/div[13]/table//a/img[@alt='Close chat']");
    public Foundation(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFoundationsBanner() {
        return Utils.waitForElementPresence(driver, FoundationsBanner, 30);
    }

    public WebElement getNewMouseOverProduct() {
        return Utils.waitForElementPresence(driver, NewMouseOverProduct, 30);
    }

    public WebElement getNewProduct() {
        return Utils.waitForElementPresence(driver, NewProduct, 30);
    }

    public WebElement getAddToBagBtn() {
        return Utils.waitForElementPresence(driver, AddToBagBtn, 30);
    }

    public WebElement getProductShade() {
        return Utils.waitForElementPresence(driver, ProductShade, 30);
    }

    public WebElement getShadeLevel4() {
        return Utils.waitForElementPresence(driver, ShadeLevel4, 30);
    }

    public WebElement getShadeLevel5() {
        return Utils.waitForElementPresence(driver, ShadeLevel5, 30);
    }

    public WebElement getShadeLevel6() {
        return Utils.waitForElementPresence(driver, ShadeLevel6, 30);
    }

    public WebElement getAddToBagShadeBtn() {
        return Utils.waitForElementPresence(driver, AddToBagShadeBtn, 30);
    }

    public WebElement getCloseCliniqueSmartRewards() {
        return Utils.waitForElementPresence(driver, CloseCliniqueSmartRewards, 30);
    }

    public WebElement getCloseChatBtn() {
        return Utils.waitForElementPresence(driver, CloseChatBtn, 30);
    }

    public WebElement getQuantity() {
        return Utils.waitForElementPresence(driver, Quantity, 30);
    }

    public WebElement getIncreaseQuantity() {
        return Utils.waitForElementPresence(driver, IncreaseQuantity, 30);
    }

    public WebElement getDecreaseQuantity() {
        return Utils.waitForElementPresence(driver, DecreaseQuantity, 30);
    }

    public WebElement getBestSellerProduct() {
        return Utils.waitForElementPresence(driver, BestSellerProduct, 30);
    }
}
