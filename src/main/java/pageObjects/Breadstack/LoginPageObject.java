package pageObjects.Breadstack;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.LoginPageUI;

public class LoginPageObject extends BasePage {
	WebDriver driver;
	
	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void inputToTextboxByID(WebDriver driver, String textboxID, String value) {
		waitForElementVisible(driver, LoginPageUI.DYNAMIC_INPUT_TEXTBOX_BY_ID, textboxID);
		sendKeyToElement(driver, LoginPageUI.DYNAMIC_INPUT_TEXTBOX_BY_ID, value, textboxID);
	}

	public SecurePageObject clickToLoginButton() {
		waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
		return PageGeneratorManager.getSecurePage(driver);
	}

	public String getLoginErrorMessage() {
		waitForElementVisible(driver, LoginPageUI.LOGIN_ERROR_MESSAGE);
		String message = getElementText(driver, LoginPageUI.LOGIN_ERROR_MESSAGE);
		return message.split("\\n")[0].trim();
	}

}
