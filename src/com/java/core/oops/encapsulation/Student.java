package com.java.core.oops.encapsulation;

public class Student {

    private int studentId;
    private String name;
    private int number;
    public Student(){
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId+100;
    }

    public String getName() {
        return name;
    }
}
