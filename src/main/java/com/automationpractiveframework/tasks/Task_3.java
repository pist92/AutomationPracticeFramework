package com.automationpractiveframework.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;

/*
Написать Xpath для меню(например Ноутбуки и компьютеры и т.д.)
https://rozetka.com.ua/
Исправить Xpath(Xpath's with name fixName)
URL:https://rozetka.com.ua/asus_90nr0723_m04930/p313880179/

Задание 2
Создать лист с вопросами пользователей
Создать лист с датами вопросов пользователей
Вывести в консоль вопросы , которые были заданы после 8 ноября(8 ноября включить)
https://rozetka.com.ua/asus_90nr0723_m04930/p313880179/questions/

 */
public class Task_3 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait =  new WebDriverWait(driver,10);
        WebElement menu = driver.findElement(By.xpath("Menu")); //fixThisPlease

        //XPATH FOR FIX
        WebElement fixSpecifications = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/rz-product[1]/div[1]/rz-product-navbar[1]/rz-tabs[1]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
        WebElement fixReviews= driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/rz-product[1]/div[1]/rz-product-navbar[1]/rz-tabs[1]/div[1]/div[1]/ul[1]/li[3]/a[1]"));
        WebElement fixQuestions= driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/rz-product[1]/div[1]/rz-product-navbar[1]/rz-tabs[1]/div[1]/div[1]/ul[1]/li[4]/a[1]"));
        WebElement fixPhoto= driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/rz-product[1]/div[1]/rz-product-navbar[1]/rz-tabs[1]/div[1]/div[1]/ul[1]/li[5]/a[1]"));

        //XPATH FIXED
        WebElement fixedSpecifications = driver.findElement(By.xpath("//span[contains(text(),\"Ноутбуки и компьютеры\")]"));
        WebElement fixedReviews = driver.findElement(By.xpath("//a[contains(text(),\" Отзывы \")]"));
        WebElement fixedQuestions= driver.findElement(By.xpath("//a[contains(text(),\" Вопросы \")]"));
        WebElement fixedPhoto= driver.findElement(By.xpath("//a[contains(text(),\" Фото \")]"));


        WebElement comment1 = driver.findElement(By.xpath("//p[contains(text(),'Здравствуйте, будет ли скидка на этот ноутбук на ч')]"));
        WebElement comment2 = driver.findElement(By.xpath("//p[contains(text(),'Подскажите пожалуйста, обе ли планки оперативной п')]]"));
        WebElement comment3 = driver.findElement(By.xpath("//p[contains(text(),'А подскажите пожалуйста где можно посмотреть произ')]"));
        WebElement comment4 = driver.findElement(By.xpath("//p[contains(text(),'Добрый день! Подскажите какое охлаждение установле')]"));
        WebElement comment5 = driver.findElement(By.xpath("//p[contains(text(),'скажите где можна купить встроеной памяи на этот н')]"));
        WebElement comment6 = driver.findElement(By.xpath("//p[contains(text(),'Добрий день    чи можна ')]"));
        WebElement comment7 = driver.findElement(By.xpath("//p[contains(text(),'Купили ноутбук. Але він виявився без ОС. Як можна ')]]"));

        List<WebElement> questionList = new ArrayList<WebElement>((Collection<? extends WebElement>) fixedQuestions);
        questionList.add(comment1);
        questionList.add(comment2);
        questionList.add(comment3);   //time[contains(text(),'15 ноября 2021') ]   //div[@class='comment__author']//ul/li[2]
        questionList.add(comment4);
        questionList.add(comment5);
        questionList.add(comment6);
        questionList.add(comment7);

        WebElement dateNumber1 = driver.findElement(By.xpath("//time[contains(text(),'вчера')]"));
        WebElement dateNumber2 = driver.findElement(By.xpath("//time[contains(text(),'вчера')]"));
        WebElement dateNumber3 = driver.findElement(By.xpath("//time[contains(text(),'вчера')]"));
        WebElement dateNumber4 = driver.findElement(By.xpath("//time[contains(text(),'вчера')]"));
        WebElement dateNumber5 = driver.findElement(By.xpath("//time[contains(text(),'вчера')]"));
        WebElement dateNumber6 = driver.findElement(By.xpath("//time[contains(text(),'вчера')]"));
        WebElement dateNumber7 = driver.findElement(By.xpath("//time[contains(text(),'вчера')]"));

       List<WebElement> dateNumber = new ArrayList<WebElement>();
        dateNumber.add();
        dateNumber.add();
        dateNumber.add();
        dateNumber.add();
        dateNumber.add();
        dateNumber.add();
        dateNumber.add();


        ArrayList<WebElement> dataQuestionList = new ArrayList<WebElement>(); {
            dataQuestionList.add();
            dataQuestionList.add();
            dataQuestionList.add();
            dataQuestionList.add();
            dataQuestionList.add();
            dataQuestionList.add();
            dataQuestionList.add();
        };
    }
}
