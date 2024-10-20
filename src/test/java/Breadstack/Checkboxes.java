package Breadstack;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pageObjects.Breadstack.*;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class Checkboxes extends BaseTest {
    private WebDriver driver;
    private HomePageObject homePage;
    private CheckboxesPageObject checkboxesPage;

    @Parameters({"browser"})
    @BeforeClass
    public void beforeClass(String browserName) throws Exception {
        driver = getBrowserDriver(browserName);
        homePage = PageGeneratorManager.getHomePage(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://localhost:8080/");
        checkboxesPage = homePage.openCheckboxesPage("Checkboxes");
    }

    @Test
    public void TC_01_Verify_Status_Checkboxes() {
        //Verify status default checkbox 1
        assertFalse(checkboxesPage.checkStatus(driver, "1"));

        //Verify status default checkbox 2
        assertTrue(checkboxesPage.checkStatus(driver, "2"));

        //Click select checkbox 1
        checkboxesPage.clickSelectToCheckBox(driver, "1");

        //Verify status selected of checkbox 1
        assertTrue(checkboxesPage.checkStatus(driver, "1"));
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
