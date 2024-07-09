package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ebay.tests.BaseTest;

public class HomePageLocators extends BaseTest {

	@FindBy(how = How.ID, using = "gh-ac")
	private static WebElement searchField;

	@FindBy(how = How.ID, using = "gh-ac")
	private static WebElement searchKeywords;

	@FindBy(how = How.ID, using = "gh-btn")
	private static WebElement searchButton;

	@FindBy(how = How.CLASS_NAME, using = "srp-controls__count-heading")
	private static WebElement listingHeadingText;

	public static void clickSearchField() {
		searchField.click();
	}

	public static void enterSearchKeywords(String key) {
		searchKeywords.sendKeys(key);
	}

	public static void clickSearchButton() {
		searchButton.click();
	}

	public static String checkListingPageText() {
		return listingHeadingText.getText();
	}
}