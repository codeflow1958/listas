# Proyecto: Listas Enlazadas en Java

Este proyecto contiene la implementación de una lista enlazada simple en Java, junto con la solución de varios ejercicios que involucran la manipulación de listas enlazadas. Las soluciones se han implementado en las clases `Lista.java` y `Principal.java`.

## Clase `Lista.java`

La clase `Lista.java` implementa una lista enlazada simple con las siguientes funcionalidades:

- **Inserción:** Permite insertar nodos al inicio de la lista (`insertarCabezaLista`) y después de un nodo dado (`insertarLista`).
- **Eliminación:** Permite eliminar nodos que contienen un valor dado (`eliminar`).
- **Búsqueda:** Permite buscar nodos que contienen un valor dado (`buscarLista`).
- **Visualización:** Permite imprimir los valores de la lista en la consola (`visualizar`).
- **Inversión:** Permite invertir el orden de los nodos en la lista (`invertirLista`).
- **Obtención de elemento desde el final:** Permite obtener el valor del nodo que está en la posición _n_ desde el final (`obtenerElementoDesdeFinal`).
- **Eliminación de duplicados:** Permite eliminar los nodos duplicados de la lista (`eliminarDuplicados`).
- **Obtención del tamaño:** Permite obtener el número de nodos en la lista (`obtenerTamano`).
- **Ordenamiento:** Permite ordenar la lista de forma ascendente (`ordenarListaAscendente`).
- **Unión:** Permite unir dos listas enlazadas en una nueva lista (`unirListas`).
- **Separación de pares e impares:** Permite separar los números pares e impares en dos listas diferentes (`separarParesImpares`).

## Clase `Principal.java`

La clase `Principal.java` contiene el método `main` para probar la clase `Lista.java`. El método `main` realiza las siguientes operaciones:

1.  Crea una lista enlazada y le inserta algunos valores.
2.  Imprime la lista original.
3.  Imprime el primer nodo de la lista.
4.  Elimina un nodo de la lista y la imprime.
5.  Busca un nodo en la lista y lo imprime.
6.  Inserta un nuevo nodo después de un nodo dado y la imprime.
7.  Ordena la lista de forma ascendente y la imprime.
8.  Crea una segunda lista enlazada, la imprime, y la une con la primera lista.
9.  Separa los números pares e impares de la lista unida en dos listas diferentes y las imprime.

## Estructura del Proyecto
