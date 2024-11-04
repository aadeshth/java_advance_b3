package com.java.core.dept;

import com.java.core.employee.Employee;

public class Department extends Employee {

   private String empData;

    public String getEmpData() {
        String  address = super.address; // protected
        String  name =  super.name;  // public

        return address + name;
    }

    /* public static void main(String[] args) {

    }*/
}
