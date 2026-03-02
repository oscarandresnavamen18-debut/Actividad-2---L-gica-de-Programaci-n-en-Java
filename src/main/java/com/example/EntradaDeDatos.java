package com.example;

import java.util.Scanner;

public class EntradaDeDatos {

public static void main(String[] args) {
    leerVariosTipos();
    manejarSaltoDeLineaPendiente();


}
 public static void leerVariosTipos(){
   try( Scanner scanner = new Scanner(System.in)){


    System.out.println("Ingresa un número entero:");
    int numeroEntero = scanner.nextInt();

    System.out.println("Ingresa un número decimal:");
    double numeroDecimal = scanner.nextDouble();


    System.out.println("Ingresa un texto:");
    String palabra = scanner.next(); 


    scanner.nextLine();


    System.out.println("Ingresa una línea de texto:");
    String lineaTexto = scanner.nextLine();


    System.out.println("numero entero: " + numeroEntero);
    System.out.println("numero decimal: " + numeroDecimal);
    System.out.println("palabra: " + palabra);
    System.out.println("linea de texto: " + lineaTexto);    
 }
}

public static void manejarSaltoDeLineaPendiente(){
    try(Scanner scanner = new Scanner(System.in)){
        System.out.println("Ingresa un número entero:");
        int numeroEntero = scanner.nextInt();

        scanner.nextLine(); 

        System.out.println("Ingresa una línea de texto:");
        String lineaTexto = scanner.nextLine();

        System.out.println("numero entero: " + numeroEntero);
        System.out.println("linea de texto: " + lineaTexto);    
    }
}
}
