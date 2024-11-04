package com.java.core.loop;

import java.util.ArrayList;
import java.util.Arrays;

public class LoopStatements {
    public static void main(String[] args) {
        // Incremental For Loop
        for (int i = 1; i <= 10; i++)
            System.out.println(i);

        // Decremental  For Loop
        for (int i = 10; i >= 1; i--)
            System.out.println(i);

        //While loop
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }


        // Do while loop
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        // foreach
        ArrayList<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
         for(Integer value: values)
           System.out.println(value);
    }
}
