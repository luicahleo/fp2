/*
 *  @(#)Practica4Ejercicio10.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


/**
 * Descripcion: Declaracion de metodo incorrecta.
 *              
 *
 * version 1.0 Mayo 2011
 * Fundamentos de Programacion II
 */
 
package fp2.poo.practica4;


class Practica4Ejercicio10 {
    static void metodoDemo () throws IllegalAccessException{
        System.out.println( "Dentro de metodoDemo " );
        throw new IllegalAccessException( "metodoDemo " );
    }

    public static void main ( String args[] ){
	try{
        	metodoDemo ();
	}catch(IllegalAccessException e){
                System.out.println("Captura: " + e);
	}
    }
}

