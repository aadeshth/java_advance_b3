package com.java.core.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    transient int sal;
    private String address;
    private int number;

    public Employee(){

    }
    public Employee(String name, int sal, String address, int number) {
        this.name = name;
        this.sal = sal;
        this.address = address;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int getSal() {
        return sal;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}
