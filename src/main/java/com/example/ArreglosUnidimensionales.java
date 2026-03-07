package com.example;

public class ArreglosUnidimensionales {

    public static void main(String[] args) {
        
    }

    public static void declararCrearInicializar(){
        int [] numeros = new int [5];
        String [] nombres = {"Alice", "Bob", "Charlie", "David", "Eve"};
        double [] precios = new double [5];
        numeros[0] = 1;
        numeros[1] = 2; 
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        // la posición 5 no existe, el arreglo tiene longitud 5 (índices 0-4)


        

        precios[0] = 19.99;
        precios[1] = 29.99;
        precios[2] = 39.99;
        precios[3] = 49.99;
        precios[4] = 59.99;


        System.out.println("Primer número: " + numeros[0]);
        System.out.println("Segundo número: " + numeros[1]);
        System.out.println("Tercer número: " + numeros[2]);
        System.out.println("Cuarto número: " + numeros[3]);
        System.out.println("Quinto número: " + numeros[4]);
       


        System.out.println("Primer nombre: " + nombres[0]);
        System.out.println("Segundo nombre: " + nombres[1]);
        System.out.println("Tercer nombre: " + nombres[2]);
        System.out.println("Cuarto nombre: " + nombres[3]);
        System.out.println("Quinto nombre: " + nombres[4]);
        // no hay sexto elemento en este arreglo
        

        System.out.println("Primer precio: " + precios[0]);
        System.out.println("Segundo precio: " + precios[1]);
        System.out.println("Tercer precio: " + precios[2]);
        System.out.println("Cuarto precio: " + precios[3]);
        System.out.println("Quinto precio: " + precios[4]);


    }
    public static void mostrarLongitud(){
        int [] numeros = {1, 2, 3, 4, 5};
        String [] nombres = {"Alice", "Bob", "Charlie", "David", "Eve"};
        double [] precios = {19.99, 29.99, 39.99, 49.99, 59.99};

        System.out.println("Longitud del arreglo de números: " + numeros.length);
        System.out.println("Longitud del arreglo de nombres: " + nombres.length);
        System.out.println("Longitud del arreglo de precios: " + precios.length);
    }
    public static void recorrerConForClasico(){
        int [] numeros = {1, 2, 3, 4, 5};
        String [] nombres = {"Alice", "Bob", "Charlie", "David", "Eve"};
        double [] precios = {19.99, 29.99, 39.99, 49.99, 59.99};

        System.out.println("Recorriendo arreglo de números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("Recorriendo arreglo de nombres:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        System.out.println("Recorriendo arreglo de precios:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println(precios[i]);
        }

    }

    public static void recorrerConForEach(){
        int numeros [] = {1, 2, 3, 4, 5};
        for (int numero : numeros) {
            System.out.println("Número: " + numero);
    }
}

    public static void arrayComoParametroYRetorno(){
        
    }
}
