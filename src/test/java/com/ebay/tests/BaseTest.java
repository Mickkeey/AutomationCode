package com.ebay.tests;

import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import locators.BasePage;
import locators.HomePageLocators;
import locators.ListingPageLocators;

public class BaseTest {

	BasePage basePage;
	HomePageLocators homeLocators;
	ListingPageLocators listingLocators;
	static WebDriver driver = new ChromeDriver();
	Logger log = Logger.getLogger(getClass().getSimpleName());
	protected static String url = "";

	@BeforeTest(alwaysRun = true)
	@Parameters({ "BaseURL" })
	public void BaseSetUp(String BaseURL) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
		BasePage.setDriver(driver);
		basePage = PageFactory.initElements(driver, BasePage.class);
		homeLocators = PageFactory.initElements(driver, HomePageLocators.class);
		listingLocators = PageFactory.initElements(driver, ListingPageLocators.class);
		log.info("Open Home Page");
		driver.get(BaseURL);

	}
}