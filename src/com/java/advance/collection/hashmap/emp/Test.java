package com.java.advance.collection.hashmap.emp;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Employee, String> employeeStringHashMap = new HashMap<>();
        Employee employee1 = new Employee(1,"Vikram");
        Employee employee2 = new Employee(2,"Rohan");
        Employee employee3 = new Employee(3,"Abhi");

        Employee employee4 = new Employee(4,"Abhi");

        employeeStringHashMap.put(employee1, "Manager");
        employeeStringHashMap.put(employee2, "Sr. Manager");
        employeeStringHashMap.put(employee3, "Sr Assosite ");
        employeeStringHashMap.put(employee4, "Sr Assosite ");


        for (Employee emp: employeeStringHashMap.keySet())
         {
             System.out.println(emp.getId()+" "+ emp.getName() +"= "+employeeStringHashMap.get(emp));
         }
    }
}
