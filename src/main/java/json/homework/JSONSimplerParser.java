package json.homework;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JSONSimplerParser {

    public Root parse() {

        Root root = new Root();
        JSONParser parser = new JSONParser();

        try(FileReader reader = new FileReader("/Users/serhiikutsenko/Documents/GitHub/AutomationPracticeFramework/src/main/java/json/homework/pagesHomeWork.json")) {

           JSONObject rootJsonObject = (JSONObject) parser.parse(reader);

           String name = (String) rootJsonObject.get("name");
           Long count = (Long) rootJsonObject.get("count");
           Boolean test = (Boolean) rootJsonObject.get("test");

           JSONArray pagesNumberArray = (JSONArray) rootJsonObject.get("pagesNumbers");
           JSONArray pagesArray = (JSONArray) rootJsonObject.get("pages");
            JSONArray usersArray = (JSONArray) rootJsonObject.get("users");

            List<PagesNumbers> pagesNumbersList = new ArrayList<>();
            List<Pages> pagesList = new ArrayList<>();
            List<Users> usersList = new ArrayList<>();

//            for (Object item: pagesNumberArray){
//                JSONObject pagesObject = (JSONObject) item;
//                PagesNumbers pagesNumbers = new PagesNumbers();
//                pagesNumbersList.add(pagesNumbers);
//            }
//            for(Object item:pagesNumberArray){
//                System.out.println(item);
//            }


            for (Object item: pagesArray) {
                JSONObject pagesNumberObject = (JSONObject) item;

                String title = (String) pagesNumberObject.get("title");
                String url = (String) pagesNumberObject.get("url");
                Boolean guests = (Boolean) pagesNumberObject.get("guests");

                 Pages pages = new Pages(title, url, guests);
                 pagesList.add(pages);

            }

            for (Object item: usersArray) {
                JSONObject userObject = (JSONObject) item;

                String userTitle = (String) userObject.get("userTitle");
                String role = (String) userObject.get("role");
                Long accessRight = (Long) userObject.get("accessRight");

                Users users = new Users(userTitle, role, accessRight);
                usersList.add(users);

            }

           root.setName(name);
           root.setCount(count);
           root.setTest(test);
          // root.setPagesNumbers(pagesNumbersList);
           root.setPages(pagesList);
           root.setUsers(usersList);

           return root;

        } catch (Exception e){
            System.out.println("Parsing error" + e.toString());
        }
        return null;
    }
}
