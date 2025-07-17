package org.g.example.driver.desktop;

import com.codeborne.selenide.Configuration;
import org.g.example.driver.BaseDriver;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class DesktopBaseDriver extends BaseDriver {

    @Override
    public void setupWebDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--lang=en", "--disable-gpu", "--no-sandbox", "--disable-dev-shm-usage");
        String extraArgs = System.getProperty("chromeoptions.args", "");
        if (!extraArgs.isEmpty()) {
            String[] argsArray = extraArgs.trim().split("\\s+");
            for (String arg : argsArray) {
                if (!arg.isBlank()) {
                    chromeOptions.addArguments(arg);
                }
            }
        }

        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 40000;
        Configuration.pageLoadTimeout = 40000;
        Configuration.pageLoadStrategy = "eager";
        Configuration.headless = false;
        Configuration.fastSetValue = true;

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", true);
        prefs.put("allow-failed-policy-fetch-for-test", true);
        chromeOptions.setExperimentalOption("prefs", prefs);

        MutableCapabilities capabilities = new MutableCapabilities();

        capabilities.merge(chromeOptions);
        Configuration.browserCapabilities = capabilities;
    }
}
