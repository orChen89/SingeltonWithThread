package com.or;

public class Logger {

    private Logger() {}

    private static Logger instance;

    public synchronized static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(LogLevel logLevel, String msg) {
        System.out.println("<" + logLevel.name() + "> : " + msg);
    }

   }
