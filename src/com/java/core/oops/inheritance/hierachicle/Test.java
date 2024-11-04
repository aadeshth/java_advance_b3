package com.java.core.oops.inheritance.hierachicle;

public class Test {

    public static void main(String[] args) {
        Student student = new Student();
        Department department = new Department();
        Teacher teacher = new Teacher();

        teacher.printTeacherData();
        teacher.printSchoolData();

        department.printDept();
        department.printSchoolData();

        student.printStudentData();
        student.printSchoolData();
    }
}
