package org.g.example.binds.drivers;

import com.google.inject.AbstractModule;
import org.g.example.driver.BaseDriver;
import org.g.example.driver.viewport.ViewportBaseDriver;

public class ViewportDriverBinds extends AbstractModule {

    protected void configure() {
        bind(BaseDriver.class).to(ViewportBaseDriver.class);
    }
}
