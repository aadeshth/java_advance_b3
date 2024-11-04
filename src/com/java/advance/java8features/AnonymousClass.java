package com.java.advance.java8features;

import java.util.Comparator;

interface EmployeeSalary
{
    int salary = 10000;
    void fetchSalary();
    void paySalary();
}

abstract class ab {
    abstract void fetchSalary();
}
public class AnonymousClass {

    public static void main(String[] args) {

        ab a = new ab() {
            @Override
            void fetchSalary() {

            }
        };
        a.fetchSalary();

        EmployeeSalary employeeSalary = new EmployeeSalary() {
            @Override
            public void fetchSalary() {
                System.out.println("My Salary : "+salary);
            }

            @Override
            public void paySalary() {
            }
        };
        employeeSalary.fetchSalary();
        employeeSalary.paySalary();

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Started!");
            }
        });
        t.start();
    }


}
