package com.java.advance.string;

import javax.xml.transform.sax.SAXSource;

public class Test {

    public static void main(String[] args) {
        String str = "Java";
        String str1 = "Java";
        String strJ = new String("Java");
        String strJ1 = new String("Java").intern();
        System.out.println(str == str1);
        System.out.println(str == strJ);
        System.out.println(str == strJ1);

        StringBuilder builder = new StringBuilder();
    }
}
