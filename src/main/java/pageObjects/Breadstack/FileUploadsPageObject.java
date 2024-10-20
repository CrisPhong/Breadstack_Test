package pageObjects.Breadstack;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.FileUploadsPageUI;

public class FileUploadsPageObject extends BasePage {
    WebDriver driver;

    public FileUploadsPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(WebDriver driver, String value) {
        waitForElementClickable(driver, FileUploadsPageUI.INPUT_FILE_UPLOAD);
        sendKeyToElement(driver, FileUploadsPageUI.INPUT_FILE_UPLOAD, value);
        clickToElement(driver, FileUploadsPageUI.BUTTON_UPLOAD);
    }

    public boolean checkDisplayFileUploaded(WebDriver driver, String value) {
        waitForElementVisible(driver, FileUploadsPageUI.FILE_NAME_UPLOADED, value);
        return isElementDisplay(driver, FileUploadsPageUI.FILE_NAME_UPLOADED, value);
    }
}
