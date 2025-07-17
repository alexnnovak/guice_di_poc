package org.g.example.binds.drivers;

import com.google.inject.AbstractModule;

public class DriverModule extends AbstractModule {

    protected void configure() {
        if (System.getProperty("type").equalsIgnoreCase("chrome")) {
            install(new DesktopDriverBinds());
        }
        if (System.getProperty("type").equalsIgnoreCase("viewport")) {
            install(new ViewportDriverBinds());
        }
    }
}
