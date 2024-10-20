package pageObjects.Breadstack;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.DropdownPageUI;

public class DropdownPageObject extends BasePage {
    WebDriver driver;

    public DropdownPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void selectToDropdownByName(WebDriver driver,  String value) {
        waitForElementClickable(driver, DropdownPageUI.DROPDOWN_LIST);
        selecItemInDropdown(driver, DropdownPageUI.DROPDOWN_LIST, value);
    }

    public boolean checkDisplaySelectedOption(WebDriver driver,  String value) {
        waitForElementVisible(driver, DropdownPageUI.DROPDOWN_LIST_OPTION, value);
        return isElementDisplay(driver, DropdownPageUI.DROPDOWN_LIST_OPTION, value);
    }
}
