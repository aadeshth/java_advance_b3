package com.java.advance.java8features.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        // Consumer example
        Consumer<Integer> consumer = value -> System.out.println(value);
        consumer.accept(10);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.forEach(a -> System.out.println(a));

        Supplier<Integer> supplier = () -> 100;
        System.out.println(supplier.get());

        Function<Integer, Integer> function = number -> number+number;
        System.out.println(function.apply(10));

        List<Integer> finalList = list.stream().map(number -> number + number).collect(Collectors.toList());
        finalList.forEach(num -> System.out.println(num));
        
        // Predicate :
        Predicate<Integer> predicate = numb -> numb%2 == 0;
        System.out.println(predicate.test(10));

        List<Integer> newList = list.stream().filter(numb -> numb % 2 == 0).collect(Collectors.toList());
        newList.forEach(System.out::println);

    }


}
