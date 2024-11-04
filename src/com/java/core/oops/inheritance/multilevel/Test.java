package com.java.core.oops.inheritance.multilevel;

public class Test {

    public static void main(String[] args) {

        // Teacher ---> Department ---> School
        Teacher teacher = new Teacher();
        teacher.printTeacherData();
        teacher.printDept();
        teacher.printSchoolData();
    }
}
