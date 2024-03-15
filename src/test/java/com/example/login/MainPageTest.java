package com.example.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class MainPageTest {
    public WebDriver driver;
    private MainPage mainPage;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://staging.sittertree.com/signup");

        mainPage = new MainPage(driver);
    }

    @Test
    public void logInButton() {
        mainPage.logInButton.click();

        WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
        email.sendKeys("sitter");

        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        password.sendKeys("sitter");

        WebElement checkbox = driver.findElement(By.xpath("//label[@for='stay_signed_in']"));
        checkbox.click();

        WebElement btnLogIn = driver.findElement(By.xpath("//button[@type='submit']"));
        btnLogIn.click();

        String expectedTitle = "Jobs";
        String actualTitle = driver.findElement(By.cssSelector("div[class='page-title__inner'] h1")).getText();
        assertEquals(expectedTitle, actualTitle);

    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
