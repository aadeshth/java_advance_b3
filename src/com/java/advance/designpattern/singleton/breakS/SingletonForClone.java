package com.java.advance.designpattern.singleton.breakS;

public class SingletonForClone implements Cloneable {
    private static SingletonForClone singletonC;
    private SingletonForClone(){}
   public static SingletonForClone getInstance(){
        if(singletonC == null)
            singletonC = new SingletonForClone();
        return singletonC;
   }

    @Override
    public SingletonForClone clone() {
        try {
            SingletonForClone clone = (SingletonForClone) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
