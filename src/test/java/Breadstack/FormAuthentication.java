package Breadstack;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pageObjects.Breadstack.*;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class FormAuthentication extends BaseTest {
    private WebDriver driver;
    private HomePageObject homePage;
    private LoginPageObject loginPage;
    private SecurePageObject securePage;

    private String username, password, incorrectUsername, incorrectPassword;

    @Parameters({"browser"})
    @BeforeClass
    public void beforeClass(String browserName) throws Exception {
        driver = getBrowserDriver(browserName);
        homePage = PageGeneratorManager.getHomePage(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://localhost:8080/");
        loginPage = homePage.openLoginPage("Form Authentication");
    }

    @Test
    public void TC_01_Login_Error() {
        incorrectUsername = "admin";
        incorrectPassword = "admin";

        //Enter username
        loginPage.inputToTextboxByID(driver, "username", incorrectUsername);

        //Enter password
        loginPage.inputToTextboxByID(driver, "password", incorrectPassword);

        //Click button Login
        loginPage.clickToLoginButton();

        //Verify login error
        assertEquals(loginPage.getLoginErrorMessage(), "Your username is invalid!");
    }


    @Test
    public void TC_02_Login_Success() {
        username = "tomsmith";
        password = "SuperSecretPassword!";

        //Enter username
        loginPage.inputToTextboxByID(driver, "username", username);

        //Enter password
        loginPage.inputToTextboxByID(driver, "password", password);

        //Click button Login
        securePage = loginPage.clickToLoginButton();

        //Verify login success
        assertEquals(securePage.getLoginSuccessMessage(), "You logged into a secure area!");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
