package com.java.advance.java8features.defaultinterface;

public interface StudentI {
    void fetchStudentInfo();
    default void schoolTimeDetails(){
        System.out.println("Student has to present to school at 9.am every day!");
    }
   static int calculate(int a, int b){
       return 0;
   }
}
