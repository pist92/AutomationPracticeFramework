package com.automationpractiveframework.env;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverEnv {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"My Store");
        driver.close();
    }




}
