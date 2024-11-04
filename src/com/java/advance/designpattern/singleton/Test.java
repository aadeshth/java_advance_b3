package com.java.advance.designpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {


    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SingletonC realSingleton = SingletonC.getInstance();
        // Testing Singleton
        if (realSingleton == SingletonC.getInstance()) {
            System.out.println("Same instance received! ");
        } else
            System.out.println("Not Same!");

        //Breaking Singleton
        // 1 : Reflection :
        Constructor<SingletonC> cConstructor = SingletonC.class.getDeclaredConstructor();
        cConstructor.setAccessible(true);
        SingletonC newSingletion = cConstructor.newInstance();
        if (realSingleton == newSingletion) {
            System.out.println("Same instance received by Reflaction! ");
        } else
            System.out.println("Break singleton so instance Not Same!");
    }

}
