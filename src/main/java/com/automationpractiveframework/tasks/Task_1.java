package com.automationpractiveframework.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
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
Создать листы WebTesting, ApiTesting ,с заголовков  (например Web UI Java Path и т.д) ,
в лист WebTesting поместить все заголовки ,которые начинаются с Web  а в API которые начинаются с API
(Для успешного выполнения нужно обновить знания по коллекциям)
//создать общий лист для web api как в примере
 for(WebElement item:menuItems){
            if(item.getText().startsWith("TAU")){
                System.out.println(item.getText());
                webList.add(item.getText());
            }

        }
*/
public class Task_1 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://testautomationu.applitools.com/learningpaths.html");
        List<WebElement> menuItems = driver.findElements(By.xpath("//header/div[2]/nav/div[@class=\"nav-item\"]"));
        List<String> webList = new ArrayList<>();

        for (WebElement item : menuItems) {
            if (item.getText().startsWith("TAU")) {
                System.out.println(item.getText());
                webList.add(item.getText());
            }

        }
        System.out.println("LIST SIZE: " + webList.size());

    }
}

        //TASK 2
 /*
        List<WebElement> webTestingElements =  driver.findElements(By.xpath("//h3[@class='text-center' and contains(text(),\"Web\")]"));
        List<String> webTesting = new ArrayList<>();

        for (WebElement items : webTestingElements) {
            if (items.getText().startsWith("Web")) {
                System.out.println(items.getText());
                webTesting.add(items.getText());
            }
        }

      List<WebElement> apiTestingElements = driver.findElements(By.xpath("//h3[@class='text-center' and contains(text(),\"API\")]"));
        // List<String> apiTesting = new ArrayList<>();

        Iterator<WebElement> iterator = apiTestingElements.iterator();
        while (iterator.hasNext()) {
            System.out.println(apiTestingElements);
        }
       System.out.println("LIST SIZE OF API" + apiTestingElements.size());
 */
