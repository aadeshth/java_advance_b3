package com.java.advance.designpattern.builder;

public class Employee {
    private final int id;
    private final String name;
    private final String address;

    public Employee(Builder builder) {
        this.name = builder.name;
        this.id = builder.id;
        this.address = builder.address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public static class Builder {
        private int id;
        private  String name;
        private  String address;

        public Builder id(int id)
        {
            this.id = id;
            return this;
        }

        public Builder name(String name)
        {
            this.name = name;
            return this;
        }
        public Builder address(String address)
        {
            return this;
        }

        Employee build(){
            if(address == null)
                this.address = "This is my Default address";
            return new Employee(this);
        }
    }
}
