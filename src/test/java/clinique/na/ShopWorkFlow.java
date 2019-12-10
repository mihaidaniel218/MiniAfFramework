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
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        action = new Actions(driver);

        homepage = new clinique.PageObject.Homepage(driver);
        cart = new clinique.PageObject.Cart(driver);
        signinForm = new clinique.PageObject.SignInForm(driver);
        foundation = new Foundation(driver);

        String baseUrl = "https://e.clinique.na.us.stage.ncsa.elcdev.net/account/index.tmpl";
        driver.manage().window().maximize();
        driver.navigate().to(baseUrl);
/*        action.sendKeys("clinique").build().perform();
        action.sendKeys(Keys.TAB).build().perform();
        action.sendKeys("5upuq%ic").build().perform();
        action.sendKeys(Keys.ENTER).build().perform();*/


        //https://e.clinique.na.us.stage.ncsa.elcdev.net/account/index.tmpl
//Selenium-WebDriver Java Code for entering Username & Password as below:
        /*driver.switchTo().alert();
        driver.findElement(By.id("userID")).sendKeys("clinique");
        driver.findElement(By.id("password")).sendKeys("5upuq%ic");
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();*/
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
        WebDriverWait wait = new WebDriverWait(driver,50);

        action.sendKeys(Keys.ESCAPE).build().perform();
        Assert.assertTrue(homepage.getFoundationTabBtn().isDisplayed());
        action.moveToElement(homepage.getFoundationTabBtn()).perform();

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
        wait.until(ExpectedConditions.elementToBeClickable(foundation.getProductShade()));
        action.click(foundation.getProductShade()).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(foundation.getShadeLevel5()));
        action.click(foundation.getShadeLevel5()).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(foundation.getAddToBagShadeBtn()));
        action.click(foundation.getAddToBagShadeBtn()).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(foundation.getAddToBagBtn()));
        action.click(foundation.getAddToBagBtn()).perform();

/*        if(driver.findElement(By.cssSelector(".lpc_maximized-header__close-button-asset")).isDisplayed()) {
            driver.findElement(By.cssSelector(".lpc_maximized-header__close-button-asset")).click();
        };

        if(driver.findElement(By.cssSelector(".lp_close_survey_button.lpc_desktop.lpc_survey-area__close-button")).isDisplayed()) {
            driver.findElement(By.cssSelector(".lp_close_survey_button.lpc_desktop.lpc_survey-area__close-button")).click();
        };*/
/*        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();*/
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn-primary")));
        Thread.sleep(3500);

        try{
            WebElement element = driver.findElement(By.cssSelector(".lpc_maximized-header__close-button-asset"));
            if(isDisplayed(element) && isEnabled(element)){
                element.click(); // here i want if  element.click(); command
            }
            element = driver.findElement(By.cssSelector(".lp_close_survey_button.lpc_desktop.lpc_survey-area__close-button"));
            if(isDisplayed(element) && isEnabled(element)){
                element.click(); // here i want if  element.click(); command
            }
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }



        Thread.sleep(2500);
        driver.findElement(By.cssSelector(".btn-primary")).click();
        Thread.sleep(3500);

        wait.until(ExpectedConditions.visibilityOf(cart.getProductsInCart()));
        Assert.assertTrue(cart.getProductsInCart().isDisplayed());
        wait.until(ExpectedConditions.elementToBeClickable(cart.getBagIconBtn()));
        action.click(cart.getBagIconBtn()).build().perform();
        Thread.sleep(1500);
        Assert.assertEquals(cart.getQuantityOfProductsInCart().getText(), cart.getNumberOfProductsInCart().getText());
        //Thread.sleep(1500);

        Thread.sleep(1500);
        //wait.until(ExpectedConditions.elementToBeClickable(cart.getCloseCartModal()));
        //action.click(cart.getCloseCartModal()).build().perform();
        driver.findElement(By.cssSelector(".js-header-gnav-cart__close")).click();
        //Thread.sleep(1500);
        action.click(cart.getRemoveProductsFromCart()).perform();
        //Thread.sleep(1500);
        //action.click(cart.getRemoveProductsFromCart()).build().perform();
        //Thread.sleep(1500);
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

}
