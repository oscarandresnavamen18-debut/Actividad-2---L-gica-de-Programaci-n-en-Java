package com.example;

public class TiposDeDatosPrimitivos {

    public static void main(String[] args) {
        demostrarEnteros();
        demostrarFlotantes();
        demostrarCaracteres();
        demostrarBooleanos();
        demostrarValoresPorDefecto();
    }

        public static void demostrarEnteros(){
            byte numeroByte = 127;
            short numeroshort = 32767;
            int numeroInt = 2147483647;
            long numeroLong = 9223372036854775807L;


            System.out.println("Valor máximo de byte: " + numeroByte);
            System.out.println("Valor máximo de short: " + numeroshort);
            System.out.println("Valor máximo de int: " + numeroInt);
            System.out.println("Valor máximo de long: " + numeroLong);
        }
        public static void demostrarFlotantes(){
            float numeroFloat = 3.14f;
            double numeroDouble = 3.141592653589793;

            System.out.println("Valor de float: " + numeroFloat);
            System.out.println("Valor de double: " + numeroDouble);
        }
        public static void demostrarCaracteres(){
            char letra = 'A';
            char simbolo = '@';
            char espacio = ' ';
            char numero = '1';
            char caracterEspecial = '#';
            

            System.out.println("Letra: " + letra);
            System.out.println("Simbolo: " + simbolo);
            System.out.println("Espacio: " + espacio);
            System.out.println("Numero: " + numero);
            System.out.println("Caracter especial: " + caracterEspecial);
        }
        public static void demostrarBooleanos(){
            boolean esVerdadero = true;
            boolean esFalso = false;

            System.out.println("Valor de esVerdadero: " + esVerdadero);
            System.out.println("Valor de esFalso: " + esFalso);
        }
        public static void demostrarValoresPorDefecto(){
            int valorIntPorDefecto = 0;
            double ValorDoublePorDefecto = 0.0;
            char valorCharPorDefecto = '\u0000';
            boolean valorBooleanoPorDefecto = false;



            System.out.println("Valor por defecto de int: " + valorIntPorDefecto);
            System.out.println("Valor por defecto de double: " + ValorDoublePorDefecto);
            System.out.println("Valor por defecto de char: " + valorCharPorDefecto);
            System.out.println("Valor por defecto de boolean: " + valorBooleanoPorDefecto);
        }
}
