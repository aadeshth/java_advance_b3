package com.java.test;

public class Employee implements  Comparable<Employee>{
    Integer empId;

    public Employee(Integer empId) {
        this.empId = empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getEmpId() {
        return empId;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return empId.toString();
    }

    @Override
    public int compareTo(Employee e) {
        return this.empId.compareTo(e.getEmpId());
    }
}