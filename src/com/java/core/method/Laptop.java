package com.java.core.method;

public abstract class Laptop {
    int id;
    String name;
    abstract void testMethod();
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static String getData()
    {
        return "Laptop class";
    }
}
