package com.ebay.tests;

import org.testng.Assert;
import org.testng.annotations.*;

public class SearchListingTest extends BaseTest {

	@Test
	@Parameters({ "searchProduct", "listingResultText", "sortListing", "numberofItems" })
	public void EbaySearchListing(String searchProduct, String listingResultText, String sortListing,
			int numberofItems) {

		log.info("Navigate to Ebay and search for Ipad");
		SearchProducts productList = new SearchProducts();
		String listingText = productList.searchProductWithName(searchProduct);
		Assert.assertTrue(listingText.contains(listingResultText));

		log.info("Sort the result from price low to high");
		SortItem sortedList = new SortItem();
		sortedList.sortProductList(sortListing);

		log.info("Get the price of all the top 10 products");
		ProductPrice sortedProductPrice = new ProductPrice();
		sortedProductPrice.nProductPrice(numberofItems);

		log.info("Get the name of all the top 10 products");
		ProductName sortedProductName = new ProductName();
		sortedProductName.nProductName(numberofItems);
	}

	@AfterClass
	public void suiteTearDown() {
		driver.quit();
	}
}