/*
 *  @(#)Practica5Ejercicio08.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


/**
 * Descripcion: Programa que crea e inicia varios enteros de distintas formas.
 *
 * version 1.0 Mayo 2011
 * Fundamentos de Programacion II
 */
package fp2.poo.practica5;

class Practica5Ejercicio08 {
    public static void main (String args[]) {
        String s            = "22";
        int    j            = 0;
        int    i            = 0;   
        int    resultado    = 0;
        /* 
         * Usa el constructor con un parametro de tipo String
         */
        Integer miEntero    = new Integer(s);  
        Integer miResultado = null;

        System.out.println("el valor del entero "+ miEntero);
        /* 
         * Usa el metodo intValue() para obtener el tipo simple
         */
        j = miEntero.intValue();

        /* 
         * Usa el metodo estatico de Integer para obtener un entero (int)
         * a partir de un objeto de tipo String.
         */
        i = Integer.parseInt(s);
        resultado = i + j;        
        System.out.println("i + j = " + resultado);

        /* 
         * Usa el constructor con un parametro de tipo int
         */
        miResultado = new Integer(resultado);
        System.out.println("el valor del resultado es "+ miResultado );
    }
}

