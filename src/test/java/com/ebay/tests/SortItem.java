package com.ebay.tests;

import java.util.List;
import org.openqa.selenium.WebElement;
import locators.ListingPageLocators;

public class SortItem extends BaseTest {

	public void sortProductList(String sortProduct) {

		ListingPageLocators.dropdownButton();
		List<WebElement> sortingDropdown = ListingPageLocators.dropdownOptions();

		for (WebElement sortingOption : sortingDropdown) {
			if (sortingOption.getText().equals(sortProduct)) {
				sortingOption.click();
				break;
			}
		}
	}
}