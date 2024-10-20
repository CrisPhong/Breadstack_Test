package pageObjects.Breadstack;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
	
	public static HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}

	public static LoginPageObject getLoginPage(WebDriver driver) {
		return new LoginPageObject(driver);
	}

	public static SecurePageObject getSecurePage(WebDriver driver) {
		return new SecurePageObject(driver);
	}

	public static CheckboxesPageObject getCheckboxesPage(WebDriver driver) {
		return new CheckboxesPageObject(driver);
	}
	public static DropdownPageObject getDropdownPage(WebDriver driver) {
		return new DropdownPageObject(driver);
	}
	public static FileUploadsPageObject getFileUploadsPage(WebDriver driver) {
		return new FileUploadsPageObject(driver);
	}
}
