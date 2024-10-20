package pageObjects.Breadstack;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.CheckboxesPageUI;

public class CheckboxesPageObject extends BasePage {
    WebDriver driver;

    public CheckboxesPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public boolean checkStatus(WebDriver driver, String value) {
        waitForElementVisible(driver, CheckboxesPageUI.DYNAMIC_CHECKBOXES, value);
        return checkStatusSelected(driver, CheckboxesPageUI.DYNAMIC_CHECKBOXES, value);
    }

    public void clickSelectToCheckBox(WebDriver driver, String value) {
        waitForElementVisible(driver, CheckboxesPageUI.DYNAMIC_CHECKBOXES, value);
        clickToCheckBox(driver, CheckboxesPageUI.DYNAMIC_CHECKBOXES, value);
    }
}
