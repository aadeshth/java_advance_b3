package com.java.advance.java8features.collectors;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsUtil {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Rohan");
        names.add("Abhi");
        names.add("Abhi");
        names.add("Kalash");
        names.add("Minu");
        names.add("Minu");names.add("Minu");
        names.add("Aadi");
     /// Collectors.toList()
        List<String> nameContainsA = names.stream().map(String::toLowerCase).filter(name-> name.contains("a")).collect(Collectors.toList());
        nameContainsA.forEach(System.out::println);

        /// Collectors.joining()
        String strQ = names.stream().collect(Collectors.joining(","));
        System.out.println(strQ);

        //Collectors.groupingBy()
        Map<Character, List<String>> goupByFirstChar = names.stream().collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println(goupByFirstChar);

        //count of words
        Map<String, Long> map = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        // Collectors.summingInt();
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);
        Integer sum = values.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum);

        Double av = values.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(av);


        IntSummaryStatistics sumr = values.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(sumr);
        
        List<Double> valuesD = Arrays.asList(1.1,10.8);

        System.out.println(valuesD.stream().mapToDouble(Double::doubleValue).max());
        

    }
}
