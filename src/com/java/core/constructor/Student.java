package com.java.core.constructor;

public class Student {
    private String name;
    private String address;
    private int number;

    public Student() {
    }

    public Student(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name,  int number) {
        this.name = name;
        this.number = number;
    }
    public Student(String name,  String address) {
        this.name = name;
        this.address = address;
    }

    public Student(Student student)
    {  this.name = student.getName();
        this.address = student.getAddress();
        this.number = student.getNumber();
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
