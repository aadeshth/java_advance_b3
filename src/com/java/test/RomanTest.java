package com.java.test;

import java.util.*;

public class RomanTest {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,4,5,9,10,40,50,90,100);
        List<String> value = Arrays.asList("I","IV","V","IX","X","XL","L","XC","C");

        int input = 98;
        StringBuilder stringBuilder = new StringBuilder();
        int index =0 ;
        while (input>0) {
            for (int j = 0; j < integers.size(); j++) {
                if (integers.get(j) > input) {
                    index = j;
                    break;
                }
            }
            stringBuilder.append(value.get(index - 1));
            input = input - (integers.get(index - 1));
        }
        System.out.println(stringBuilder);
    }

}
