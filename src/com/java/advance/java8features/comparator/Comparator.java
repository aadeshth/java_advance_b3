package com.java.advance.java8features.comparator;


import java.util.ArrayList;

public class Comparator {

    public static void sortByName(ArrayList<Employee> employeeArrayList)
     {
        /* java.util.Comparator<Employee>  employeeComparator = (Employee e1 , Employee e2)->{
             return  e1.getName().compareTo(e2.getName());
         };*/
         java.util.Comparator<Employee>  employeeComparator = java.util.Comparator.comparing(Employee::getName);
         employeeArrayList.sort(employeeComparator);
     }

    public static void sortById(ArrayList<Employee> employeeArrayList)
    {
        /* java.util.Comparator<Employee>  employeeComparator = (Employee e1 , Employee e2)->{
             return e1.getName().compareTo(e2.getName());
         };*/
        java.util.Comparator<Employee>  employeeComparator = java.util.Comparator.comparing(Employee::getId);
        employeeArrayList.sort(employeeComparator);
    }
    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
     Employee e1 = new Employee(1,10000,"Rohan");
     Employee e2 = new Employee(2,5000,"Abhi");
     Employee e3 = new Employee(3,20000,"Sagar");
        employeeArrayList.add(e1);
        employeeArrayList.add(e2);
        employeeArrayList.add(e3);
        sortByName(employeeArrayList);
        employeeArrayList.forEach(employee -> System.out.println(employee.getId()+ "-" + employee.getSalary()+"-"+employee.getName()));
        sortById(employeeArrayList);
        employeeArrayList.forEach(employee -> System.out.println(employee.getId()+ "-" + employee.getSalary()+"-"+employee.getName()));
       employeeArrayList.stream().map(Employee::getId).forEach(id-> System.out.println(id));
    }
}
