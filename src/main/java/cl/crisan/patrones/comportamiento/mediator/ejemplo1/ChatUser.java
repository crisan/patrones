package cl.crisan.patrones.comportamiento.mediator.ejemplo1;

public class ChatUser extends User {

    public ChatUser(Mediator mediator, String id, String name) {
        super(mediator, id, name);
    }

    @Override
    public void send(String msg, String userId) {
        System.out.println(this.getName() + ":: Sending Message: "+ msg);
        getMediator().sendMessage(msg, userId);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.getName() + ":: Receive Message: " + msg);
    }
}
