package com.ebay.tests;

import locators.HomePageLocators;

public class SearchProducts extends BaseTest {

	public String searchProductWithName(String searchKeyword) {

		HomePageLocators.clickSearchField();
		HomePageLocators.enterSearchKeywords(searchKeyword);
		HomePageLocators.clickSearchButton();
		String listingText = HomePageLocators.checkListingPageText();
		return listingText;
	}
}