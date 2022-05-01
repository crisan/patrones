package cl.crisan.patrones.comportamiento.command;

public class Editor {

    protected String text;

    public String getSelection() {
        System.out.println("retorna texto seleccionado");
        return "texto seleccionado";
    }

    public void deleteSelection() {
        System.out.println("Se elimina texto seleccionado");
    }

    public void replaceSelection(String newText) {
        System.out.println("se ha reemplazado el texto antiguo por el nuevo texto: " + newText);
    }
}
