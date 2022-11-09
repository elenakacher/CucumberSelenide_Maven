package com.telran.sconto.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.telran.sconto.utils.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public static String baseURL = PropertiesLoader.loadProperty("url");

    private static By acceptButton = By.cssSelector("[data-accept-action='all']");
    private static By myAccountIcon = By.cssSelector(".headerElement__status--login");

    public void acceptCookies() {
        $(acceptButton).click();
    }

    public SelenideElement validMyAccount() {
        return $(myAccountIcon);
    }

    public void clickOnMyAccountIcon() {
        $(myAccountIcon).click();
    }

}
