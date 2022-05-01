package cl.crisan.patrones.comportamiento.chain_of_responsability.ejemplo1;

public class FileLogger extends  AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
