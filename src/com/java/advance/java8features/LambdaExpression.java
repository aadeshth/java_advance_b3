package com.java.advance.java8features;

@FunctionalInterface
interface Employee{
    void cal(int a , int b , String operation);
    default void print(){
        System.out.println("M defualt!");
    }
}

public class LambdaExpression {
    public static void main(String[] args) {
       Employee employee = (a, b, operation) -> {
         switch (operation)
         {
             case "+":
                 System.out.println(a+b);
                 break;
             case "-":
                 System.out.println(a-b);
                 break;
             default:
                 System.out.println("No operation found!");
                 break;

         }
       };
    employee.cal(1,2,"+");
    employee.cal(1,1,"-");
    employee.cal(1,1,"*");
    }
}
