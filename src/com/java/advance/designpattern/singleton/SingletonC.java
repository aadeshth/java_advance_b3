package com.java.advance.designpattern.singleton;

public class SingletonC {
    private static SingletonC singletonC;
    private SingletonC(){}
   public static SingletonC getInstance(){
        if(singletonC == null)
            singletonC = new SingletonC();
        return singletonC;
   }
}
