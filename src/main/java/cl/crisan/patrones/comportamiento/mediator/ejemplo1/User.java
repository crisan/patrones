package cl.crisan.patrones.comportamiento.mediator.ejemplo1;

public abstract class User {

    private String name;
    private String id;

    private Mediator mediator;

    public User(Mediator mediator, String id, String name) {
        this.mediator = mediator;
        this.id = id;
        this.name = name;
    }

    public abstract void send(String msg, String userId);
    public abstract void receive(String message);

    // Getters, no aplica Setters para hacer el objeto inmutable
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Mediator getMediator() {
        return mediator;
    }

}
