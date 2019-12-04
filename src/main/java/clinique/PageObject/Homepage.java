package clinique.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

    private WebDriver driver;

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSignInBtn() {
        return utils.Utils.waitToBeClickable(driver, By.cssSelector(".gnav-header-formatter__top a[title='Sign In'] > .header-gnav-account-link--anon.header-gnav-account-link__text.js-header-gnav-account-link--anon"), 30);
    }

    public WebElement getLogInBtn() {
        return utils.Utils.waitToBeClickable(driver, By.cssSelector("//a[contains(text(),'Log in')]"), 30);
    }

    public WebElement getFoundationTabBtn() {
        return utils.Utils.waitToBeClickable(driver, By.xpath("//a[@class='header-gnav-section__link js-header-gnav-section__link--direct'][contains(text(),'Foundation')]"), 30);
    }

    public WebElement getFooterBanners() {
        return utils.Utils.waitForElementPresence(driver, By.id("htmlcontent_home"), 30);
    }

    public WebElement searchQuery() {
        return utils.Utils.waitForElementPresence(driver, By.xpath("//*[@class='gnav-header-utility-icon header-gnav-search-block__search-icon svgicon svgicon--search-icon hide_auth']"), 30);
    }

    public WebElement submitSearch() {
        return utils.Utils.waitForElementPresence(driver, By.xpath("//input[@class='search-submit']"), 30);
    }

    public WebElement searchInputModal() {
        return utils.Utils.waitForElementPresence(driver, By.id("//input[@id='search']"), 30);
    }

}