package com.java.core.non_access_modif;

public class NonAccessModiStatic {
    static  int number = 10;
    public static void main(String[] args) {
        int a = number;
        Test.print();
        int num = Test.num;
    }
}
