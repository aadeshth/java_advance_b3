package com.java.advance.java8features.stream;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamTest {

    /*
    1: Intermediate operations
 map(), filter(), flatMap(), distinct() ,pick(),sorted() ,skip(), limit()
2: Terminal operation : collect(), forEach(), toArray() ,reduce() ,count() ,min() and max() ,anyMatch()
allMatch()
findFirst()
findAny()
     */

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        List<Integer> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);
         // Flatmap
        Stream.of(list).flatMap(List::stream).distinct().skip(1).forEach(System.out::println);

        System.out.println("Print second Max number from List");

        Optional<Integer> secondElement = Stream.of(list).flatMap(List::stream).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        secondElement.ifPresent(System.out::println);
    }
}
