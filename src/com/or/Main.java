package com.or;

public class Main {

    public static void main(String[] args) {

        Logger l = Logger.getInstance();

        Thread t1 = new CustomThread();
        Thread t2 = new CustomThread();

        t1.start();
        t2.start();
    }
}
