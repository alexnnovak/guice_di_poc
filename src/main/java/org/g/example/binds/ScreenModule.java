package org.g.example.binds;

import com.google.inject.AbstractModule;
import org.g.example.binds.screen.DesktopScreenBinds;
import org.g.example.binds.screen.ViewportScreenBinds;

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
