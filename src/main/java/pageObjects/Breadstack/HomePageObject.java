package pageObjects.Breadstack;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.HomePageUI;

public class HomePageObject extends BasePage {
    private WebDriver driver;

    public HomePageObject(WebDriver driver) {
        this.driver = driver;
    }


    public LoginPageObject openLoginPage(String loginLink) {
        waitForElementClickable(driver, HomePageUI.DYNAMIC_EXAMPLES_LINK, loginLink);
        clickToElement(driver, HomePageUI.DYNAMIC_EXAMPLES_LINK, loginLink);
        return PageGeneratorManager.getLoginPage(driver);
    }

    public CheckboxesPageObject openCheckboxesPage(String checkboxesLink) {
        waitForElementClickable(driver, HomePageUI.DYNAMIC_EXAMPLES_LINK, checkboxesLink);
        clickToElement(driver, HomePageUI.DYNAMIC_EXAMPLES_LINK, checkboxesLink);
        return PageGeneratorManager.getCheckboxesPage(driver);
    }

    public DropdownPageObject openDropdownPage(String dropdownLink) {
        waitForElementClickable(driver, HomePageUI.DYNAMIC_EXAMPLES_LINK, dropdownLink);
        clickToElement(driver, HomePageUI.DYNAMIC_EXAMPLES_LINK, dropdownLink);
        return PageGeneratorManager.getDropdownPage(driver);
    }

    public FileUploadsPageObject openFileUploadsPage(String fileUploadsLink) {
        waitForElementClickable(driver, HomePageUI.DYNAMIC_EXAMPLES_LINK, fileUploadsLink);
        clickToElement(driver, HomePageUI.DYNAMIC_EXAMPLES_LINK, fileUploadsLink);
        return PageGeneratorManager.getFileUploadsPage(driver);
    }

}
