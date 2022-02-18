package testProjectPackage.automationpractiveframework.web;

import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DriverUtils {


    public static void runChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--verbose");
        options.addArguments("-bb-no-sandbox");
        options.addArguments("--whitelisted-ips");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.setExperimentalOption(
                "excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("prefs", Map.ofEntries(
                new AbstractMap.SimpleEntry("credentials_enable_service", false),
                new AbstractMap.SimpleEntry("profile.password_manager_enabled", "budapest")));
        WebDriverRunner.setWebDriver(new ChromeDriver(options));
    }

    public static void tearDownBrowser() {
        WebDriverRunner.closeWebDriver();
    }

    public static void browserConfiguration() {
        WebDriverRunner.getWebDriver().manage().window().maximize();
        WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}