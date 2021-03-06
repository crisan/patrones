package cl.crisan.patrones.comportamiento.command.ejemplo1;

public class CopyCommand extends Command {

    public CopyCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        this.app.clipboard = this.editor.getSelection();
        return false;
    }
}
