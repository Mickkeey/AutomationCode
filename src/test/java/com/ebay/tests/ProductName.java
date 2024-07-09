package com.ebay.tests;

import java.util.List;
import org.openqa.selenium.WebElement;
import locators.ListingPageLocators;

public class ProductName extends BaseTest {
	public void nProductName(int NumberofItems) {
		List<WebElement> productTitles = ListingPageLocators.productNames();
		List<WebElement> nProductsTitles = productTitles.subList(0, Math.min(11, productTitles.size()));

		for (WebElement nProductTitle : nProductsTitles) {
			String productName = nProductTitle.getText();
			log.info(productName);
		}
	}
}