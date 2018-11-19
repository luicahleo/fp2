/*
 *  @(#)Practica5Ejercicio09.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

/**
 * Descripcion: .
 *
 * version 1.0 Mayo 2011
 * Fundamentos de Programacion II
 */
package fp2.poo.practica5;

public class Practica5Ejercicio09 {
    public static void main ( String args[] ) {
        Double double1  = null;
        Double double2  = null;
        Double double3  = null;
        Double double4  = null;
        Double double5  = null;
        double d1       = 3.3d;
        double d2       = 0.0d;
        /*
         * Constructor con un tipo double
         */
        double1 = new Double(2.2);
        System.out.println("double1 = new Double (2.2):\t\t" + double1);

        /*
         * Constructor con un tipo double
         */
        double2  = new Double(d1);
        System.out.println("double2  = new Double(d1): \t\t" + double2);

        /*
         * Constructor con un tipo double
         */
        double3  = new Double("10.14d");
        System.out.println("double3  = new Double(\"10.14d\"): \t" + double3);

        /* 
         * Usa el metodo doubleValue() para obtener el tipo simple
         */
        d1 = double3.doubleValue();
        System.out.println("d1 = double3.doubleValue() :  \t\t" + d1  );

        /*
         * Usa el metodo estatico valueOf() para obtener un objeto del tipo Double
         * a partir de una cadena.
         */
        double4  = Double.valueOf("10.14d");
        System.out.println("double4  = Double.valueOf(\"10.14d\"): \t" + double4  );

        /*
         * Usa el metodo estatico parseDouble() para obtener 
         * un objeto del tipo Double
         * a partir de una cadena.
         */
        d2  =Double.parseDouble( "10.14d" );
        System.out.println("d2 = Double.parseDouble(\"10.14d\"):  \t" + d2 );
    }
}

