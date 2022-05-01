package cl.crisan.patrones.comportamiento.chain_of_responsability.ejemplo2;

public class UserExistMiddleware extends Middleware {
    private Server server;

    public UserExistMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("¡Email no registrado!");
            return false;
        }

        if (!server.isValidPassword(email, password)) {
            System.out.println("¡Password incorrecta!");
            return false;
        }
        return this.checkNext(email, password);
    }
}
