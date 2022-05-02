package cl.crisan.patrones.comportamiento.iterator;

/**
 * Su nombre es porque almacena el listado de nombres
 */
public class NameRepository implements Container {
    public String names[] = {"Cristian", "Daniela", "Josefina", "Matilda"};

    @Override
    public Iterator getIterator() {
        return new NameInterator();
    }

    private class NameInterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
