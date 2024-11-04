package com.java.core.serialization;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Employee em = new Employee();

        Employee employee = new Employee("OM",10000,"Noida",123);
        System.out.println(employee.getAddress() );
        System.out.println(employee.getName() );
        System.out.println(employee.getNumber() );
        System.out.println(employee.getSal() );
        // Serialization
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("emp.txt"));
        out.writeObject(employee);
        out.close();
        // DeSerialization
        System.out.println("DeSerialization ------------------------");

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("emp.txt"));
        Employee emp =(Employee)in.readObject();
        in.close();
        System.out.println(emp.getAddress() );
        System.out.println(emp.getName() );
        System.out.println(emp.getNumber() );
        System.out.println(emp.getSal() );

    }
}
