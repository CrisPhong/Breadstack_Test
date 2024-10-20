package pageObjects.Breadstack;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.LoginPageUI;

public class SecurePageObject extends BasePage {
	WebDriver driver;

	public SecurePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getLoginSuccessMessage() {
		waitForElementVisible(driver, LoginPageUI.LOGIN_SUCCESS_MESSAGE);
		String message = getElementText(driver, LoginPageUI.LOGIN_SUCCESS_MESSAGE);
		return message.split("\\n")[0].trim();
	}



}
