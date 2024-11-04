package com.java.advance.collection.hashmap.customhashmap;

public class Test {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> ch = new CustomHashMap<>();
        ch.put("rohan",100);
        ch.put("vikram", 200);
        ch.put("Puru", 200);

        System.out.println(ch.get("rohan"));
        System.out.println(ch.get("vikram"));
    }
}
