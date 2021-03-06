package testProjectPackage.automationpractiveframework.tasks;


import testProjectPackage.automationpractiveframework.objects.Page;
import testProjectPackage.automationpractiveframework.objects.User;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;

import static testProjectPackage.automationpractiveframework.objects.UserCredentials.LOGIN;
import static testProjectPackage.automationpractiveframework.objects.UserCredentials.PASSWORD;


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
[?????????? 17:57] Pavlo Hurskiy
1)?????????????? enum login_username, login_password

[?????????? 17:58] Pavlo Hurskiy
2)Lombok ???????????????????? ?? ???????????????????? ?? ?????? ????????????????????????

[?????????? 17:58] Pavlo Hurskiy
3)???????????????? ???????????????????????? builder ?? ????????????????

[?????????? 18:01] Pavlo Hurskiy
4)?????????????? ???????? ?? ?????????????????????? , ?????????? ?? ????????????

[?????????? 18:04] Pavlo Hurskiy
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
//            System.out.println(doc.outerHtml().contains("??????????????"));
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
