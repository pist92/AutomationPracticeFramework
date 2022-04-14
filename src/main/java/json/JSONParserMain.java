package json;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JSONParserMain {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();
        try{
          Object object = jsonParser.parse(new FileReader("pagesHomeWork.json"));
            JSONObject jsonObject = (JSONObject) object;
            System.out.println(jsonObject.toJSONString());

            String name = (String) jsonObject.get("name");
            Long count = (long) jsonObject.get("count");
            Boolean test = (Boolean) jsonObject.get("test");
            JSONArray pagesNumbers = (JSONArray) jsonObject.get("pagesNumbers");

            System.out.println(name);
            System.out.println(count);
            System.out.println(test);
            for(Object item:pagesNumbers){
                System.out.println(item);
            }


        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }

    }
}

