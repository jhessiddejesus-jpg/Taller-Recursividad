# Taller de Recursividad - Estructura de Datos

**Nombre:** Jhessid Santiago de Jesús Ruiz

---

## Descripción del Taller

Este proyecto contiene una colección de algoritmos y programas desarrollados en Java, diseñados para comprender, implementar y dominar el concepto de "recursividad". Cada ejercicio aborda un problema clásico computacional o matemático resolviéndolo mediante la división del problema en subproblemas más simples, identificando claramente el caso basey el paso recursivo.

## Estructura del Repositorio

```text
Taller-Recursividad/
│
├── src/
│   └── Recursividad/
│       ├── FuncAckerman.java
│       ├── FuncCociente.java
│       ├── FuncCopiarCadena.java
│       ├── FuncFactorial.java
│       ├── FuncFibonacci.java
│       ├── FuncInvertirNum.java
│       ├── FuncMCD.java
│       ├── FuncPotencia.java
│       ├── FuncSumaArreglo.java
│       ├── FuncSumaConsecutiva.java
│       ├── FuncSumaDigitos.java
│       ├── FuncSumaNumMatriz.java
│       ├── FuncSumaSucesiva.java
│       └── FuncSumatoria.java
│
├── .gitignore
├── LICENSE
└── README.md
```

---

## Requisitos Previos

- **Java Development Kit (JDK):** Versión 11 o superior recomendada (compatible con JDK 17 o JDK 21).
- Para verificar que Java está instalado correctamente en su sistema, ejecute en la terminal:
  ```bash
  java -version
  javac -version
  ```
- **Git** (opcional, para clonar y gestionar el repositorio).

---

## Instrucciones para Ejecutar el Programa

Cada ejercicio cuenta con su propio método `main`, lo que permite ejecutarlos de manera independiente interactuando por consola.

Abra una terminal en la carpeta raíz del proyecto (`Taller-Recursividad`).

### Método 1: Compilación en carpeta `bin` y ejecución 

1. **Compilar todos los archivos Java:**
   ```bash
   javac -d bin src/Recursividad/*.java
   ```
   Esto generará los archivos `.class` compilados dentro de la carpeta `bin/`.

2. **Ejecutar el ejercicio deseado:**
   Indique la clase que desea ejecutar con el comando `java -cp bin <NombreDeLaClase>`.

   Ejemplos:
   - Para ejecutar el cálculo de factorial:
     ```bash
     java -cp bin FuncFactorial
     ```
   - Para ejecutar la serie de Fibonacci:
     ```bash
     java -cp bin FuncFibonacci
     ```
   - Para ejecutar la función de Ackermann:
     ```bash
     java -cp bin FuncAckerman
     ```
   - Para ejecutar la suma de elementos en una matriz:
     ```bash
     java -cp bin FuncSumaNumMatriz
     ```

---

### Método 2: Ejecución directa sin compilar previamente (Java 11+)

Las versiones modernas de Java permiten ejecutar archivos fuente `.java` directamente:

```bash
java src/Recursividad/FuncFactorial.java
```
Puede reemplazar `FuncFactorial.java` por el nombre de cualquier otro archivo en la carpeta `src/Recursividad/`

---

### Método 3: Ejecución desde un Entorno de Desarrollo (IDE)

Si utiliza un IDE como **Visual Studio Code**, **IntelliJ IDEA**, **Eclipse** o **NetBeans**:

1. Abra la carpeta del proyecto en su IDE.
2. Navegue en el explorador de archivos a `src/Recursividad/`.
3. Abra el archivo del ejercicio que desea probar.
4. Presione el botón **Run** (o clic derecho > **Run 'NombreClase.main()'**).
5. Ingrese los datos solicitados en la consola integrada.
