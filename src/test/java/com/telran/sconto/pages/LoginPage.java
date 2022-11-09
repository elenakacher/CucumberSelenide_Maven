package com.telran.sconto.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.telran.sconto.utils.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private static By loginIcon = By.cssSelector(".headerElement__icon--login");
    private static By loginHeader = By.cssSelector(".existingAccount__headline");
    private static By emailField = By.id("loginEmail");
    private static By passwordField = By.id("loginPassword");
    private static By submitButton = By.id("login-submit");

    private static String validEmail = PropertiesLoader.loadProperty("valid.email");
    private static String validPassword = PropertiesLoader.loadProperty("valid.password");

    public void clickOnLoginicon() {
        $(loginIcon).click();
    }

    public SelenideElement loginPageHeaderDisplayed() {
        return $(loginHeader);
    }

    public void validLoginInput() {
        $(emailField).setValue(validEmail);
        $(passwordField).setValue(validPassword);
    }

    public void clickOnLoginSubmitButton() {
        $(submitButton).click();
    }
}
