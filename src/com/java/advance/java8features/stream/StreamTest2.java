package com.java.advance.java8features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest2 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Rohan");
        names.add("Abhi");
        names.add("Kalash");
        names.add("Minu");

       List<String> nameContainsA = names.stream().map(String::toLowerCase).filter(name-> name.contains("a")).collect(Collectors.toList());
        nameContainsA.forEach(System.out::println);
        //map and collect
//       List<String> upperCaseList =  names.stream().map(String::toUpperCase).collect(Collectors.toList());
//       System.out.println(upperCaseList);
//
//       // map and forEach
//        names.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));

    }
}
