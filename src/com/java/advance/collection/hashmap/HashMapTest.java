package com.java.advance.collection.hashmap;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> address = new HashMap<>();
        address.put("Sangram","Delhi");
        address.put("Puru", "Bankok");
        address.put("Puru", "Delhi");

        

        System.out.println(address);
        System.out.println(address.size());
        for(String name : address.keySet())
            System.out.println(name);

        for (String place: address.values())
            System.out.println(place);

        for (String key: address.keySet())
            System.out.println("Key : "+key+" value: "+address.get(key));

        address.forEach((key, value) -> System.out.println("Key : "+key+" value: "+value));

       for (Map.Entry<String,String> entry : address.entrySet())
           System.out.println("Key : "+entry.getKey()+" value: "+entry.getValue());

        System.out.println("................");
        Set addressSet = address.entrySet();
        Iterator it = addressSet.iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println("Key : "+entry.getKey()+" value: "+entry.getValue());
        }
    }
}
