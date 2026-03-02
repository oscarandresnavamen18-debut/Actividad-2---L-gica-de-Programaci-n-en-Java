package com.example;

public class MetodosEstaticosSimples {

    public static void main(String[]args){
        ejemploDeclaracionLlamada();
        ejemploPasoParametros(5,2);
        ejemploValorRetorno("Oscar Navarro");
        ejemploSobrecarga(10,5);
    }
    public static void ejemploDeclaracionLlamada(){
        System.out.println("¡Hola, Navarro");
       

 
    }

    public static void ejemploPasoParametros(int a, int b){
        int resultado = (a + b);
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public static void ejemploValorRetorno(String nombre){
        String resultado = (nombre);
        System.out.println("El nombre es : " + resultado);
    }

    public static void ejemploSobrecarga(int num1, int num2){
        int resultado = num1 + num2;
        int resultadoResta = num1 - num2;
        int resultadoMultiplicacion = num1 * num2;
        System.out.println("El resultado de la suma es: " + resultado);
        System.out.println("El resultado de la resta es: " + resultadoResta);
        System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);
    }
}
