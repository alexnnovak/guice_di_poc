package org.g.example.binds.screen;

import com.google.inject.AbstractModule;

public class ScreenModule extends AbstractModule {

    protected void configure() {
        if (System.getProperty("type").equalsIgnoreCase("chrome")) {
            install(new DesktopScreenBinds());
        }
        if (System.getProperty("type").equalsIgnoreCase("viewport")) {
            install(new ViewportScreenBinds());
        }
    }
}
