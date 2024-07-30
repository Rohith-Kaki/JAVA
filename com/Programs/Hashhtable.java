import java.util.*;
public class Hashhtable {
    public static void main(String[] args) {
        Hashtable<String,Integer> hs = new Hashtable<>();
        hs.put("rohith",18);
        hs.put("sloth",19);
        hs.put("moth",11);
        Set <String> keys = hs.keySet();
        for(String key:keys){
            System.out.println(key + " "+hs.get(key));
        }
        for(Map.Entry<String, Integer> e :hs.entrySet()){
            // System.out.println(e);
            System.out.println(e.getKey()+ " "+e.getValue());
        }
    }
}
