package com.telran.sconto.steps;

import com.telran.sconto.pages.HomePage;
import com.telran.sconto.pages.LoginPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class LoginSteps implements En {

    LoginPage loginPage;

    public LoginSteps() {
        When("Click on the Anmelden icon", () ->{
            loginPage = page(LoginPage.class);
            loginPage.clickOnLoginicon();
        });

        Then("Login Page displayed", () ->{
           loginPage.loginPageHeaderDisplayed().should(exist);
           loginPage.loginPageHeaderDisplayed().shouldHave(text("Anmelden"));
        });

        When("Enter valid user credentials", () ->{
            loginPage.validLoginInput();
        });

        And("Click on Anmelden button", () ->{
            loginPage.clickOnLoginSubmitButton();
        });

    }
}
