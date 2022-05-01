package cl.crisan.patrones.comportamiento.chain_of_responsability.ejemplo2;

public abstract class Middleware {

    private Middleware next;

    /**
     * Construye la cadena de objetos Middleware.
     * @param next El siguiente objeto de la cadena.
     * @return Retorna el mismo objeto que entra.
     */
    public Middleware linkNext(Middleware next) {
        this.next = next;
        return next;
    }

    /**
     * Ejecuta la comprobación del siguiente objeto de la cadena o finaliza el recorrido si estamos en el
     * último objeto de la cadena.
     * @param email
     * @param password
     * @return
     */
    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }

    /**
     * La(s) Subclases deben implementar este check de forma concreta
     * @param email
     * @param password
     * @return
     */
    public abstract boolean check(String email, String password);




}
