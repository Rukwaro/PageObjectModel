package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {
	WebDriver driver;

	// Create a constructor that is executed when creating objects

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	// Element Library

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Dashboard')]")
	WebElement PAGE_TITLE;
	@FindBy(how = How.LINK_TEXT, using = "Add Deposit")
	WebElement AddDepositButton;

	// Methods to interact with the elements
	// Separate methods for easier debug
	public void waitForPage() {
		PAGE_TITLE.isDisplayed();
	}

	public void clickOnAddDepositButton() {
		AddDepositButton.click();
	}

	public boolean isDashboardDisplayed() {
		try {
			waitForPage();
			return true;
		} catch (Exception e) {

		}
		return false;
	}
}
