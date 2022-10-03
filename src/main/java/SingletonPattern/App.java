package SingletonPattern;

public class App {

    public static void main(String[] args) {

        SingletonLogger singletonLogger = SingletonLogger.getInstance();
        singletonLogger.logMessageStart();
        singletonLogger.logMessageStop();

        SingletonLoggerLazyInitialization singletonLoggerLazyInitialization
                = SingletonLoggerLazyInitialization.getInstance();
        singletonLoggerLazyInitialization.logMessageStart();
        singletonLoggerLazyInitialization.logMessageStop();


        SingletonLogger singletonLogger1 = SingletonLogger.getInstance();
    }

}
