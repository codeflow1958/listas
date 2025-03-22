package umg.edu.progra.listas;

/**
 * Esta clase representa una lista enlazada simple de números enteros.
 *
 * @author Walter Cordova
 */
public class Lista {

    private Nodo primero; // El primer nodo de la lista

    @Override
    public String toString() {
        return "=>" + primero; // Representación en cadena de la lista
    }

    /**
     * Constructor para inicializar una lista vacía.
     */
    public Lista() {
        primero = null; // Inicialmente, la lista está vacía
    }

    /**
     * Devuelve el primer nodo de la lista.
     *
     * @return El primer nodo de la lista.
     */
    public Nodo leerPrimero() {
        return primero;
    }

    /**
     * Inserta un nuevo nodo al inicio de la lista.
     *
     * @param entrada El valor entero a insertar.
     */
    public void insertarCabezaLista(int entrada) {
        Nodo nuevo = new Nodo(entrada); // Crea un nuevo nodo
        nuevo.enlace = primero; // El nuevo nodo apunta al antiguo primer nodo
        primero = nuevo; // El nuevo nodo se convierte en el primero
    }

    /**
     * Inserta un nuevo nodo después de un nodo dado.
     *
     * @param anterior El nodo después del cual se insertará el nuevo nodo.
     * @param entrada  El valor entero a insertar.
     */
    public void insertarLista(Nodo anterior, int entrada) {
        Nodo nuevo = new Nodo(entrada); // Crea un nuevo nodo
        nuevo.enlace = anterior.enlace; // El nuevo nodo apunta al siguiente nodo
        anterior.enlace = nuevo; // El nodo anterior apunta al nuevo nodo
    }

    /**
     * Elimina el primer nodo que contiene el valor dado.
     *
     * @param entrada El valor entero a eliminar.
     */
    public void eliminar(int entrada) {
        Nodo actual = primero; // Nodo actual para recorrer la lista
        Nodo anterior = null; // Nodo anterior al actual
        // Bucle para buscar el nodo a eliminar
        while (actual != null && actual.dato != entrada) {
            anterior = actual;
            actual = actual.enlace;
        }
        // Si se encontró el nodo, se elimina
        if (actual != null) {
            if (actual == primero) { // Si es el primer nodo
                primero = actual.enlace;
            } else { // Si es un nodo intermedio
                anterior.enlace = actual.enlace;
            }
        }
    }

    /**
     * Busca un nodo que contenga el valor dado.
     *
     * @param destino El valor entero a buscar.
     * @return El nodo encontrado, o null si no se encuentra.
     */
    public Nodo buscarLista(int destino) {
        Nodo indice = primero; // Nodo para recorrer la lista
        while (indice != null) {
            if (indice.dato == destino) {
                return indice; // Se encontró el nodo
            }
            indice = indice.enlace;
        }
        return null; // No se encontró el nodo
    }

    /**
     * Imprime los valores de la lista en la consola.
     */
    public void visualizar() {
        Nodo n = primero; // Nodo para recorrer la lista
        while (n != null) {
            System.out.print(n.dato + " ");
            n = n.enlace;
        }
    }

    /**
     * Invierte el orden de los nodos en la lista.
     */
    public void invertirLista() {
        Nodo anterior = null;
        Nodo actual = primero;
        Nodo siguiente;
        while (actual != null) {
            siguiente = actual.enlace;
            actual.enlace = anterior;
            anterior = actual;
            actual = siguiente;
        }
        primero = anterior; // El último nodo se convierte en el primero
    }

    /**
     * Obtiene el valor del nodo que está en la posición n desde el final.
     *
     * @param n La posición desde el final.
     * @return El valor del nodo, o null si la posición no es válida.
     */
    public Integer obtenerElementoDesdeFinal(int n) {
        Nodo pPrincipal = primero;
        Nodo pReferencia = primero;
        int contador = 0;
        if (primero == null) {
            return null; // Lista vacía
        }
        while (contador < n) {
            if (pReferencia == null) {
                return null; // n es mayor que la longitud de la lista
            }
            pReferencia = pReferencia.enlace;
            contador++;
        }
        while (pReferencia != null) {
            pPrincipal = pPrincipal.enlace;
            pReferencia = pReferencia.enlace;
        }
        return pPrincipal.dato;
    }

    /**
     * Elimina los nodos duplicados de la lista.
     */
    public void eliminarDuplicados() {
        Nodo actual = primero;
        while (actual != null) {
            Nodo comparador = actual;
            while (comparador.enlace != null) {
                if (comparador.enlace.dato == actual.dato) {
                    comparador.enlace = comparador.enlace.enlace;
                } else {
                    comparador = comparador.enlace;
                }
            }
            actual = actual.enlace;
        }
    }

    /**
     * Obtiene el número de nodos en la lista.
     *
     * @return El tamaño de la lista.
     */
    public int obtenerTamano() {
        int tamano = 0;
        Nodo actual = primero;
        while (actual != null) {
            tamano++;
            actual = actual.enlace;
        }
        return tamano;
    }

    /**
     * Ordena la lista de forma ascendente.
     */
    public void ordenarListaAscendente() {
        Nodo actual = primero;
        while (actual != null) {
            Nodo indice = actual.enlace;
            while (indice != null) {
                if (actual.dato > indice.dato) {
                    int temp = actual.dato;
                    actual.dato = indice.dato;
                    indice.dato = temp;
                }
                indice = indice.enlace;
            }
            actual = actual.enlace;
        }
    }

    /**
     * Une dos listas enlazadas en una nueva lista.
     *
     * @param lista2 La segunda lista a unir.
     * @return La nueva lista unida.
     */
    public Lista unirListas(Lista lista2) {
        Lista listaUnida = new Lista();
        Nodo actual1 = this.primero;
        while (actual1 != null) {
            listaUnida.insertarCabezaLista(actual1.dato);
            actual1 = actual1.enlace;
        }
        Nodo actual2 = lista2.primero;
        while (actual2 != null) {
            listaUnida.insertarCabezaLista(actual2.dato);
            actual2 = actual2.enlace;
        }
        listaUnida.invertirLista();
        return listaUnida;
    }

    /**
     * Separa los números pares e impares en dos listas diferentes.
     *
     * @param listaPares   La lista para almacenar los números pares.