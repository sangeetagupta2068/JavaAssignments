package com.domain.sangeetagupta.collection_demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

    //order mein aayega keys
    public static void main(String... args) {
        TreeMap<String, Integer> hashMap = new TreeMap<>();
        hashMap.put("Zeenat", 101);
        hashMap.put("Nikita", 102);
        hashMap.put("Sangeeta", 103);
        hashMap.put("Vaibhavi", 104);

        //hashing mechanism used to store keys
        //unique set of keys
        //randomnly being displayed
        System.out.println(hashMap);

        System.out.println(hashMap.get("Nikita"));

        System.out.println(hashMap.containsKey("Sangeeta"));
        System.out.println(hashMap.containsValue(101));

        //isEmpty(), size()
        //value se remove nahi hoga idhar
        //doesn't support iterator
        hashMap.remove("Sangeeta");
        System.out.println(hashMap);

        Set<String> keys = hashMap.keySet();

        Iterator<String> iterator = keys.iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            int value = hashMap.get(key);
        }
    }
}
