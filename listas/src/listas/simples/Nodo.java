package listas.simples;

/**
*Elemento nodo de una lista siple
*@autor: Noemi Mata Ruiz
*@Fecha: 15 de Octubre 2026
*/

public class Nodo {
    // Atributos privados como lo pide tu profesor
    private int dato;
    private Nodo sig; // o siguiente, según prefieras

    // Constructor
    public Nodo(int dato) {
        this.dato = dato;
        this.sig = null;
    }

    // --- MÉTODOS GETTERS Y SETTERS ---

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}