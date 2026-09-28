# Tree-Stock

## Sistema de Inventario mediante Árbol Binario de Búsqueda

### Objetivo

Desarrollar una aplicación de consola en Java que permita gestionar un inventario mediante un árbol binario de búsqueda.

El sistema permite registrar productos, mostrar el inventario ordenado por ID y buscar productos mediante su identificador.

## Estructura del proyecto

El proyecto está dividido en tres clases:

### Producto.java

Representa cada nodo del árbol.

Contiene:

- ID del producto.
- Nombre del producto.
- Referencia al nodo izquierdo.
- Referencia al nodo derecho.

### ArbolInventario.java

Contiene la lógica del árbol binario de búsqueda.

Implementa:

- Inserción recursiva.
- Recorrido inorden.
- Búsqueda recursiva por ID.

### Main.java

Contiene la interfaz de consola.

El menú permite:

1. Registrar Producto.
2. Mostrar Inventario.
3. Buscar Producto.
0. Salir.

## Funcionamiento

Los productos se organizan según su ID.

Si el ID del nuevo producto es menor que el nodo actual, se coloca hacia la izquierda.

Si el ID es mayor, se coloca hacia la derecha.

Esto permite realizar búsquedas aprovechando la estructura del árbol.

## Requisitos

- Java JDK.
- Visual Studio Code.
- Git.
- GitHub.

## Ejecución

Abrir una terminal dentro de la carpeta del proyecto.

Compilar:

```bash
javac *.java