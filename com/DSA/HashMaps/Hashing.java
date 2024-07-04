package DSA.HashMaps;
import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        HashMap <String, Integer> map = new HashMap<>();
        map.put("india", 100);
        map.put("ia", 1);
        map.put("ie", 10);
        for(Map.Entry<String, Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key:keys){
            System.out.println(key + " " + map.get(key));
        }

    }
}
