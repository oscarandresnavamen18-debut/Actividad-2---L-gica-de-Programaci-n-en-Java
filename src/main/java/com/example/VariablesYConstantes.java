package com.example;

public class VariablesYConstantes {

 public static void main(String[] args) {
    demostrarConstantes();
    demostrarConvencionesNombres();
    demostrarDeclaracionAsignacion();

 }
 public static void demostrarConvencionesNombres(){
    int numeroEntero = 10;
    double numeroDecimal = 3.14;
    String texto = "Hola, mundo!";
    boolean esVerdadero = true;

    System.out.println("Número entero: " + numeroEntero);
    System.out.println("Número decimal: " + numeroDecimal);
    System.out.println("Texto: " + texto);
    System.out.println("Es verdadero: " + esVerdadero);
 }

 public static void demostrarConstantes(){
    final double PI = 3.14159;
    final String NOMBRE_DEL_PROGRAMA = "Mi Programa Java";

    System.out.println("Valor de PI: " + PI);
    System.out.println("Nombre del programa: " + NOMBRE_DEL_PROGRAMA);
 }
 public static void demostrarDeclaracionAsignacion(){
    int edad = 25; // Declaración y asignación en una sola línea
    String nombre = "Juan";
    boolean esMayorDeEdad = true;
    char letra = 'A';
    
    System.out.println("su edad es de " + edad + " años");
        System.out.println("su nombre es " + nombre);
        System.out.println("¿Es mayor de edad? " + esMayorDeEdad);
        System.out.println("La letra es: " + letra);
 }
}
