package automationpractice.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationpractice.com.pageObject.Account;
import automationpractice.com.pageObject.Cart;
import automationpractice.com.pageObject.CartSummary;
import automationpractice.com.pageObject.Clothes;
import automationpractice.com.pageObject.ShoppingActions;
import automationpractice.com.pageObject.SignInForm;

import java.util.concurrent.TimeUnit;

public class ShopWorkflowTest {

    private WebDriver driver;
    private Actions action;

    private Clothes clothes;
    private Cart cart;
    private ShoppingActions shoppingActions;
    private CartSummary summary;
    private SignInForm signinForm;
    private Account account;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;

        action = new Actions(driver);

        clothes = new Clothes(driver);
        cart = new Cart(driver);
        shoppingActions = new ShoppingActions(driver);
        signinForm = new SignInForm(driver);
        summary = new CartSummary(driver);
        account = new Account(driver);

        String baseUrl = "http://automationpractice.com/index.php";
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @AfterClass
    public void closeAll() {
        //account.getAccountLogout().click();
        driver.quit();
    }

    @Test(priority = 1)
    public void selectClothes() {
        int i = 1;
        // Assert dresses buttons are shown
        Assert.assertTrue(clothes.getDressesBtn().isDisplayed());

        action.moveToElement(clothes.getDressesBtn()).perform();

        Assert.assertTrue(clothes.getSummerDressesBtn().isDisplayed());
        Assert.assertTrue(clothes.getCasualDressesBtn().isDisplayed());
        Assert.assertTrue(clothes.getEveningDressesBtn().isDisplayed());

        // buy 1st Dress
        // Go to Summer Dresses section
        buyDress(clothes.getDressesBtn(), clothes.getSummerDressesBtn(), 3, 1);
 /*       action.moveToElement(clothes.getSummerDressesBtn()).perform();
        clothes.getSummerDressesBtn().click();

        while (i <= clothes.getDressesCount().size()) {Assert.assertTrue(clothes.getDressProduct(i).isDisplayed()); i += 1;}
        Assert.assertEquals(clothes.getDressesCount().size(), 3);

        // Add 1st Dress from Summer Dresses to cart

        action.moveToElement(clothes.getDressProduct(1)).perform();
        action.moveToElement(shoppingActions.getAddToCartBtn()).perform();

        Assert.assertTrue(shoppingActions.getAddToCartBtn().isDisplayed());

        action.click(shoppingActions.getAddToCartBtn()).build().perform();
        // Click Continue shopping button
        action.click(shoppingActions.getContinueShopingBtn()).build().perform();

        Assert.assertTrue(shoppingActions.getContinueShopingBtn().isDisplayed());*/

        // Assert that 1st Dress is in the cart
/*        action.moveToElement(cart.getCartTab()).perform();

        Assert.assertEquals(cart.getCartProductsQty().size(), 1);*/

        // Add 2nd dress to cart
        buyDress(clothes.getDressesBtn(), clothes.getCasualDressesBtn(), 1, 2);
/*        action.moveToElement(clothes.getDressesBtn()).perform();

        Assert.assertTrue(clothes.getCasualDressesBtn().isDisplayed());

        action.moveToElement(clothes.getCasualDressesBtn()).perform();
        clothes.getCasualDressesBtn().click();
        action.moveToElement(clothes.getCasualDressProduct(1)).perform();
        action.moveToElement(shoppingActions.getAddToCartBtn()).perform();
        action.click(shoppingActions.getAddToCartBtn()).build().perform();

        Assert.assertTrue(shoppingActions.getAddToCartBtn().isDisplayed());

        action.click(shoppingActions.getContinueShopingBtn()).build().perform();
        action.moveToElement(cart.getCartTab()).perform();

        Assert.assertEquals(cart.getCartProductsQty().size(), 2);*/

        // Add 3rd dress to cart
        buyDress(clothes.getDressesBtn(), clothes.getEveningDressesBtn(), 1, 3);

/*        action.moveToElement(clothes.getDressesBtn()).perform();

        Assert.assertTrue(clothes.getEveningDressesBtn().isDisplayed());

        action.moveToElement(clothes.getEveningDressesBtn()).perform();
        clothes.getEveningDressesBtn().click();
        action.moveToElement(clothes.getDressProduct(1)).perform();
        action.moveToElement(shoppingActions.getAddToCartBtn()).perform();
        action.click(shoppingActions.getAddToCartBtn()).build().perform();

        Assert.assertTrue(shoppingActions.getAddToCartBtn().isDisplayed());

        action.click(shoppingActions.getContinueShopingBtn()).build().perform();
        action.moveToElement(cart.getCartTab()).perform();
        // Assert that 3 products are in the cart
        Assert.assertEquals(cart.getCartProductsQty().size(), 3);*/
    }

    private void buyDress(WebElement dressMenu, WebElement dressProduct, int index, int numOfProductsInCart) {
        int i = 1;
        action.moveToElement(dressMenu).perform();
        while (i <= clothes.getDressesCount().size()) {Assert.assertTrue(clothes.getDressProduct(i).isDisplayed()); i += 1;}
        Assert.assertTrue(dressProduct.isDisplayed());
        action.moveToElement(dressProduct).perform();
        dressProduct.click();

        action.moveToElement(clothes.getDressProduct(1)).perform();
        action.moveToElement(shoppingActions.getAddToCartBtn()).perform();
        action.click(shoppingActions.getAddToCartBtn()).build().perform();

        action.click(shoppingActions.getContinueShopingBtn()).build().perform();
        action.moveToElement(cart.getCartTab()).perform();

        Assert.assertEquals(cart.getCartProductsQty().size(), numOfProductsInCart);

    }


}
