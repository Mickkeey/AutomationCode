package locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ebay.tests.BaseTest;

public class ListingPageLocators extends BaseTest {

	@FindBy(how = How.XPATH, using = "(//span[@class='btn__cell']/..)[4]")
	private static WebElement sortDropdownButton;

	@FindBy(how = How.XPATH, using = "(//ul[@class='fake-menu__items'])[4]/li/a/span")
	private static List<WebElement> sortingDropdown;

	@FindBy(how = How.XPATH, using = "//span[@role='heading']")
	private static List<WebElement> nameOfProduct;

	public static void dropdownButton() {
		sortDropdownButton.click();
	}

	public static List<WebElement> dropdownOptions() {
		return sortingDropdown;
	}

	public static List<WebElement> productNames() {
		return nameOfProduct;
	}

}