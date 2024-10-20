package Breadstack;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.Breadstack.FileUploadsPageObject;
import pageObjects.Breadstack.HomePageObject;
import pageObjects.Breadstack.PageGeneratorManager;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class FileUploads extends BaseTest {
    private WebDriver driver;
    private HomePageObject homePage;
    private FileUploadsPageObject fileUploadsPage;
    String filePath = System.getProperty("user.dir") + "/src/test/resources/UploadFile/Arsenal.jpg";

    @Parameters({"browser"})
    @BeforeClass
    public void beforeClass(String browserName) throws Exception {
        driver = getBrowserDriver(browserName);
        homePage = PageGeneratorManager.getHomePage(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://localhost:8080/");
        fileUploadsPage = homePage.openFileUploadsPage("File Upload");
    }

    @Test
    public void TC_01_Upload_File() {
        //Upload File
        fileUploadsPage.uploadFile(driver, filePath);

        //Verify file uploaded
        assertTrue(fileUploadsPage.checkDisplayFileUploaded(driver,"Arsenal.jpg"));
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
