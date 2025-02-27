import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

import javax.xml.validation.SchemaFactory;

public class learnMap {

    // All of the below operation is taking Big O(1) Time complexity

    static void leanMap(){

        Map<String, Integer> nMap = new HashMap<>();

        nMap.put("Sammay ", 1);
        nMap.put("Rohan ", 2);
        nMap.put("roushani ", 5);
        nMap.put("shekhar ", 4);

        System.out.println(nMap);

        nMap.putIfAbsent("Rani", 3);
        System.out.println(nMap);

        //iteration in Map
        for(Map.Entry<String, Integer> e: nMap.entrySet()){
            System.out.println(e.getKey() + e.getValue());

            //System.out.println(e.getValue());
        }

        //Iteration for only Key
        for(String key : nMap.keySet()){
            System.out.println(key);
        }

        //Iteration for only value
        for(Integer value: nMap.values()){

            System.out.println(value);
        }
    }

    public static void main(String[] args){

        leanMap();
    }
    
}