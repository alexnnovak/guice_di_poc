package org.g.example.binds.drivers;

import com.google.inject.AbstractModule;
import org.g.example.driver.BaseDriver;
import org.g.example.driver.desktop.DesktopBaseDriver;

public class DesktopDriverBinds extends AbstractModule {

    protected void configure() {
        bind(BaseDriver.class).to(DesktopBaseDriver.class);
    }
}