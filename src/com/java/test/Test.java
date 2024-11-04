package com.java.test;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        TreeMap<Employee, Integer> empMap = new TreeMap<>();

        empMap.put(new Employee(200),1);
        empMap.put(new Employee(100),3);
        empMap.put(new Employee(500),2);
        empMap.put(new Employee(800),5);
        empMap.put(new Employee(900),4);
        System.out.println("Test");

        empMap.forEach((employee, integer) ->  System.out.println(employee.getEmpId()));


        HashMap<Integer, Employee> empHMap = new HashMap<>();
        empHMap.put(1,new Employee(200));
        empHMap.put(2,new Employee(100));
        empHMap.put(3,new Employee(500));
        empHMap.put(4,new Employee(800));
        empHMap.put(5,new Employee(900));
        System.out.println("Test");


        //List<Employee> employeeList = empMap.values().stream().sorted(Comparator.comparing(Employee::getEmpId)).collect(Collectors.toList());
        //employeeList.forEach(System.out::println);
    }
}
