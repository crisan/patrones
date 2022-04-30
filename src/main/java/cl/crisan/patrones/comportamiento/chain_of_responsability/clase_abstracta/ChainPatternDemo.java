package cl.crisan.patrones.comportamiento.chain_of_responsability.clase_abstracta;

public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "Esta es una información");

        loggerChain.logMessage(AbstractLogger.DEBUG,"Esto es una información de Debug");

        loggerChain.logMessage(AbstractLogger.ERROR, "Esta es una información de Error");
    }
}
