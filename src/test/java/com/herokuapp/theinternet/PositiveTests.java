package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class PositiveTests {
    @Test(priority = 1, invocationCount = 3, groups = {"positiveTests", "smoketests"})
    public void loginTest() throws InterruptedException {
        System.out.println("Starting login test");
//        open test Page
//        enter username
//        enter password
//        click login JButton
//        assert page, new url, logout button visible, succesfull login message
        //System.setProperty("webdriver.chrome.driver", "D:/Projects/MiniAfFramework/src/main/resources/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "D:/Projects/MiniAfFramework/src/main/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        String testUrl = "http://the-internet.herokuapp.com";
        driver.get(testUrl);
        System.out.println("Page is Opened.");
        //sleep(1000);
        driver.manage().window().maximize();

        WebElement formauthetication = driver.findElement(By.xpath("//a[contains(text(),'Form Authentication')]"));
        formauthetication.click();
        //sleep(1000);

        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginbutton = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));

        username.sendKeys("tomsmith");
        password.sendKeys("SuperSecretPassword!");
        loginbutton.click();

        String expectedUrl = "http://the-internet.herokuapp.com/secure";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl, "Expected Url is not the same as actual URL");


        //sleep(1000);

        WebElement logOutButton = driver.findElement(By.xpath("//i[@class='icon-2x icon-signout']"));
        Assert.assertTrue(logOutButton.isDisplayed(), "Logout Button is not visible!");
        logOutButton.click();

        //sleep(1000);

        WebElement successMessage = driver.findElement(By.xpath("//div[@id='flash']"));
        String expectedMessage = "You logged out of the secure area";
        String actualMessage = successMessage.getText().substring(0, 34);
        Assert.assertTrue(actualMessage.contains(expectedMessage), "Actual message does not contain expected message.\nActual message: " + actualMessage + "\nExpected Message: " + expectedMessage);
        System.out.println("Logout Successful");
        //sleep(2000);

        //close brower
        driver.close();
    }


    private void sleep(long m) {
        try {
            Thread.sleep(m);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
