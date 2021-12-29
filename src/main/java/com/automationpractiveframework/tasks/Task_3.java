package com.automationpractiveframework.tasks;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

///*
//Написать Xpath для меню(например Ноутбуки и компьютеры и т.д.)
//https://rozetka.com.ua/
//Исправить Xpath(Xpath's with name fixName)
//URL:https://rozetka.com.ua/asus_90nr0723_m04930/p313880179/
//
//Задание 2
//Map<Key, Value>
//Создать лист с вопросами пользователей
//Создать лист с датами вопросов пользователей
//Вывести в консоль вопросы , которые были заданы после 8 ноября(8 ноября включить)
//https://rozetka.com.ua/asus_90nr0723_m04930/p313880179/questions/
//
// */
public class Task_3 {
    public static void main(String[] args) {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        WebDriver driver = new ChromeDriver();
//        WebDriverWait wait = new WebDriverWait(driver, 5);
//        driver.get("https://mvnrepository.com/artifact/gradle.plugin.eu.leontebbens.gradle/chromedriver-updater-plugin/1.7.0");
//        System.out.println(driver.getTitle());
//        driver.close();
//        WebElement menu = driver.findElement(By.xpath("//a[@class='menu-categories__link']")); //fixThisPlease

//        //XPATH FOR FIX
//        WebElement fixSpecifications = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/rz-product[1]/div[1]/rz-product-navbar[1]/rz-tabs[1]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
//        WebElement fixReviews = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/rz-product[1]/div[1]/rz-product-navbar[1]/rz-tabs[1]/div[1]/div[1]/ul[1]/li[3]/a[1]"));
//        WebElement fixQuestions = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/rz-product[1]/div[1]/rz-product-navbar[1]/rz-tabs[1]/div[1]/div[1]/ul[1]/li[4]/a[1]"));
//        WebElement fixPhoto = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/rz-product[1]/div[1]/rz-product-navbar[1]/rz-tabs[1]/div[1]/div[1]/ul[1]/li[5]/a[1]"));
//
//        //XPATH FIXED
//        WebElement fixedSpecifications = driver.findElement(By.xpath("//span[contains(text(),\"Ноутбуки и компьютеры\")]"));
//        WebElement fixedReviews = driver.findElement(By.xpath("//a[contains(text(),\" Отзывы \")]"));
//        WebElement fixedQuestions = driver.findElement(By.xpath("//a[contains(text(),\" Вопросы \")]"));
//        WebElement fixedPhoto = driver.findElement(By.xpath("//a[contains(text(),\" Фото \")]"));
//
//        //Задание 2
//
//
//        List<WebElement> usersQuestions = driver.findElements(By.xpath("//p[@class='comment__text ng-star-inserted' and contains(text(),\"\")]"));
//
//        List<String> listOfQuestions = new ArrayList<>();
//
//        List<WebElement> usersQuestionsDate = driver.findElements(By.xpath("//time[@class='comment__date ng-star-inserted']"));
//
//        for(WebElement element : usersQuestionsDate) {
//            if(element.getText().startsWith("8 ноября")) {
//                System.out.println(element.getText());
//                listOfQuestions.add(element.getText());
//            }
//        }
//        System.out.println("Вопросы заданые после 8 ноября" + listOfQuestions.toArray());

    }
}
