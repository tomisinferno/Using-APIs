package info.hccis.starting.bo;
import info.hccis.util.UtilityRest;
import java.net.URLEncoder;
import org.json.*;

/**
 *
 * @author tomia
 * @since 11/4/2021
 * API for checking the gender of a name
 */
public class APIProcessor {
    public static final String URL = "https://api.genderize.io/?name=";
    
    public static String callApi(String name){
        
        String json = UtilityRest.getJsonFromRest(URL+URLEncoder.encode(name));
        System.out.println("\njson returned= " + json + "\n");
        
        JSONObject jsonObject = new JSONObject(json);
           
        String gender = jsonObject.getString("gender");
        
        double probability = jsonObject.getDouble("probability");
        
//        System.out.println("You are probably a " + gender+ "\n");

        System.out.println("There is a " + probability*100 + "% chance you are a " + gender + ".");
        
        return gender;      
    }
}
