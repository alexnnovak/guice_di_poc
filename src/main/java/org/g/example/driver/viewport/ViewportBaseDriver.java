package org.g.example.driver.viewport;

import com.codeborne.selenide.Configuration;

import java.util.HashMap;
import java.util.Map;

public class ViewportBaseDriver{

    public void setupWebDriver() {
        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "iPhone 15");

        Configuration.browser = "chrome";
        Configuration.timeout = 40000;
        Configuration.pageLoadTimeout = 40000;
        Configuration.pageLoadStrategy = "eager";
        Configuration.headless = false;
        Configuration.browserSize = "393x852";
        Configuration.fastSetValue = true;

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", true);
        prefs.put("allow-failed-policy-fetch-for-test", true);
    }
}
