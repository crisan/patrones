package cl.crisan.patrones.comportamiento.mediator.ejemplo1;

import java.util.HashMap;
import java.util.Map;

public class MediatorImpl implements Mediator {

    private Map<String, User> usersMap = new HashMap<>();

    @Override
    public void addUser(User user) {
       this.usersMap.put(user.getId(), user);
    }

    @Override
    public void sendMessage(String message, String userId) {
        User u = usersMap.get(userId);
        u.receive(message);
    }
}
