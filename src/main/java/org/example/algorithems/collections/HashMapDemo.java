package org.example.algorithems.collections;
import java.util.*;
import java.util.Map.Entry;
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // add key=value into map
        map.put("bse", 66000);
        map.put("nse", 40000);

        // add if present
        map.putIfAbsent("dow", 12000);

        // add collection
        Map<String, Integer> sensex = new HashMap<>();
        sensex.put("ncdex", 4344);
        sensex.put("gcd", 65000);
        map.putAll(sensex);

        // get value for a key
        System.out.println(map.get("bse"));

        //update all key with new value
        map.replaceAll((k,v) -> v + 100);

        //remove a value for key
        map.remove("bse");

        // check if value exist
        if(!map.containsKey("bse")) {
            System.out.println("bse key does not exist");
        }

        // get all keys
        Set<String> keys = map.keySet();
        for (String key: keys) {
            System.out.println("Key = "+key);
        }

        // get all values
        Collection<Integer> values = map.values();
        for(Integer value: values) {
            System.out.println("Values = "+value);
        }

        // check if map is empty
        if(map.isEmpty()) {
            System.out.println("Map is empty");
        }

        // traverse map
        map.forEach((key,value) -> System.out.println(key + " ==> "+value));

        // traverse using entry set
        for(Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " ---- "+entry.getValue());
        }
        System.out.println(map);
    }
}
