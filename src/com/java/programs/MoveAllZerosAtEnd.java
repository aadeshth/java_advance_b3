package com.java.programs;

import java.util.Arrays;

public class MoveAllZerosAtEnd {
    public static void main(String[] args) {
        // input : 1,0,4,10,4,1,0,6
        //  out: 1,4,10,4,1,6,0,0
        int[] input = {1, 0, 4, 10, 4, 1, 0, 6};
        //usingPointer(input);

        int[] nonZeroArray = Arrays.stream(input).filter(num -> num != 0).toArray();
        for(int i = 0; i < nonZeroArray.length; i++)
            input[i] = nonZeroArray[i];

        Arrays.stream(input).forEach(System.out::println);
       System.out.println(".......");
        for(int i = nonZeroArray.length; i < input.length; i++)
            input[i]=0;

      Arrays.stream(input).forEach(System.out::println);
}
    private static void usingPointer( int[] input) {
        int nonZeroPointer=0;

        for(int num:input)
        {
            if(num !=0)
                input[nonZeroPointer++] = num;
        }
        Arrays.stream(input).forEach(System.out::println);
        System.out.println(".......");
        System.out.println(nonZeroPointer);
        while(nonZeroPointer<input.length)
        {
            input[nonZeroPointer] = 0;
            nonZeroPointer++;
        }
        System.out.println(".......");
        Arrays.stream(input).forEach(System.out::println);
        System.out.println(".......");
    }
}
