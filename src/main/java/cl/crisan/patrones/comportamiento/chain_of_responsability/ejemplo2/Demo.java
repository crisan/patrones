package cl.crisan.patrones.comportamiento.chain_of_responsability.ejemplo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("crisan@gmail.com", "user_pass");
        server.register("admin@example.com", "admin_pass");

        // Hacer el chain
        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkNext(new UserExistMiddleware(server))
                .linkNext(new RoleCheckMiddleware());

        // Server obtiene una cadena del código cliente
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();
        boolean success = false;
        do {
            System.out.println("Ingrese email: ");
            //String email = reader.readLine();
            String email = "crisan@gmail.com";
            System.out.println("Ingrese clave");
            String password = "user_pass";
            success = server.logIn(email, password);
        } while (!success);
    }
}
