package cl.crisan.patrones.comportamiento.mediator.ejemplo1;

public interface Mediator {
    void addUser(User user);
    void sendMessage(String message, String userId);
}
