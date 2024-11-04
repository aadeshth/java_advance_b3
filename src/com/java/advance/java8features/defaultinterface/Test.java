package com.java.advance.java8features.defaultinterface;

public class Test {
    public static void main(String[] args) {
        StudentI studentI = new Student();
        studentI.schoolTimeDetails();
        studentI.fetchStudentInfo();

        StudentI.calculate(1,4);
    }
}
