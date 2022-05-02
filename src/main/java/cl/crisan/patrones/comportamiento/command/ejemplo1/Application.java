package cl.crisan.patrones.comportamiento.command.ejemplo1;

import java.util.List;

public class Application {

    protected String clipboard;
    protected List<Editor> editors;
    protected Editor activeEditor;
    protected CommandHistory history;

    /**
     * Ejecuta un comando y comprueba si debe añadirse al historial
     */
    public void executeCommand(Command command) {
        if (command.execute())
            history.push(command);
    }

    public void copy() {
        executeCommand(new CopyCommand(this, activeEditor));
    }

    public void cut() {
        executeCommand(new CutCommand(this, activeEditor));
    }

    public void paste() {
        executeCommand(new PasteCommand(this, activeEditor));
    }

    /**
     * Toma el comando másreciente del historial y ejecuta su método
     * deshacer. Observa que no conocemos la clase de este comando. Pero no tenemos por que,
     * ya que el comando sabe como deshacer su propia acción.
     */
    public void undo() {
        Command command = history.pop();
        if (command != null)
            command.undo();
    }

}
