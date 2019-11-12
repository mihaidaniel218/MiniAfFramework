package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class NegativeTests {
    @Parameters({ "username", "password", "expectedMessage" })
    @Test(priority = 1, invocationCount = 3, groups = {"negativeTests", "smoketests"})
    public void loginNLGTest(String username, String password, String expectedMessage) throws InterruptedException {
        System.out.println("Starting login test");
//        open test Page
//        enter username
//        enter password
//        click login JButton
//        assert page, new url, logout button visible, succesfull login message
        System.setProperty("webdriver.chrome.driver", "D:/Projects/MiniAfFramework/src/main/resources/chromedriver.exe");
        //System.setProperty("webdriver.gecko.driver", "D:/Projects/MiniAfFramework/src/main/resources/geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        String testUrl = "http://the-internet.herokuapp.com";
        driver.get(testUrl);
        System.out.println("Page is Opened.");
        //sleep(1000);
        driver.manage().window().maximize();

        WebElement formauthetication = driver.findElement(By.xpath("//a[contains(text(),'Form Authentication')]"));
        formauthetication.click();
        //sleep(1000);

        WebElement usernameElement = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement passwordElement = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginbutton = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));

        usernameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginbutton.click();

        String expectedUrl = "http://the-internet.herokuapp.com/login";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl, "Expected Url is not the same as actual URL");

        //sleep(2000);

        WebElement loginMessage = driver.findElement(By.xpath("//div[@id='flash']"));
        //String expectedMessage = "Your username is invalid!";
        String actualMessage = loginMessage.getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage), "Actual message does not contain expected message.\nActual message: " + actualMessage + "\nExpected Message: " + expectedMessage);
        System.out.println("Login failed expected - username incorrect");
        //sleep(2000);

        //close browser
        driver.close();
    }

    @Test(priority = 2, invocationCount = 3, groups = {"negativeTests"})
    /*public void loginNPTest() throws InterruptedException {
        System.out.println("Starting login test");
//        open test Page
//        enter username
//        enter password
//        click login JButton
//        assert page, new url, logout button visible, succesfull login message
        System.setProperty("webdriver.chrome.driver", "D:/Projects/MiniAfFramework/src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
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
        password.sendKeys("NotSoSecretPassword!");
        loginbutton.click();

        String expectedUrl = "http://the-internet.herokuapp.com/login";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl, "Expected Url is not the same as actual URL");

        //sleep(2000);

        WebElement loginMessage = driver.findElement(By.xpath("//div[@id='flash']"));
        String expectedMessage = "Your password is invalid!";
        String actualMessage = loginMessage.getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage), "Actual message does not contain expected message.\nActual message: " + actualMessage + "\nExpected Message: " + expectedMessage);
        System.out.println("Login failed expected - password incorrect");
        //sleep(2000);

        //close browser
        driver.close();
    }
*/
    private void sleep(long m) {
        try {
            Thread.sleep(m);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
