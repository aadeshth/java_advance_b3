package com.java.advance.designpattern.factory;

public class CompanyFactory {

    public Employee getEmployee(String employeeType)
    {
        if(employeeType.equalsIgnoreCase("staff"))
        {
            return new Staff();
        }
        if(employeeType.equalsIgnoreCase("associate"))
        {
            return new Associate();
        }
        return null;
    }
}
