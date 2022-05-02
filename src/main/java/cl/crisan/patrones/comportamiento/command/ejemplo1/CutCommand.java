package cl.crisan.patrones.comportamiento.command.ejemplo1;

public class CutCommand extends Command {

    public CutCommand(Application app, Editor editor) {
        super(app, editor);
    }

    /**
     * El comando cortar no cambia el estado del editor, por lo que debe
     * guardarse en el historial. Y se guardará siempre y cuando el método
     * devuelva verdadero
     */
    @Override
    public boolean execute() {
        saveBackup();
        app.clipboard = editor.getSelection();
        editor.deleteSelection();
        return true;
    }
}
