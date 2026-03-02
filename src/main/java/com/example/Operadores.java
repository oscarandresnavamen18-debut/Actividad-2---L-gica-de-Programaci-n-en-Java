package com.example;

public class Operadores {
    public static void main(String[] args) {
        demostrarAritmeticos();
        demostrarIncrementoDecremento();
        demostrarRelacionales();
        demostrarLogicos();
        demostrarAsignacionCompuesta();
        demostrarOperadoresTernarios();
    }

    public static void demostrarAritmeticos(){
        int num1 = 10;
        int num2 = 4; 
        int suma = num1 + num2; 
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = (double) num1 / num2;
        int modulo = num1 % num2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);
    }
    public static void demostrarIncrementoDecremento(){
        int numero = 5;
        System.out.println("Valor inicial: " + numero);
        numero++; 
        System.out.println("Después del incremento: " + numero);
        numero--; 
        System.out.println("Después del decremento: " + numero);
    }

    public static void demostrarRelacionales(){
        int a = 10;
        int b = 20;

        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

    }
    public static void demostrarLogicos(){
        boolean valor1 = true;
        boolean valor2 = false;

        System.out.println("valor1 && valor2: " + (valor1 && valor2));
        System.out.println("valor1 || valor2: " + (valor1 || valor2));
        System.out.println("!valor1: " + (!valor1));
        System.out.println("!valor2: " + (!valor2));
    }
    public static void demostrarAsignacionCompuesta(){
        int numero = 10;
        System.out.println("Valor inicial: " + numero);
        numero += 5; 
        System.out.println("Después de += 5: " + numero);
        numero -= 3; 
        System.out.println("Después de -= 3: " + numero);
        numero *= 2; 
        System.out.println("Después de *= 2: " + numero);
        numero /= 4; 
        System.out.println("Después de /= 4: " + numero);
        numero %= 3; 
        System.out.println("Después de %= 3: " + numero);
    }
    public static void demostrarOperadoresTernarios(){
        int numero = 10;
        String resultado = (numero % 2 == 0) ? "Número par" : "Número impar";
        System.out.println("El número " + numero + " es: " + resultado);
    }
}
