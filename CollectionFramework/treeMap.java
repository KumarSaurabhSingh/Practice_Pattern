import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class treeMap {
    

    static void leanMap(){

        Map<String, Integer> nMap = new TreeMap<>(); // Now this take up the property of Min Heap

        nMap.put("Aammay ", 10);
        nMap.put("Rohan ", 2);
        nMap.put("roushani ", 5);
        nMap.put("shekhar ", 4);

        System.out.println(nMap);

        nMap.putIfAbsent("Rani", 3);
        System.out.println(nMap);

        // //iteration in Map
        // for(Map.Entry<String, Integer> e: nMap.entrySet()){
        //     System.out.println(e.getKey() + e.getValue());

        //     //System.out.println(e.getValue());
        // }

        // //Iteration for only Key
        // for(String key : nMap.keySet()){
        //     System.out.println(key);
        // }

        // //Iteration for only value
        // for(Integer value: nMap.values()){

        //     System.out.println(value);
        // }
    }

    public static void main(String[] args){

        leanMap();
    }
}
