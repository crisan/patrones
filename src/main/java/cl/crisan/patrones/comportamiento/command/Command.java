package cl.crisan.patrones.comportamiento.command;

public abstract class Command {

    protected Application app;
    protected Editor editor;
    protected String backup;

    public Command(Application app, Editor editor) {
        this.app = app;
        this.editor = editor;
    }

    // Realiza copia de seguridad del estado del editor
    public void saveBackup() {
        backup = editor.text;
    }

    // Restaura el estado del editor
    public void undo() {
        editor.text = backup;
    }

    /**
     * El método de ejecución se declara abstracto para forzar
     * a todos los comandos concretos a proporcionar sus propias implementaciones.
     * El método debe devolver verdadero o faldo dependiendo de si el comando cambia
     * el estado del editor.
     */

    abstract boolean execute();
}
