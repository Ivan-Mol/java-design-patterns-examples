package org.example.creational.singleton;

public class Logger {
    private static Logger logger;
    private static String logFile = "";

    private Logger() {
    }

    public static synchronized Logger getLogger(){
        if (logger == null){
            logger = new Logger();
        }
        return logger;
    }

    public void addLogInfo(String info){
        logFile = logFile + info + "\n";
    }

    public String getLogFile(){
        return logFile;
    }
}
