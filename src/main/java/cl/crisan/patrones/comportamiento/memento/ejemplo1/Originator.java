package cl.crisan.patrones.comportamiento.memento.ejemplo1;

public class Originator {

    private String state;

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
