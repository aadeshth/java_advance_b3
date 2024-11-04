package com.java.core.exception;

public class Test {

    public static void main(String[] args) {

        try {
            validateAge(17);
        } catch (ValidateAgeException e) {
            System.out.println("Error:Age is not Valid!");
        }
    }

    private static void validateAge(int age) throws ValidateAgeException {
        if(age<18)
            throw new ValidateAgeException("");
    }
}
