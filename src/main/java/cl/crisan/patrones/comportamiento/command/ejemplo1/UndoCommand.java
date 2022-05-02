package cl.crisan.patrones.comportamiento.command.ejemplo1;

public class UndoCommand extends Command {

    public UndoCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    boolean execute() {
        app.undo();
        return false;
    }
}
