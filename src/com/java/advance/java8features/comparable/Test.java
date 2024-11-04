package com.java.advance.java8features.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        Employee e1 = new Employee(1,10000,"Rohan");
        Employee e2 = new Employee(2,5000,"Abhi");
        Employee e3 = new Employee(3,20000,"Sagar");
        employeeArrayList.add(e1);
        employeeArrayList.add(e2);
        employeeArrayList.add(e3);
        Collections.sort(employeeArrayList);
        employeeArrayList.forEach(employee -> System.out.println(employee.getId()+ "-" + employee.getSalary()+"-"+employee.getName()));

    }
}
