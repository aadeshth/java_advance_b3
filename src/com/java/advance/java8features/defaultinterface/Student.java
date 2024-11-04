package com.java.advance.java8features.defaultinterface;

public class Student implements StudentI{
    @Override
    public void fetchStudentInfo() {
        System.out.println("i am in to fetch info!");
    }
}
