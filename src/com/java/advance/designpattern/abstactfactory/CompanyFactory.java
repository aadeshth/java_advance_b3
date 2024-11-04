package com.java.advance.designpattern.abstactfactory;

import com.java.advance.designpattern.abstactfactory.employee.Employee;
import com.java.advance.designpattern.abstactfactory.staff.Staff;

public interface CompanyFactory {
    Employee createEmployee();
    Staff createStaff();
    Employee createEmployee(String type);
    Staff createStaff(String type);
}
