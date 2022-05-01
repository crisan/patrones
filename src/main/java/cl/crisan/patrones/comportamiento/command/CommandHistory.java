package cl.crisan.patrones.comportamiento.command;

import java.util.Stack;

public class CommandHistory {

    private Stack<Command> history;

    public void push(Command command) {
        history.push(command);
    }

    public Command pop() {
        return history.pop();
    }
}
