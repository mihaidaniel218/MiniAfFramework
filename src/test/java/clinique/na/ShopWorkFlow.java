package clinique.na;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import clinique.PageObject.Cart;
import clinique.PageObject.Foundation;
import clinique.PageObject.SignInForm;
import clinique.PageObject.Homepage;

import java.util.concurrent.TimeUnit;


public class ShopWorkFlow {

    private WebDriver driver;
    private Actions action;
    private Cart cart;
    private Foundation foundation;
    private SignInForm signinForm;
    private Homepage homepage;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        action = new Actions(driver);

        homepage = new clinique.PageObject.Homepage(driver);
        cart = new clinique.PageObject.Cart(driver);
        signinForm = new clinique.PageObject.SignInForm(driver);
        foundation = new Foundation(driver);

        String baseUrl = "https://clinique:5upuq%ic@e.clinique.na.us.stage.ncsa.elcdev.net/account/index.tmpl";
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.navigate().to(baseUrl);
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
        Thread.sleep(3000);
        signinForm.setEmailField("mdaniel219test@mailinator.com");
        Thread.sleep(1500);
        signinForm.setPasswordField("cliniqueCL22");
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
            Thread.sleep(500);
            signinForm.setReturnPasswordField("cliniqueCL22");
            Thread.sleep(500);
            action.click(signinForm.getReturnSignInBtn()).build();
            Thread.sleep(1500);
            action.click(signinForm.getReturnSignInBtn()).build().perform();
        }
    }
    @Test(priority = 2)
    public void buyProduct() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,10);

        action.sendKeys(Keys.ESCAPE).build().perform();
        Assert.assertTrue(homepage.getFoundationTabBtn().isDisplayed());
        action.moveToElement(homepage.getFoundationTabBtn()).perform();
     // Set up Foundation stage
        foundationSetup();
        // Choose a shade for the selected product
        shadeSelection();
        //Cart flow operations for the chosen product
        cartOperations();

        action.click(homepage.getFoundationTabBtn()).perform();
        Thread.sleep(1500);
        Assert.assertTrue(homepage.getFoundationTabBtn().isDisplayed());
    }

    private boolean isDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    private boolean isEnabled(WebElement element) {
        try {
            return element.isEnabled();
        } catch (Exception e) {
            return false;
        }
    }

    private void foundationSetup() {
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(homepage.getFoundationTabBtn()));
        action.click(homepage.getFoundationTabBtn()).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(foundation.getCloseCliniqueSmartRewards()));
        action.click(foundation.getCloseCliniqueSmartRewards()).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(foundation.getFoundationsBanner()));
        Assert.assertTrue(foundation.getFoundationsBanner().isDisplayed());
        wait.until(ExpectedConditions.visibilityOf(foundation.getNewProduct()));
        Assert.assertTrue(foundation.getNewProduct().isDisplayed());
        wait.until(ExpectedConditions.elementToBeClickable(foundation.getNewProduct()));
        action.click(foundation.getNewProduct()).build().perform();
    }

    private void shadeSelection() {
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(foundation.getProductShade()));
        action.click(foundation.getProductShade()).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(foundation.getShadeLevel5()));
        action.click(foundation.getShadeLevel5()).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(foundation.getAddToBagShadeBtn()));
        action.click(foundation.getAddToBagShadeBtn()).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(foundation.getCloseShadeModalBtn()));
        action.click(foundation.getCloseShadeModalBtn()).build().perform();
    }

    private void cartOperations() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn-primary")));
        Thread.sleep(2000);
        Cart cart2 = new Cart(driver);
        try {
            if (cart2.checkToCloseButton())
                cart2.clickToCloseButton();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".btn-primary")).click();
        wait.until(ExpectedConditions.visibilityOf(cart.getProductsInCart()));
        Assert.assertTrue(cart.getProductsInCart().isDisplayed());
        wait.until(ExpectedConditions.elementToBeClickable(cart.getBagIconBtn()));
        action.click(cart.getBagIconBtn()).build().perform();
        Thread.sleep(1500);
        Assert.assertEquals(cart.getQuantityOfProductsInCart().getText(), cart.getNumberOfProductsInCart().getText());
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".js-header-gnav-cart__close")).click();
        action.click(cart.getRemoveProductsFromCart()).perform();
        Thread.sleep(1500);
        action.click(cart.getRemoveProductsFromCart()).build().perform();
        Thread.sleep(1500);
    }

}
