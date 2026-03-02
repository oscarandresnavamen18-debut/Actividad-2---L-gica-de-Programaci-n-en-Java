package com.example;

public class EstructurasCondicionales {

    public static void main(String[] args) {
        ejemploIf();
        ejemploIfElse();
        ejemploElseIfElse();
        ejemploSwitch();
        ejemploSwitchExpression();


    }

     public static void ejemploIf(){
        int  numero = 10;
        if(numero > 0){
            System.out.println("El número es positivo.");
        }
     }
     public static void ejemploIfElse(){
        int numero = -10;
        if(numero > 0 ) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es negativo o cero.");
        }
     }
     public static void ejemploElseIfElse(){
        int numero = 0;
        if(numero > 0){
            System.out.println("El número es positivo.");
        } else if (numero < 0){
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
     }
        public static void ejemploSwitch(){
            int diaSemana = 3;
            switch (diaSemana) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miércoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Número de día no válido.");
            }
        }
        public static void ejemploSwitchExpression(){
            int diaSemana = 7;
            String nombreDia = switch(diaSemana){
                case 1 -> "Lunes";
                case 2 -> "Martes";
                case 3 -> "Miércoles";
                case 4 -> "Jueves";
                case 5 -> "Viernes";
                case 6 -> "Sábado";
                case 7 -> "Domingo";
                default -> "Número de día no válido.";
            };
            System.out.println("El día de la semana es: " + nombreDia);
        }
}
