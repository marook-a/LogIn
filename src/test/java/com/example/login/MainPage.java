package com.example.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://www.jetbrains.com/
public class MainPage {
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

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
