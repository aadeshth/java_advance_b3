package com.java.core.non_access_modif;

public class NonAccessModiSync {

    public static void main(String[] args) {
        Sync sync = new Sync();
        Thread thread1 = new Thread(()-> sync.increase());
        Thread thread2 = new Thread(()-> sync.increase());
        thread1.start();
        thread2.start();
        System.out.println(sync.getNumber());
    }
}
