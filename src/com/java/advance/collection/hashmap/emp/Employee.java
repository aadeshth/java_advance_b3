package com.java.advance.collection.hashmap.emp;

import java.util.Objects;

public class Employee {
private int id;
private String name;

public Employee(int id , String name)
{
    this.id = id;
    this.name = name;
}
    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    @Override
    public int hashCode(){
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object object)
    {
        if(this == object)return  true;
        if(object ==null || object.getClass() != getClass()) return false;
        Employee emp = (Employee) object;
        return id == emp.getId() && Objects.equals(name,emp.getName());
    }
}
