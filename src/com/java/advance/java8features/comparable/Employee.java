package com.java.advance.java8features.comparable;

public class Employee implements Comparable<Employee> {
    private final int id;
    private final Integer salary;
    private final  String name;

    public Employee(int id, int salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }
    @Override
    public int compareTo(Employee e) {
        return this.salary.compareTo(e.salary);
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
