package umg.edu.progra.listas;

/**
 * Esta clase contiene el método main para probar la clase Lista.
 *
 * @author Walter Cordova
 */
public class Principal {

    public static void main(String[] args) {

        Lista lista = new Lista(); // Crea una nueva lista
        // Inserta algunos valores en la lista
        lista.insertarCabezaLista(1);
        lista.insertarCabezaLista(2);
        lista.insertarCabezaLista(3);
        lista.insertarCabezaLista(4);
        lista.insertarCabezaLista(5);
        lista.insertarCabezaLista(6);

        System.out.print("Lista original: ");
        lista.visualizar(); // Imprime la lista original

        System.out.println("\n");
        System.out.println("Primero: " + lista.leerPrimero()); // Imprime el primer nodo

        lista.eliminar(3); // Elimina el nodo con valor 3
        System.out.println("Lista después de eliminar 3: " + lista); // Imprime la lista modificada

        System.out.println("\n");

        Nodo dato = lista.buscarLista(4); // Busca el nodo con valor 4
        System.out.println("Dato encontrado (4): " + dato); // Imprime el nodo encontrado

        lista.insertarLista(dato, 10); // Inserta el valor 10 después del nodo encontrado
        System.out.println("Lista después de insertar 10 después de 4: " + lista); // Imprime la lista modificada

        dato = lista.buscarLista(5); // Busca el nodo con valor 5
        System.out.println("Dato encontrado (5): " + dato); // Imprime el nodo encontrado
        lista.insertarLista(dato, 600); // Inserta el valor 600 después del nodo encontrado

        System.out.println("Lista después de insertar 600 después de 5: " + lista); // Imprime la lista modificada

        System.out.print("Lista final: ");
        lista.visualizar(); // Imprime la lista final

        System.out.println("\n");

        /**
         * Resolver lo que se solicita a continuación
         * Ejercicio 1: Ordenar la lista de forma ascendente
         * Ejercicio 2: Unir dos listas enlazadas
         * Ejercicio 3: Separa números pares e impares en dos listas enlazadas
         */

        // Ejercicio 1: Ordenar la lista de forma ascendente
        lista.ordenarListaAscendente(); // Llama al método para ordenar la lista
        System.out.print("Lista ordenada: ");
        lista.visualizar(); // Imprime la lista ordenada
        System.out.println("\n");

        // Ejercicio 2: Unir dos listas enlazadas
        Lista lista2 = new Lista(); // Crea una segunda lista
        lista2.insertarCabezaLista(100); // Inserta valores en la segunda lista
        lista2.insertarCabezaLista(200);
        lista2.insertarCabezaLista(300);
        System.out.print("Lista 2: ");
        lista2.visualizar(); // Imprime la segunda lista
        System.out.println("\n");

        Lista listaUnida = lista.unirListas(lista2); // Une las dos listas
        System.out.print("Lista unida: ");
        listaUnida.visualizar(); // Imprime la lista unida
        System.out.println("\n");

        // Ejercicio 3: Separar números pares e impares
        Lista listaPares = new Lista(); // Crea una lista para números pares
        Lista listaImpares = new Lista(); // Crea una lista para números impares
        listaUnida.separarParesImpares(listaPares, listaImpares); // Separa los números

        System.out.print("Lista de pares: ");
        listaPares.visualizar(); // Imprime la lista de pares
        System.out.println("\n");

        System.out.print("Lista de impares: ");
        listaImpares.visualizar(); // Imprime la lista de impares
        System.out.println("\n");
    }
}