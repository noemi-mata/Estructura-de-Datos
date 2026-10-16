package listas.simples;

/**
 * Definicion de una lista simple
 * @autor: Noemi Mata Ruiz
 * @Fecha: 15 de Octubre 2026
 */

public class Main {
    public static void main(String[] args) {
        // 1. Creamos una instancia de nuestra lista simple
        ListasSimple lista = new ListasSimple();

        System.out.println("--- Insertando elementos al inicio ---");
        
        // 2. Insertamos algunos valores
        lista.insertarAlInicio(30);
        lista.insertarAlInicio(20);
        lista.insertarAlInicio(10);
	lista.insertarAlInicio(5);

        // Al insertar al inicio, el orden final debería ser: 10 -> 20 -> 30
        
        System.out.println("Elementos de la lista:");
        lista.recorrer();
    }
}