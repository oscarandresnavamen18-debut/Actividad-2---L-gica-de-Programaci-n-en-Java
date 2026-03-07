package com.example;

import java.util.Scanner;

public class EntradaDeDatos {

    // Usamos un único Scanner estático para evitar cerrar System.in varias veces
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        leerVariosTipos();
        manejarSaltoDeLineaPendiente();
        // opcionalmente cerrar scanner si ya no se usa más
        // scanner.close();
    }

    public static void leerVariosTipos() {
        try {
            System.out.println("Ingresa un número entero:");
            int numeroEntero = scanner.hasNextInt() ? scanner.nextInt() : 0;
            if (!scanner.hasNextInt()) {
                System.out.println("(entrada no válida o ausente, se usará 0)");
                scanner.nextLine(); // descartar si había texto
            }

            System.out.println("Ingresa un número decimal (usa '.' o ','): ");
            // leemos como cadena para soportar coma en locales hispanos
            String decimalInput = scanner.hasNext() ? scanner.next() : "0";
            decimalInput = decimalInput.replace(',', '.');
            double numeroDecimal;
            try {
                numeroDecimal = Double.parseDouble(decimalInput);
            } catch (NumberFormatException e) {
                System.out.println("Formato inválido, se usará 0.0");
                numeroDecimal = 0.0;
            }

            System.out.println("Ingresa un texto:");
            String palabra = scanner.hasNext() ? scanner.next() : "";

            // consumir el salto de línea pendiente antes de leer la siguiente línea
            scanner.nextLine();

            System.out.println("Ingresa una línea de texto:");
            String lineaTexto = scanner.hasNextLine() ? scanner.nextLine() : "";

            System.out.println("numero entero: " + numeroEntero);
            System.out.println("numero decimal: " + numeroDecimal);
            System.out.println("palabra: " + palabra);
            System.out.println("linea de texto: " + lineaTexto);
        } catch (Exception ex) {
            System.out.println("Entrada interrumpida o no disponible: " + ex.getClass().getSimpleName());
        }
    }

    public static void manejarSaltoDeLineaPendiente() {
        try {
            System.out.println("Ingresa un número entero:");
            int numeroEntero = scanner.hasNextInt() ? scanner.nextInt() : 0;
            if (!scanner.hasNextInt()) {
                System.out.println("(entrada no válida o ausente, se usará 0)");
                scanner.nextLine();
            }

            scanner.nextLine();

            System.out.println("Ingresa una línea de texto:");
            String lineaTexto = scanner.hasNextLine() ? scanner.nextLine() : "";

            System.out.println("numero entero: " + numeroEntero);
            System.out.println("linea de texto: " + lineaTexto);
        } catch (Exception ex) {
            System.out.println("Entrada interrumpida o no disponible: " + ex.getClass().getSimpleName());
        }
    }
}

