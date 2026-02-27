# 🚀 Programa Multi-Ejercicios en Java

![Java](https://img.shields.io/badge/Java-JDK%208%2B-orange)
![Estado](https://img.shields.io/badge/Estado-Completo-brightgreen)
![Licencia](https://img.shields.io/badge/Licencia-Acad%C3%A9mica-blue)

---

## 📋 Tabla de Contenidos

* [📌 Descripción](#-descripción)
* [🎯 Objetivos](#-objetivos)
* [🧩 Funcionalidades](#-funcionalidades)
* [🏗️ Estructura del Proyecto](#️-estructura-del-proyecto)
* [⚙️ Requisitos](#️-requisitos)
* [▶️ Compilación y Ejecución](#️-compilación-y-ejecución)
* [🛡️ Validaciones Implementadas](#️-validaciones-implementadas)
* [🔄 Paso por Referencia en Java](#-paso-por-referencia-en-java)
* [🧹 Buenas Prácticas Aplicadas](#-buenas-prácticas-aplicadas)
* [👨‍💻 Autor](#-autor)
* [📄 Licencia](#-licencia)

---

## 📌 Descripción

Aplicación de consola desarrollada en **Java** que integra múltiples ejercicios dentro de un solo programa mediante un menú interactivo.

El proyecto demuestra el uso correcto de:

* Modularización
* Estructuras de control
* Validación de datos
* Manejo de ciclos
* Buenas prácticas de programación

El programa permanece en ejecución hasta que el usuario decide salir.

---

## 🎯 Objetivos

✔ Aplicar modularización mediante métodos
✔ Implementar validación de entradas con try-catch
✔ Utilizar ciclos `while`, `do-while` y `for`
✔ Manejar parámetros correctamente
✔ Simular paso por referencia en Java
✔ Mantener código limpio y ordenado

---

## 🧩 Funcionalidades

El menú principal incluye:

| #  | Ejercicio                    |
| -- | ---------------------------- |
| 1  | 🧮 Calculadora básica        |
| 2  | 🔐 Validación de contraseña  |
| 3  | 🔢 Número primo              |
| 4  | ➕ Suma de números pares      |
| 5  | 🌡 Conversión de temperatura |
| 6  | 🔤 Contador de vocales       |
| 7  | 🧮 Factorial                 |
| 8  | 🎯 Juego de adivinanza       |
| 9  | 🔄 Intercambio de valores    |
| 10 | 📊 Tabla de multiplicar      |

---

## 🏗️ Estructura del Proyecto

```text
ProgramaMultiEjercicios.java
```

### Componentes clave

* Menú principal con `do-while`
* Métodos independientes por ejercicio
* Métodos utilitarios para lectura segura
* Clase interna `Numero`
* Uso de `Random` para el juego

---

## ⚙️ Requisitos

* Java JDK 8 o superior
* Terminal compatible con UTF-8
* Git (opcional para control de versiones)

---

## ▶️ Compilación y Ejecución

### 🔹 Compilar

```bash
javac -encoding UTF-8 ProgramaMultiEjercicios.java
```

### 🔹 Ejecutar

```bash
java ProgramaMultiEjercicios
```

---

## 🛡️ Validaciones Implementadas

El programa incluye:

* ✅ Manejo de errores con `try-catch`
* ✅ Prevención de división entre cero
* ✅ Validación de números negativos en factorial
* ✅ Control de entradas no numéricas
* ✅ Repetición hasta datos válidos
* ✅ Control de contraseña con `do-while`

---

## 🔄 Paso por Referencia en Java

Java trabaja por valor.
Para simular paso por referencia se implementa la clase:

```java
static class Numero {
    int valor;
}
```

Esto permite intercambiar valores entre objetos correctamente.

---

## 🧹 Buenas Prácticas Aplicadas

* ✔ camelCase en variables y métodos
* ✔ PascalCase en clases
* ✔ Indentación consistente (4 espacios)
* ✔ Métodos con responsabilidad única
* ✔ Nombres descriptivos
* ✔ Código reutilizable
* ✔ Validación robusta de entradas

---

## 👨‍💻 Autor

**Daniel Méndez**

Proyecto desarrollado con fines académicos.

---

## 📄 Licencia

Uso educativo.
Puedes modificar y reutilizar el código para aprendizaje.

---

⭐ *Si este proyecto te fue útil, considera darle una estrella en GitHub.*
