package com.java.advance.designpattern.factory;

public class Test {

    public static void main(String[] args) {
        CompanyFactory companyFactory = new CompanyFactory();
        Employee staff = companyFactory.getEmployee("staff");
        staff.info();

        Employee associate = companyFactory.getEmployee("associate");
        associate.info();
    }
}
