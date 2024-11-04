package com.java.core.constructor;

public class Test {

    public static void main(String[] args) {
        Student stud = new Student();  // default constructor
        Student studParameterized = new Student("OM","Noida",123);
        Student studCopy = new Student(studParameterized);
        System.out.println(stud.getAddress() + stud.getNumber());
        System.out.println(studCopy.getAddress() + studCopy.getName());

        int number = 10;
        Integer num = Integer.valueOf(number);
        Integer bum = number;
        String numberStr = "10";
        Integer num1 = Integer.valueOf(numberStr);



    }
}
