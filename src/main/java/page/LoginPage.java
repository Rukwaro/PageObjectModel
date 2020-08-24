package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	// Create a constructor that is executed when creating objects

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements Library

	@FindBy(how = How.ID, using = "username")
	WebElement USERAME_FIELD;

	@FindBy(how = How.ID, using = "password")
	WebElement PASSWORD_FIELD;

	@FindBy(how = How.NAME, using = "login")
	WebElement SIGNIN_FIELD;

	// Methods to interact with the elements

	public void enterUsername(String userName) {
		USERAME_FIELD.sendKeys(userName);
	}

	// Separate methods for easier debug

	public void enterPassword(String password) {
		PASSWORD_FIELD.sendKeys(password);
	}

	// Separate methods for easier debug

	public void clickSigninButton() {
		SIGNIN_FIELD.click();
	}
}
