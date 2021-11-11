package com.automationpractiveframework.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

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


    }
}
