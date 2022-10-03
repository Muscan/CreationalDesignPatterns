package SingletonPattern;

public class SingletonLoggerLazyInitialization {
    //Lazy inititalization
    private static SingletonLoggerLazyInitialization instance;
    private SingletonLoggerLazyInitialization(){}

    public static SingletonLoggerLazyInitialization getInstance(){
        if(instance == null){
            instance = new SingletonLoggerLazyInitialization();
        }
        return instance;
    }

    /*//for thread safe use this block of code with synchronized
    * public static synchronized SingletonLoggerLazyInitialization getInstance(){
        if(instance == null){
            instance = new SingletonLoggerLazyInitialization();
        }
        return instance;*/
    public void logMessageStart(){System.out.println("Start Lazzy logging");}

    public void logMessageStop(){System.out.println("Stop Lazzy logging");}
}
