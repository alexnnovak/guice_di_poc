package org.g.example.pages.common;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public abstract class MainPage {

    protected SelenideElement bottomMenuButton, profileButton;

    SelenideElement signUpButton = $$("button").find(text("Sign up"));
    SelenideElement emailInput = $("input[data-test='registration__input--email']");
    SelenideElement passwordInput = $("input[data-test='registration__input--password']");
    SelenideElement acceptTermsCheckbox = $("label[data-test='accept-terms'] span[class*='mr-2']");
    SelenideElement closeCrossButton = $("[data-test='modal-close']");

    public MainPage openRegistrationPageByUrl(){
        open("https://");
        return this;
    }

    public MainPage clickSignUpButton() {
        signUpButton.click();
        return this;
    }

    public MainPage clickAcceptTermsCheckbox() {
        acceptTermsCheckbox.click();
        return this;
    }

    public MainPage clickCloseCrossButton() {
        closeCrossButton.click();
        return this;
    }

    public MainPage enterEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    public MainPage enterPassword(String password) {
        passwordInput.setValue(password);
        return this;
    }

    public abstract MainPage clickProfileButton();
}
