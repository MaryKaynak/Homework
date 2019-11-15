package day20_Map;

import java.util.HashMap;

public class day20_map2 {
    public static void main(String[] args) {

        HashMap<String,String> hashmap = new HashMap<>();
        HashMap<String, String> hashMap = hashmap;
        hashMap.put("a","b");

          if (hashMap.containsKey("b"))
                if (hashMap.containsKey("a")) {
                    hashMap.put("ab", hashMap.get("a") + hashMap.get("b"));
                }

        System.out.println(hashmap);
        }
    }

