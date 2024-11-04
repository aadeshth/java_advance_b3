package com.java.advance.designpattern.abstactfactory;

import com.java.advance.designpattern.abstactfactory.employee.Developer;
import com.java.advance.designpattern.abstactfactory.employee.Employee;
import com.java.advance.designpattern.abstactfactory.employee.Manager;
import com.java.advance.designpattern.abstactfactory.staff.Hr;
import com.java.advance.designpattern.abstactfactory.staff.Security;
import com.java.advance.designpattern.abstactfactory.staff.Staff;

public class OutsourceCompanyFactory implements CompanyFactory {
    @Override
    public Employee createEmployee() {
        return new Manager();
    }

    @Override
    public Staff createStaff() {
        return new Security();
    }

    @Override
    public Employee createEmployee(String type) {
        switch (type){
            case "dev":
                return new Developer();
            case "manager":
                return new Manager();
            default:
                return null;
        }
    }

    @Override
    public Staff createStaff(String type) {
        switch (type){
            case "hr":
                return new Hr();
            case "manager":
                return new Security();
            default:
                return null;
        }
    }

}
