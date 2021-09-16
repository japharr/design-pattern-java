package com.japharr.sample.singleton.doudoublecheck;

public class Singleton {
    private static volatile Singleton instance = null;

    private int data;

    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
