package com.ebay.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductPrice extends BaseTest {

	public void nProductPrice(int NumberofItems) {

		for (int i = 2; i <= NumberofItems; i++) {
			WebElement productsPricing = driver.findElement(
					By.xpath("(//div[@class='s-item__info clearfix'])[" + i + "]//span[@class='s-item__price']"));
			String productsPrice = productsPricing.getText();
			log.info(productsPrice);
		}
	}
}