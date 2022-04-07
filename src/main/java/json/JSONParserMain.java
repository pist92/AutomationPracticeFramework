package json;
import com.epam.ta.reportportal.ws.annotations.In;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static json.UserData.PATH_TO_FILE;


public class JSONParserMain {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();
        try{
          Object object = jsonParser.parse(new FileReader(PATH_TO_FILE));
            JSONObject jsonObject = (JSONObject) object;
//            System.out.println(jsonObject.toJSONString());
            String city = (String) jsonObject.get("name");
            Long count = (long) jsonObject.get("count");
            Boolean test = (Boolean) jsonObject.get("test");
            JSONArray arrays = (JSONArray) jsonObject.get("pagesNumbers");
            System.out.println(city);
            System.out.println(count);
            System.out.println(test);
            for(Object item:arrays){
                System.out.println(item);
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
