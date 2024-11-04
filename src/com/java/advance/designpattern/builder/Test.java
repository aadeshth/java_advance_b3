package com.java.advance.designpattern.builder;


public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee.Builder().id(10).build();
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getAddress());
    }
}
