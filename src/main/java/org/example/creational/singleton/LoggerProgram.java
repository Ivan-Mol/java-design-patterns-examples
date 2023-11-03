package org.example.creational.singleton;

public class LoggerProgram {
    public static void main(String[] args) {
        Logger.getLogger().addLogInfo("Log1");
        Logger.getLogger().addLogInfo("log2");
        System.out.println(Logger.getLogger().getLogFile());
    }
}
