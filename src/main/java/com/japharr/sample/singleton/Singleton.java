package com.japharr.sample.singleton;

public class Singleton {
    private static Singleton instance = null;

    private int data;

    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null)
            instance = new Singleton();

        return instance;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
