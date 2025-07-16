package org.g.example.pages.viewport;

import org.g.example.pages.common.MainPage;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

public class ViewportMainPage extends MainPage {

    public  ViewportMainPage() {
        bottomMenuButton = $("[data-test='bottom-menu-more']");
        profileButton = $("[data-test='sidebar-profile']");

    }

    @Override
    public MainPage clickProfileButton() {
        bottomMenuButton.shouldBe(exist).click();
        profileButton.shouldBe(exist).click();
        return this;
    }
}
