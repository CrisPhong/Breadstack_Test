package Breadstack;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.Breadstack.DropdownPageObject;
import pageObjects.Breadstack.HomePageObject;
import pageObjects.Breadstack.PageGeneratorManager;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class Dropdown extends BaseTest {
    private WebDriver driver;
    private HomePageObject homePage;
    private DropdownPageObject dropdownPage;

    @Parameters({"browser"})
    @BeforeClass
    public void beforeClass(String browserName) throws Exception {
        driver = getBrowserDriver(browserName);
        homePage = PageGeneratorManager.getHomePage(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://localhost:8080/");
        dropdownPage = homePage.openDropdownPage("Dropdown");
    }

    @Test
    public void TC_01_Verify_Status_Checkboxes() {
        //Choose option 1
        dropdownPage.selectToDropdownByName(driver, "Option 1");

        //Verify  display selected of option 1
        assertTrue(dropdownPage.checkDisplaySelectedOption(driver,"Option 1"));

        //Choose option 2
        dropdownPage.selectToDropdownByName(driver, "Option 2");

        //Verify  display selected of option 2
        assertTrue(dropdownPage.checkDisplaySelectedOption(driver,"Option 2"));

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
