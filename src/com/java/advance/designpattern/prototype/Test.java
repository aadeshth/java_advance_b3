package com.java.advance.designpattern.prototype;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Puru");
        employee.setId(1);
        employee.setAddress("Bangkok");
        System.out.println(employee.getAddress());
        Employee employee1 = employee.clone();
        Employee employee2 = employee.clone();
    }
}
