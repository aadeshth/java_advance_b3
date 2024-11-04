package com.java.core.oops.polymorphysm;

public class Overloading {

    public int mathOp(int a, int b , String opp){
        int result=0;
        switch (opp)
        {
            case "+":
                result= a+b;
                break;
            case "*" :
                result= a*b;
                break;
            default:
                result = 100;
        }
        return result;
    }

    public int mathOp(int a, int b){
        return a+b;
    }
}
