package utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Utils {

	/**
	 * 
	 * This function will take screenshot
	 * 
	 * @param webdriver
	 * @param fileWithPath
	 * @throws Exception
	 * 
	 */

	public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {
		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		// Move image file to new destination
		File DestFile = new File(fileWithPath);
		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}

	/**
	 * 
	 * This function will check element presence
	 * 
	 * @param webdriver
	 * @param selector
	 * 
	 */
	public static boolean isPresent(WebDriver webdriver, By selector) {
		// try to find element by specified selector
		try {
			webdriver.findElement(selector);
		} catch (NoSuchElementException e) {
			// if element not exist return false
			return false;
		}
		return true;
	}
	
	/**
	 *  (displayed and enabled)
	 * @return WebElement selected element
	 * @param driver
	 * @param xpath
	 * @param i
	 */
	public static WebElement waitToBeClickable(WebDriver driver, By xpath, int i) {
		long waitInterval = 10;
		WebElement element = (new WebDriverWait(driver, waitInterval)).until(ExpectedConditions.elementToBeClickable(xpath));
		return element;
	}
	
	/**
	 *
	 * The method waits for the element with the forwarded selector to appear in the DOM tree
	 * @param driver - web driver
	 * @param selector -  element selector whose presence we are waiting for
	 * @param waitInterval - * the time the driver will wait for the element to appear in the DOM tree
	 * @return WebElement selected element
	 */
	public static WebElement waitForElementPresence(WebDriver driver, By selector, int waitInterval) {
		WebElement element = (new WebDriverWait(driver, waitInterval)).until(ExpectedConditions.presenceOfElementLocated(selector));
		return element;
	}
	
	/**
	 * The method waits for the page title to become equal to the forwarded string
	 * @param driver
	 * @param title - the title we are waiting for
	 * @param waitInterval - 	 * the time the driver will wait for the element to appear in the DOM tree
	 */
	public static void waitForTitle(WebDriver driver, String title, int waitInterval){
		 (new WebDriverWait(driver, waitInterval)).until(ExpectedConditions.titleIs(title));
	}

}
