package com.java.advance.collection;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Harsh");
        nameList.add("Rohan");
        nameList.add("Sangram");
        System.out.println(nameList.get(1));
        System.out.println("Name List: ");

        for(int i= 0; i < nameList.size(); i++)
            System.out.println(nameList.get(i));

        for(String name:nameList)
        {
            System.out.println(name);
        }
        nameList.stream().forEach(name-> System.out.println(name));

        nameList.set(1,"Vikrant");
        nameList.stream().forEach(name-> System.out.println(name));
       nameList.remove("Sangram");
        nameList.stream().forEach(name-> System.out.println(name));


    }
}
