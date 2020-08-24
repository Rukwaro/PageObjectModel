package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;

	// Call the BrowserFactory to start the browser
	@Test
	public void validUserShouldBeAbleToLogin() {
		driver = BrowserFactory.startBrowser();

		// Instantiate LoginPage with PageFactory to call LoginPage methods

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		// Use instantiated LoginPage to call LoginPage methods
		loginPage.enterUsername("demo@techfios.com");
		loginPage.enterPassword("abc123");
		loginPage.clickSigninButton();

		// Instantiate DashboardPage with PageFactory to call DashboardPage methods
		DashboardPage dashboardPage = PageFactory.initElements(driver,DashboardPage.class);

		// Use instantiated DashboardPage to call DashboardPage methods
		dashboardPage.waitForPage();

	}
}
