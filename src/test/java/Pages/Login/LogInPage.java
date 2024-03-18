package Pages.Login;

import Pages.base.BasePage;
import Common.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertEquals;

public class LogInPage extends BasePage {

    public LogInPage(WebDriver driver) {
        super(driver);
    }
    public WebDriver driver;
    @FindBy(xpath = "//a[contains(@href, '/login')]")
    public WebElement logInButton;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='stay_signed_in']")
    public WebElement checkbox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement btnLogIn;


    public LogInPage enterLoginBtn() {
        logInButton.click();
        return this;
    }

    public LogInPage enterForm() {
        email.sendKeys(Settings.email);
        password.sendKeys(Settings.password);
        checkbox.click();
        btnLogIn.click();
        return this;
    }
    public LogInPage checkTitle() {
        String actualTitle = driver.findElement(By.cssSelector("div[class='page-title__inner'] h1")).getText();
        assertEquals(Settings.expectedTitle, actualTitle);
        return this;
    }
}
