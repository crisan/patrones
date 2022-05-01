package cl.crisan.patrones.comportamiento.chain_of_responsability.ejemplo2;

public class RoleCheckMiddleware extends Middleware {

    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("¡Hola, Administrador!");
            return true;
        }
        System.out.println("¡Hola, Usuario!");
        return this.checkNext(email, password);
    }
}
