package automationpractice.com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.Utils;
import java.util.List;

public class Clothes {
    private WebDriver driver;
    private Actions action;
    private Cart cart;
    private ShoppingActions shoppingActions;
    private WebElement dressProduct;
    private WebElement dressMenu;

    public Clothes(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getWomenBtn() {
        return Utils.waitToBeClickable(driver, By.xpath("//*[@id='block_top_menu']/ul/li[1]"), 30);
    }

    public WebElement getDressesBtn() {
        return Utils.waitToBeClickable(driver, By.xpath("//div[@id='block_top_menu']/ul/li[2]/a[@title='Dresses']"), 30);
    }

    public WebElement getTShirtsBtn() {
        return Utils.waitToBeClickable(driver, By.xpath("//*[@id='block_top_menu']/ul/li[3]"), 30);
    }

    public WebElement getDressesDropDown() {
        return Utils.waitForElementPresence(driver, By.xpath("//*[@id='block_top_menu']/ul/li[2]/ul"), 30);
    }

    public WebElement getCasualDressesBtn() {
        return Utils.waitForElementPresence(driver, By.xpath("//div[@id='block_top_menu']/ul/li[2]/ul//a[@title='Casual Dresses']"), 30);
    }

    public WebElement getEveningDressesBtn() {
        return Utils.waitForElementPresence(driver, By.xpath("//div[@id='block_top_menu']/ul/li[2]/ul//a[@title='Evening Dresses']"), 30);
    }

    public WebElement getSummerDressesBtn() {
        return Utils.waitForElementPresence(driver, By.xpath("//div[@id='block_top_menu']/ul/li[2]/ul//a[@title='Summer Dresses']"), 30);
    }

    /**
     * @param dressNum (value 1 to 3)
     */
    public WebElement getDressProduct(int dressNum) {
        return Utils.waitForElementPresence(driver, By.xpath("//*[@id=\"center_column\"]/ul/li[" + dressNum + "]"), 30);
    }

    public List<WebElement> getDressesCount() {
        return driver.findElements(By.xpath("//*[@id=\"center_column\"]/ul/li"));
    }

}