package com.automationpractiveframework.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/*
Задание:
Написать программу , которая напечатает в консоль атрибуты товара,
Дано:
URL:https://www.mediaexpert.pl/?gclid=CjwKCAiAm7OMBhAQEiwArvGi3M8RsPnhDrxp866jaQWho3-RlmyhPIqaEHUYjsrXTMj3xZG0vDNgsBoCh4wQAvD_BwE
XPath: //div[@class="menu-category-content item-content"]
и сравнит с заданным листом
(Лист нужно создать)
Typ słuchawek
Transmisja bezprzewodowa
Pasmo przenoszenia min. [Hz]
Pasmo przenoszenia max. [Hz]
Dynamika [dB]
Aktywna redukcja szumów (ANC)
Kolor
 */


public class Task_2 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait =  new WebDriverWait(driver,10);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            driver.quit();
        }
    }
}

