package com.example;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("------Variables y constantes------");
        VariablesYConstantes.demostrarConvencionesNombres();
        VariablesYConstantes.demostrarConstantes();
        VariablesYConstantes.demostrarDeclaracionAsignacion();  

        System.out.println("------Tipos de datos primitivos------");

        TiposDeDatosPrimitivos.demostrarBooleanos();
        TiposDeDatosPrimitivos.demostrarFlotantes();
        TiposDeDatosPrimitivos.demostrarCaracteres();       
        TiposDeDatosPrimitivos.demostrarBooleanos();
        TiposDeDatosPrimitivos.demostrarValoresPorDefecto();



        System.out.println("------Conversion de tipos------");
        ConversionDeTipos.demostrarCastingImplicito();
        ConversionDeTipos.demostrarCastingExplicito();
        ConversionDeTipos.demostrarProblemasDePrecision();



        System.out.println("------Operadores------");
        Operadores.demostrarAritmeticos();
        Operadores.demostrarIncrementoDecremento();
        Operadores.demostrarRelacionales();
        Operadores.demostrarLogicos();
        Operadores.demostrarAsignacionCompuesta();
        Operadores.demostrarOperadoresTernarios();


        System.out.println("------Entrada de Datos------");
        EntradaDeDatos.leerVariosTipos();
        EntradaDeDatos.manejarSaltoDeLineaPendiente();


        System.out.println("------Estructura de Condicionales------");
        EstructurasCondicionales.ejemploIf(); 
        EstructurasCondicionales.ejemploIfElse();
        EstructurasCondicionales.ejemploElseIfElse();   
        EstructurasCondicionales.ejemploSwitch();
        EstructurasCondicionales.ejemploSwitchExpression();
         
        System.out.println("------Estructura de Repetición------");
        EstructurasDeRepeticion.ejemploWhile();
        EstructurasDeRepeticion.ejemploDoWhile();
        EstructurasDeRepeticion.ejemploForClasico();
        EstructurasDeRepeticion.ejemploForAnidado();
        EstructurasDeRepeticion.ejemploBreakContinue();
        //EstructurasDeRepeticion.ejemploEtiquetas();



        System.out.println("------metodos estaticos simples ------");
        MetodosEstaticosSimples. ejemploDeclaracionLlamada();
         MetodosEstaticosSimples.ejemploPasoParametros(5,2);
        MetodosEstaticosSimples.ejemploValorRetorno("Oscar Navarro");
        MetodosEstaticosSimples.ejemploSobrecarga(10,5);

    }


    
}