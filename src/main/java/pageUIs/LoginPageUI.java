package pageUIs;

public class LoginPageUI {
	public static final String DYNAMIC_INPUT_TEXTBOX_BY_ID = "xpath=//input[@id='%s']";
	public static final String LOGIN_BUTTON = "xpath=//button/i[contains(text(), 'Login')]";
	public static final String LOGIN_SUCCESS_MESSAGE = "xpath=//div[contains(text(),'You logged into a secure area!')]";
	public static final String LOGIN_ERROR_MESSAGE = "xpath=//div[contains(text(),'Your username is invalid!')]";
}
