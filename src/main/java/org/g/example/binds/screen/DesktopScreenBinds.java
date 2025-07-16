package org.g.example.binds.screen;

import com.google.inject.AbstractModule;
import org.g.example.pages.common.MainPage;
import org.g.example.pages.desktop.DesktopMainPage;

public class DesktopScreenBinds extends AbstractModule {

    protected void configure() {
        bind(MainPage.class).to(DesktopMainPage.class);
    }
}