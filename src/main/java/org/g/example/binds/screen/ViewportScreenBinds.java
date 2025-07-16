package org.g.example.binds.screen;

import com.google.inject.AbstractModule;
import org.g.example.pages.common.MainPage;
import org.g.example.pages.viewport.ViewportMainPage;

public class ViewportScreenBinds extends AbstractModule {

    protected void configure() {
        bind(MainPage.class).to(ViewportMainPage.class);
    }
}
