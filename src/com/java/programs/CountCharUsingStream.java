package com.java.programs;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharUsingStream {
    public static void main(String[] args) {
        String name = "RohanVikramAaadi";
        List<Character> list = name.chars().mapToObj(data -> (char) data).collect(Collectors.toList());
        Map<Character, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}
