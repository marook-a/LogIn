package Tests.LoginSite;

import Common.Settings;
import Tests.base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

@Test
    public void checkLogin() {
        basePage.openUrl(Settings.url);
        login
                .enterLoginBtn()
                .enterForm();
        login
                .checkTitle();
    }
}
