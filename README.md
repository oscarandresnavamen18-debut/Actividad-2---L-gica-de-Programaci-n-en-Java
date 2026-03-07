# Actividad 2 - Lógica de Programación en Java

Este repositorio contiene la actividad número 2 del curso de **Lógica de Programación en Java**.
El objetivo principal es practicar el uso de estructuras de datos básicas, operadores, flujos de control y métodos estáticos mediante ejemplos simples.

---

## 📁 Estructura del proyecto

El código fuente está organizado siguiendo la convención estándar de Maven (aunque aquí sólo se emplea para la estructura de carpetas):

```
├── pom.xml
├── README.md
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── example
    │               ├── ArreglosBidimensionales.java
    │               ├── ArreglosUnidimensionales.java
    │               ├── ConversionDeTipos.java
    │               ├── EntradaDeDatos.java
    │               ├── EstructurasCondicionales.java
    │               ├── EstructurasDeRepeticion.java
    │               ├── Main.java             ← Punto de entrada
    │               ├── MetodosEstaticosSimples.java
    │               ├── Operadores.java
    │               ├── TiposDeDatosPrimitivos.java
    │               └── VariablesYConstantes.java
    └── resources
```

> Todos los ejemplos son estáticos y se invocan desde la clase `Main` para facilitar su ejecución.

---

## 🚀 Cómo ejecutar

1. Asegúrate de tener instalado Java (JDK 11 o superior).
2. Desde la carpeta raíz del proyecto puedes compilar los archivos con:
   ```bash
   javac -d target/classes src/main/java/com/example/*.java
   ```
3. Ejecuta la clase principal:
   ```bash
   java -cp target/classes com.example.Main
   ```

> Si no deseas compilar manualmente, también puedes usar un IDE (Eclipse, IntelliJ IDEA, NetBeans) y ejecutar `Main.java` directamente.

---

## ✅ Contenido de la actividad

- Variables y constantes
- Tipos de datos primitivos
- Conversión de tipos
- Operadores aritméticos, lógicos y ternarios
- Entrada de datos desde consola
- Estructuras condicionales (`if`, `switch`, expresiones `switch`)
- Estructuras de repetición (`while`, `do-while`, `for`, `break`, `continue`)
- Métodos estáticos simples y sobrecargas
- Arreglos unidimensionales y bidimensionales

---

## 🛠️ Notas y correcciones

- Se eliminaron llamadas duplicadas en `Main.java`.
- Se añadieron métodos de ejemplo adicionales en `ArreglosUnidimensionales` para evitar errores de compilación.

---

## 👤 Autor

**Oscar Navarro** – Tecnológica ADSO

> Para cualquier duda o mejora, puedes contactarme a través de los canales del curso.

---

¡Gracias por revisar esta actividad! Espero que el código sea una base útil para tus estudios en Java.