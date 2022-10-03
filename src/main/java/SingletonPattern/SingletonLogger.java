package SingletonPattern;

public class SingletonLogger {
    //eager initialization

    private static SingletonLogger instance = new SingletonLogger();
    //having the constructor private, it cannot be called from another class.
    private SingletonLogger(){}
    //getter
    public static SingletonLogger getInstance(){return instance;}

    public void logMessageStart(){System.out.println("Start logging");}

    public void logMessageStop(){System.out.println("Stop logging");}
}
