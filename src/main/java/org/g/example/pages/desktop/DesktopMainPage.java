package org.g.example.pages.desktop;

import org.g.example.pages.common.MainPage;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

public class DesktopMainPage extends MainPage {

    public  DesktopMainPage() {
        profileButton = $("[data-test='header-profile-button']");
    }

    @Override
    public MainPage clickProfileButton() {
        profileButton.shouldBe(exist).click();
        return this;
    }
}