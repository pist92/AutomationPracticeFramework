package com.automationpractiveframework.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/*
Проверить является ли: About Ranks первым пунктом меню
Задачи:
1)Найти XPath
2)Создать лист меню
3)Проверить совпадет ли первый пункт с ожидаемым
URL:https://testautomationu.applitools.com/learningpaths.html
Меню: About Ranks
Задание 2:
Создать листы WebTesting, ApiTesting ,с заголовков  (например Web UI Java Pathи т.д) ,
в лист WebTesting поместить все заголовки ,которые начинаются с Web  а в API которые начинаются с API
(Для успешного выполнения нужно обновить знания по коллекциям)
*/
public class Task_1 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait =  new WebDriverWait(driver,10);

    }
}
