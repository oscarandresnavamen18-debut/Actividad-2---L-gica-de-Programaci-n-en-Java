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
        // se llamaba a demostrarBooleanos dos veces, se eliminó la duplicada
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
        try {
            EntradaDeDatos.leerVariosTipos();
            EntradaDeDatos.manejarSaltoDeLineaPendiente();
        } catch (Exception e) {
            System.out.println("Error leyendo datos: " + e.getClass().getSimpleName());
        }


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



        System.out.println("------Arreglos unidimensionales------");
        ArreglosUnidimensionales.declararCrearInicializar();
        // los siguientes métodos existen en la clase y muestran recorridos y longitudes
        ArreglosUnidimensionales.mostrarLongitud();
        ArreglosUnidimensionales.recorrerConForClasico();
        ArreglosUnidimensionales.recorrerConForEach();




        System.out.println("------Arreglos bidimensionales------");
        ArreglosBidimensionales.declararCrearMatrices();
        ArreglosBidimensionales.recorrerMatriz();
        ArreglosBidimensionales.ejemploUsosTipicos();




        System.out.println("------Manipulación de cadenas------");
        ManipulacionCadenas.demostrarConcatenacion();
        ManipulacionCadenas.demostrarLongitud();
        ManipulacionCadenas.demostrarSubstring();
        ManipulacionCadenas.demostrarIndexOf();
        ManipulacionCadenas.demostrarReplace();
        ManipulacionCadenas.demostrarMayusculasMinusculas();
        ManipulacionCadenas.demostrarSplit();
        ManipulacionCadenas.demostrarTrim();



        System.out.println("------Manejo básico de excepciones------");
        ManejoBasicoExcepciones.ejemploTryCatchDivicion();
        ManejoBasicoExcepciones.ejemploTryCatchImput();
        ManejoBasicoExcepciones.evitarCierrePrograma();
        ManejoBasicoExcepciones.ejemploBloqueFinally();
    }


    
}