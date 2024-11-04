package com.java.core.non_access_modif;

public class Sync {
    private  int number  = 1;
    public synchronized void increase()
    {
        number++;
    }

    public int getNumber() {
        return number;
    }
}
