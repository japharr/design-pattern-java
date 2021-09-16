package com.japharr.sample.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.setData(55);
        System.out.println(s);
        System.out.println("data value: " + s.getData());

        s = null;
        s = Singleton.getInstance();
        System.out.println(s);
        System.out.println("data value: " + s.getData());
    }
}
