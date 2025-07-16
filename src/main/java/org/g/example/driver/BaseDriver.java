package org.g.example.driver;

import org.g.example.driver.desktop.DesktopBaseDriver;
import org.g.example.driver.viewport.ViewportBaseDriver;

public class BaseDriver {

    public void setupWebDriver() {
        if (System.getProperty("type").equalsIgnoreCase("chrome")){
            new DesktopBaseDriver().setupWebDriver();
        }
        if (System.getProperty("type").equalsIgnoreCase("viewport")){
            new ViewportBaseDriver().setupWebDriver();
        }
    };
}
