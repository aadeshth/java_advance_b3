package com.java.advance.designpattern.abstactfactory;

import com.java.advance.designpattern.abstactfactory.employee.Employee;
import com.java.advance.designpattern.abstactfactory.staff.Staff;

public class Test {

    public static void main(String[] args) {

        CompanyFactory companyFactory = new ITCompanyFactory();
        Employee employee = companyFactory.createEmployee();
        employee.info();
        Staff staff = companyFactory.createStaff();
        staff.info();
        System.out.println("Based on the type ");
       Employee dev = companyFactory.createEmployee("dev");
       dev.info();
        Staff security = companyFactory.createStaff("security");
        security.info();
        System.out.println("..........");


        CompanyFactory companyOS = new OutsourceCompanyFactory();
        companyOS.createStaff().info();
        companyOS.createEmployee().info();

    }
}
