package com.japharr.sample.singleton.billpugh;

public class Singleton {
    private int data;

    private Singleton() {}

    private static class SingletonHelper {
        private final static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.instance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
