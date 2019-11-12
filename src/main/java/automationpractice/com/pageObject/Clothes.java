package automationpractice.com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import utils.Utils;
import automationpractice.com.pageObject.ShoppingActions;
import automationpractice.com.pageObject.Cart;

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

/*    *//**@param dressNum (value 1) *//*
    public WebElement getCasualDressProduct(int dressNum) {
        return Utils.waitForElementPresence(driver, By.xpath("//*[@id=\"center_column\"]/ul/li[" + dressNum + "]"), 30);
    }

    *//**@param dressNum (value 1) *//*
    public WebElement getEveningDressProduct(int dressNum) {
        return Utils.waitForElementPresence(driver, By.xpath("//*[@id=\"center_column\"]/ul/li[" + dressNum + "]"), 30);
    }

    *//**@param dressNum (value 1 to 3) *//*
    public WebElement getSummerDressProduct(int dressNum) {
        return Utils.waitForElementPresence(driver, By.xpath("//*[@id=\"center_column\"]/ul/li[" + dressNum + "]"), 30);*/
    //}

    /**@param dressNum (value 1 to 3) */
    public WebElement getDressProduct(int dressNum) {
        return Utils.waitForElementPresence(driver, By.xpath("//*[@id=\"center_column\"]/ul/li[" + dressNum + "]"), 30);
    }

    public List<WebElement> getDressesCount() {
        return driver.findElements(By.xpath("//*[@id=\"center_column\"]/ul/li"));
    }

/*    public void buyDress(WebElement dressMenu, WebElement dressProduct, int index, int numOfProductsInCart) {
        this.dressMenu = dressMenu;
        this.dressProduct = dressProduct;
        int i = 1;
        action.moveToElement(dressMenu).perform();
        while (i <= getDressesCount().size()) {Assert.assertTrue(getDressProduct(i).isDisplayed()); i += 1;}
        Assert.assertTrue(dressProduct.isDisplayed());
        action.moveToElement(dressProduct).perform();
        dressProduct.click();

        action.moveToElement(getDressProduct(1)).perform();
        action.moveToElement(shoppingActions.getAddToCartBtn()).perform();
        action.click(shoppingActions.getAddToCartBtn()).build().perform();

        action.click(shoppingActions.getContinueShopingBtn()).build().perform();
        action.moveToElement(cart.getCartTab()).perform();

        Assert.assertEquals(cart.getCartProductsQty().size(), numOfProductsInCart);

    }*/

}


