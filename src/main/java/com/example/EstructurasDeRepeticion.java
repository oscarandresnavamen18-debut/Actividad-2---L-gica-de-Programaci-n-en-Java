package com.example;



public class EstructurasDeRepeticion {

    public static void main (String[]arg){
        ejemploWhile();
        ejemploDoWhile();
        ejemploForClasico();
        ejemploForAnidado();
        ejemploBreakContinue();
    }

    public static void ejemploWhile(){
        int contador = 1;
        while (contador <= 5){
            System.out.println("Contador: " + contador);
            contador++;
        }
    }
    public static void ejemploDoWhile(){
        int contador = 1;
        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador <= 5);
    }
    public static void ejemploForClasico(){
        for (int i = 1; i <= 5; i++){
            System.out.println("Contador: " + i);
        }
    }
    public static void ejemploForAnidado(){
        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= 2; j++){
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
    public static void ejemploBreakContinue(){
        for (int i = 1; i <= 10; i++){
            if (i == 5){
                System.out.println("Se encontró el número 5, saliendo del bucle.");
                break;
            }
            if (i % 2 == 0){
                System.out.println("Número par encontrado: " + i + ", saltando a la siguiente iteración.");
                continue;
            }
            System.out.println("Número impar: " + i);
        }
    }
   
      
}
