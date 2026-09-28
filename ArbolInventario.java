public class ArbolInventario {

    // Nodo principal del árbol
    Producto raiz;

    public ArbolInventario() {
        raiz = null;
    }

    // Inserta un producto de forma recursiva
    public void insertar(int id, String nombre) {
        raiz = insertarRecursivo(raiz, id, nombre);
    }

    private Producto insertarRecursivo(Producto actual, int id, String nombre) {

        // Si encontramos un espacio vacío, creamos el nuevo nodo
        if (actual == null) {
            return new Producto(id, nombre);
        }

        // Los ID menores van hacia la izquierda
        if (id < actual.id) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, id, nombre);

        // Los ID mayores van hacia la derecha
        } else if (id > actual.id) {
            actual.derecho = insertarRecursivo(actual.derecho, id, nombre);
        }

        return actual;
    }

    // Muestra los productos ordenados por ID
    public void mostrarInventario() {
        inorden(raiz);
    }

    // Recorrido izquierda - raíz - derecha
    private void inorden(Producto actual) {

        if (actual != null) {

            inorden(actual.izquierdo);

            System.out.println(
                "ID: " + actual.id + " - Nombre: " + actual.nombre
            );

            inorden(actual.derecho);
        }
    }

    // Busca un producto por su ID
    public Producto buscar(int id) {
        return buscarRecursivo(raiz, id);
    }

    private Producto buscarRecursivo(Producto actual, int id) {

        if (actual == null || actual.id == id) {
            return actual;
        }

        if (id < actual.id) {
            return buscarRecursivo(actual.izquierdo, id);
        }

        return buscarRecursivo(actual.derecho, id);
    }
}