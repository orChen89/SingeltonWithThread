package com.or;

public class CustomThread extends Thread{

    @Override
    public void run() {

        if(Logger.getInstance() != null){

          Logger.getInstance().log(LogLevel.INFO, "logging from: " + Thread.currentThread().getName());

        }
    }
}
