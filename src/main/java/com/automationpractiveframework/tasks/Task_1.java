package com.automationpractiveframework.tasks;

import com.codeborne.selenide.Selenide;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Collection;
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
        WebDriverWait wait =  new WebDriverWait(driver,10);
        driver.get("https://testautomationu.applitools.com/learningpaths.html");
        List<WebElement> menuItems = driver.findElements(By.xpath("//header/div[2]/nav/div[@class=\"nav-item\"]"));
        List<String> webList = new ArrayList<>();

        for(WebElement item:menuItems){
            if(item.getText().startsWith("TAU")){
                System.out.println(item.getText());
                webList.add(item.getText());
            }

        }
        System.out.println("LIST SIZE: "+ webList.size());



//         Задание 1
//         final WebElement AboutRanksLink = Selenide.$x("//a[starts-with(@href, '/ranks.html') and contains(text(),\"About Ranks\")]");
//         final WebElement TAU100Link = Selenide.$x("//a[starts-with(@href, '/tau100.html') and contains(text(),\"TAU 100\")]");
//         final WebElement LearningPathLink = Selenide.$x("//a[starts-with(@href, '/learningpaths.html') and contains(text(),\"Learning Paths\")]");
//         final WebElement CertificatesLink = Selenide.$x("//a[starts-with(@href, '/certificate/index.html') and contains(text(),\"Certificates\")]");
//         final WebElement TAUSlackLink = Selenide.$x("//a[starts-with(@href, 'https://tauslacksignupapp.herokuapp.com/') and contains(text(),\"  TAU Slack\")]");
//         final WebElement SerhiiKutsenkoLink = Selenide.$x("//a[starts-with(@href, '/profile.html') and contains(text(),\"Serhii Kutsenko\")]");
//         final WebElement LogoutLink = Selenide.$x("//a[starts-with(@href, '#') and contains(text(),\"Logout\")]");
//
//        ArrayList<WebElement> menu = new ArrayList<WebElement>();
//        menu.add(AboutRanksLink);
//        menu.add(TAU100Link);
//        menu.add(LearningPathLink);
//        menu.add(CertificatesLink);
//        menu.add(TAUSlackLink);
//        menu.add(SerhiiKutsenkoLink);
//        menu.add(LogoutLink);
//
//        Assert.assertEquals(AboutRanksLink, LearningPathLink);
//
//        //Задание 2
//        WebElement WebUIJavaPath = Selenide.$x("//*[starts-with(@class, 'text-center') and contains(text(),\"Web UI Java Path\")]");
//        ArrayList<WebElement> webTesting = new ArrayList<WebElement>((Collection<? extends WebElement>) WebUIJavaPath);
//
//        final WebElement SettingAFoundationForSuccessfulTestAutomation = Selenide.$x("//span[normalize-space(.)='Setting a Foundation for Successful Test Automation' and contains (@xpath, '1')]");
//
//        webTesting.add();
//        webTesting.add();
//        webTesting.add();
//        webTesting.add();
//        webTesting.add();
//        webTesting.add();
//
//        WebElement APIJavaPath = Selenide.$x("//*[starts-with(@class, 'text-center') and contains(text(),\"API Java Path\")]");
//        ArrayList<WebElement> APITesting = new ArrayList<WebElement>((Collection<? extends WebElement>) APIJavaPath);
//        APITesting.add();
//        APITesting.add();
//        APITesting.add();
//        APITesting.add();
//        APITesting.add();
//        APITesting.add();


    }
//a/span[contains(text(),"Setting a Foundation for Successful Test Automation")]
}


////a[starts-with(@href, '/ranks.html') and contains(text(),"About Ranks")]
