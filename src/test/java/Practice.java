import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.*;

public class Practice {

    public static void main(String... args){
        try {
            Object obj = new JSONParser().parse(new FileReader("src/test/test.json"));
            JSONObject jsonObject = (JSONObject) obj;

            JSONArray jsonArray = new JSONArray();
            for(int i=0; i < 2; i++){
                jsonArray.add(jsonObject);
            }

            JSONArray users = (JSONArray) JSONValue.parse(jsonArray.toJSONString());
            JSONObject firstUser = (JSONObject) users.get(0);
            firstUser.put("car","Benz");
            System.out.println(users.toJSONString());

        }catch (FileNotFoundException e){
            e.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
