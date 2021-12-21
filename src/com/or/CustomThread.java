package com.or;

public class CustomThread extends Thread{

    @Override
    public void run() {

        if(Logger.getInstance() != null){

          System.out.println(LogLevel.INFO +  " Logging from: " + Thread.currentThread().getName());
        }
    }
}
