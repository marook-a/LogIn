package Tests.base;

import Pages.Login.LogInPage;
import Pages.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

import static Common.Settings.HOLD_BROWSER_OPEN;


public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage = new BasePage(driver);
    protected LogInPage login = new LogInPage(driver);

    @AfterSuite (alwaysRun = true)
    public void close() {
        if(HOLD_BROWSER_OPEN)
            driver.quit();
    }



}
