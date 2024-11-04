package com.java.advance.designpattern.singleton.breakS;

import com.java.advance.designpattern.singleton.SingletonC;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {


    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SingletonForClone realSingleton = SingletonForClone.getInstance();
        // Testing Singleton
        if (realSingleton == SingletonForClone.getInstance()) {
            System.out.println("Same instance received! ");
        } else
            System.out.println("Not Same!");

        //Breaking Singleton
        // 1 : Reflection :
        Constructor<SingletonForClone> cConstructor = SingletonForClone.class.getDeclaredConstructor();
        cConstructor.setAccessible(true);
        SingletonForClone newSingletion = cConstructor.newInstance();
        if (realSingleton == newSingletion) {
            System.out.println("Same instance received by Reflaction! ");
        } else
            System.out.println("Break singleton so instance Not Same!");

        //Cloning
        SingletonForClone singletonForClone = realSingleton.clone();
        System.out.println(singletonForClone == realSingleton);

        // 3 Serialization and Deserialization
        // 4 Multithreaded env


    }



}
