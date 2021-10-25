package com.automationpractiveframework.utils;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsUtils {

    private static final WebDriver driver = WebDriverRunner.getWebDriver();
    private static final Wait<WebDriver> wait = new WebDriverWait(driver, 10);

    public static void waitForPageLoadComplete() {
        wait.until(
                driver1 ->
                        String.valueOf(
                                ((JavascriptExecutor) driver1).executeScript("return document.readyState"))
                                .equals("complete"));
    }

    public static void waitForWebElementToBeVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForWebElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitForWebElementNotAttributeContain(WebElement element, String attribute, String value) {
        wait.until(ExpectedConditions.not(ExpectedConditions.attributeContains(element, attribute, value)));
    }

    public static void waitForWebElementsToBeClickable(ElementsCollection elementsCollection) {
        for (SelenideElement element : elementsCollection) {
            waitForWebElementToBeClickable(element);
        }
    }

    public static void waitForAttributeOfWebElementToBe(WebElement element, String attribute, String value) {
        wait.until(ExpectedConditions.attributeToBe(element, attribute, value));
    }

    public static void sleepSeconds(double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000L));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}