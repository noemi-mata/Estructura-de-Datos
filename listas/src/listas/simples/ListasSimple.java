package listas.simples;

/**
 * Definicion de una lista simple
 * @autor: Noemi Mata Ruiz
 * @Fecha: 15 de Octubre 2026
 */

public class ListasSimple {
    private Nodo cabeza;

    public ListasSimple() {
        this.cabeza = null;
    }

    // Insertar al inicio usando los setters/getters
    public void insertarAlInicio(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.setSig(cabeza); // Equivale a: nuevo.sig = cabeza;
        cabeza = nuevo;
    }

    // Recorrer usando getDato() y getSig()
    public void recorrer() {
        Nodo actual = cabeza;

	if (cabeza == null){
		System.out.println("Lista Vacia");
		return;
	}

        while (actual != null) {
            System.out.println(actual.getDato()); // Acceso privado mediante método
            actual = actual.getSig();             // Acceso privado mediante método
        }
    }
}