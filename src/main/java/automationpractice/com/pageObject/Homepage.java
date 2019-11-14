package automationpractice.com.pageObject;

import org.jcp.xml.dsig.internal.dom.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	private WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getSignInBtn() {
		//return driver.findElement(By.xpath("//a[contains(text(), \"Sign in\")]"));
		return utils.Utils.waitToBeClickable(driver, By.xpath("//a[contains(text(), \'Sign in\')]"), 30);
	}
	
	public WebElement getHomePageSlider() {
		return utils.Utils.waitForElementPresence(driver, By.id("homepage-slider"), 30);
	}
	
	public WebElement getContainerPopular() {
		return utils.Utils.waitForElementPresence(driver, By.id("homefeatured"), 30);
	}
	
	public WebElement getFooterBanners() {
		return utils.Utils.waitForElementPresence(driver, By.id("htmlcontent_home"), 30);
	}

	public WebElement contactPhone() {
		return utils.Utils.waitForElementPresence(driver, By.xpath("//strong[contains(text(),'0123-456-789')]"), 30);
	}

	public WebElement searchQuery() {
		return utils.Utils.waitForElementPresence(driver, By.xpath("//input[@id='search_query_top']"), 30);
	}

	public WebElement submitSearch() {
		return utils.Utils.waitForElementPresence(driver, By.xpath("//button[@name='submit_search']"), 30);
	}

	public WebElement headingCounter() {
		return utils.Utils.waitForElementPresence(driver, By.xpath("//span[@class='heading-counter']"), 30);
	}


}
