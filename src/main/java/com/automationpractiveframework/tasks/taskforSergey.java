package com.automationpractiveframework.tasks;


import com.automationpractiveframework.objects.Page;
import com.automationpractiveframework.objects.User;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;

import static com.automationpractiveframework.objects.UserCredentials.LOGIN;
import static com.automationpractiveframework.objects.UserCredentials.PASSWORD;


public class taskforSergey {

    public static void main(String[] args) {

        User userAdmin = new User(LOGIN, PASSWORD);
        Page homePage = new Page("","","", "","");


        connectToPage(userAdmin, homePage);


        File constants = new File("/Users/serhiikutsenko/Documents/GitHub/AutomationPracticeFramework/src/constantInfo/constantFile");
        System.out.println("File's length: " + constants.length());
        System.out.println("File path: " + constants.toString());
        System.out.println("File name: " + constants.getName());

//    public static Document connectToPage(User user, Page page) {
//        try {
//            Connection.Response response = Jsoup.connect(page.getLoginURL())
//                    .method(Connection.Method.GET)
//                    .execute();
//
//            response = Objects.requireNonNull(Jsoup.connect(page.getLoginURL())
//                    .data(page.getLoginPath(), user.getLogin())
//                    .data(page.getPassPath(), user.getPassword())
//                    .data(String.valueOf(DataInformation.LOGIN_USERNAME)))
//                    .cookies(response.cookies())
//                    .method(Connection.Method.POST)
//                    .execute();
//            Document doc = Jsoup.connect(page.getIndexPage()).cookies(response.cookies()).get();
//            System.out.println(doc.outerHtml().contains(page.getElementForAutoUser()));
//            return doc;
//        }catch(Exception e){e.printStackTrace();}
//                return null;
//    }
    }

/*
[Вчера 17:57] Pavlo Hurskiy
1)Создать enum login_username, login_password

[Вчера 17:58] Pavlo Hurskiy
2)Lombok установить и рассказать о его возможностях

[Вчера 17:58] Pavlo Hurskiy
3)заменить конструкторы builder в обьектах

[Вчера 18:01] Pavlo Hurskiy
4)создать файл с константами , логин и пароль

[Вчера 18:04] Pavlo Hurskiy
EnumSet
 */

//        try {
//            String url = "https://rutracker.org/forum/login.php";
//            Connection.Response response = Jsoup.connect(url)
//                    .method(Connection.Method.GET)
//                    .execute();
//            response = Jsoup.connect(url)
//                    .data("login_username", "login")
//                    .data("login_password", "password")
//                    .data("login", "")
//                    .cookies(response.cookies())
//                    .method(Connection.Method.POST)
//                    .execute();
//            Document doc = Jsoup.connect("https://rutracker.org/forum/index.php").cookies(response.cookies()).get();
//            System.out.println(doc.outerHtml().contains("Профиль"));
//        }catch(Exception e){e.printStackTrace();}


//}




    public static Document connectToPage(User user, Page page) {

        try {

            Connection.Response response = Jsoup.connect(page.getLoginURL())
                    .method(Connection.Method.GET)
                    .execute();

            response = Jsoup.connect(page.getLoginURL())
                    .data(page.getLoginPath(), user.getLogin())
                    .data(page.getPassPath(), user.getPassword())
                    .data("login", "")
                    .cookies(response.cookies())
                    .method(Connection.Method.POST)
                    .execute();
            Document doc = Jsoup.connect(page.getIndexPage()).cookies(response.cookies()).get();
            System.out.println(doc.outerHtml().contains(page.getElementForAutoUser()));
            return doc;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
