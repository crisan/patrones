package cl.crisan.patrones.comportamiento.mediator.ejemplo1;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();
        User user1 = new ChatUser(mediator, "1", "Cristian");
        User user2 = new ChatUser(mediator, "2", "Daniela");
        User user3 = new ChatUser(mediator, "3", "Josefina");
        User user4 = new ChatUser(mediator, "4", "Matilda");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hola Hola!", "2");
        user2.send("que tal?", "1");

    }
}
