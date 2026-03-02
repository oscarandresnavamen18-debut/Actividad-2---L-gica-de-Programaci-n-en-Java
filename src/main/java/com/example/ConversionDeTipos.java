package com.example;

public class ConversionDeTipos {


    public static void main(String[] args) {
    demostrarCastingImplicito();
    demostrarCastingExplicito();
    demostrarProblemasDePrecision();

    }

    public static void demostrarCastingImplicito(){
        int numeroEntero =100;
        double numeroDecimal = numeroEntero;


        System.out.println("Valor de numeroEntero: " + numeroEntero);
        System.out.println("Valor de numeroDecimal: " + numeroDecimal);
    }
    public static void demostrarCastingExplicito(){
        double numeroDecimal = 3.999;
        int numeroEntero = (int) numeroDecimal;
    
        System.out.println("Valor de numeroDecimal: " + numeroDecimal);
        System.out.println("Valor de numeroEntero: " + numeroEntero);
    }
    public static void demostrarProblemasDePrecision(){
        double numeroDecimal = 0.6 +0.2;


        System.out.println("Valor de numeroDecimal: " + numeroDecimal);
    }
}