package clinique.na;

import automationpractice.com.pageObject.Account;
import clinique.PageObject.ShoppingActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import clinique.PageObject.Cart;
import automationpractice.com.pageObject.CartSummary;
import automationpractice.com.pageObject.Clothes;
import clinique.PageObject.Foundation;
import clinique.PageObject.SignInForm;
import clinique.PageObject.Homepage;

import java.util.concurrent.TimeUnit;


public class ShopWorkFlow {

    private WebDriver driver;
    private Actions action;


    private Cart cart;
    private Foundation foundation;
    private CartSummary summary;
    private SignInForm signinForm;
    private Homepage homepage;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        action = new Actions(driver);


        homepage = new clinique.PageObject.Homepage(driver);
        cart = new clinique.PageObject.Cart(driver);
        signinForm = new clinique.PageObject.SignInForm(driver);
        foundation = new Foundation(driver);

        String baseUrl = "https://e.clinique.na.us.stage.ncsa.elcdev.net/account/index.tmpl";
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @AfterClass
    public void closeAll() {
        //account.getAccountLogout().click();
        driver.quit();
    }

    @Test(priority = 1)
    public void loginUser() throws InterruptedException {
        action.sendKeys(Keys.ESCAPE).build().perform();
        Thread.sleep(1500);
        action.sendKeys(Keys.ESCAPE).build().perform();
        Thread.sleep(1500);
        action.sendKeys(Keys.ESCAPE).build().perform();
        Thread.sleep(1500);
        signinForm.setEmailField("mdaniel219test@mailinator.com");
        signinForm.setPasswordField("cliniqueClient20");
        action.sendKeys(Keys.ESCAPE).build().perform();
        action.click(signinForm.getSignInTermsAnsConditionsBtn()).build();
        Thread.sleep(1500);
        action.click(signinForm.getSignInTermsAnsConditionsBtn()).build().perform();
        action.sendKeys(Keys.ESCAPE).build().perform();
        action.click(signinForm.getJoinNowBtn()).build();
        Thread.sleep(1500);
        action.click(signinForm.getJoinNowBtn()).build().perform();
        Thread.sleep(1500);
        if(signinForm.getAccountExistsWarning().isDisplayed()) {
            signinForm.setReturnPasswordField("cliniqueClient20");
            action.click(signinForm.getReturnSignInBtn()).build();
            Thread.sleep(1500);
            action.click(signinForm.getReturnSignInBtn()).build().perform();
        }
    }

    @Test(priority = 2)
    public void buyProduct() throws InterruptedException {
        Thread.sleep(3500);
        action.sendKeys(Keys.ESCAPE).build().perform();
        Assert.assertTrue(homepage.getFoundationTabBtn().isDisplayed());
        action.moveToElement(homepage.getFoundationTabBtn()).perform();
        Thread.sleep(3500);
        action.click(homepage.getFoundationTabBtn()).build().perform();
        Thread.sleep(1500);
        Assert.assertTrue(foundation.getFoundationsBanner().isDisplayed());
        Thread.sleep(1500);
        Assert.assertTrue(foundation.getNewProduct().isDisplayed());
        Thread.sleep(1500);
        //action.moveToElement(foundation.getNewProduct()).perform();
        Thread.sleep(6000);
        action.click(foundation.getNewProduct()).build().perform();
        Thread.sleep(2500);
        action.click(foundation.getAddToBagBtn()).perform();
        Thread.sleep(2500);

        action.click(cart.getCheckoutBtn()).perform();
        Thread.sleep(1500);
        action.click(cart.getCheckoutBtn()).build().perform();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//img[@alt='Close chat']")).click();
        Assert.assertTrue(cart.getProductsInCart().isDisplayed());
        Assert.assertTrue(cart.getQuantityOfProductsInCart().isDisplayed());

        action.click(cart.geRemoveProductsFromCart()).perform();
        Thread.sleep(1500);
        action.click(cart.geRemoveProductsFromCart()).build().perform();
        Thread.sleep(1500);
/*        action.click(homepage.getFoundationTabBtn()).build().perform();
        Thread.sleep(1500);
        Assert.assertTrue(homepage.getFoundationTabBtn().isDisplayed());*/

    }
}