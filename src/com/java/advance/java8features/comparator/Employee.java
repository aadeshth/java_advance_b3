package com.java.advance.java8features.comparator;

public class Employee  {
    private final int id;
    private final Integer salary;
    private final  String name;

    public Employee(int id, int salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
}
