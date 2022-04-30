package cl.crisan.patrones.comportamiento.chain_of_responsability.clase_abstracta;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Standar Console::Logger: "+ message);
    }
}
