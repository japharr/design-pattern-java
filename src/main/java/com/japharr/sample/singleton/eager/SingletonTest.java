package com.japharr.sample.singleton.eager;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.setData(44);System.out.println(s);
        System.out.println("data value: " + s.getData());

        s = Singleton.getInstance();
        System.out.println(s);
        System.out.println("data value: " + s.getData());
    }
}
