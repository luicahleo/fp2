/*
 *  @(#)Practica5Ejercicio06.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


/**
 * Descripcion: Programa que usa los metodos toUpperCase y toLowerCase.
 *
 * version 1.0 Mayo 2011
 * Fundamentos de Programacion II
 */
package fp2.poo.practica5;

public class Practica5Ejercicio06 {
    public static void main (String args[]){
        String s = "Fundamentos de Programacion II.";
		
        System.out.println("Original: "+s);

        String upper = s.toUpperCase();
        String lower = s.toLowerCase();

        System.out.println("Mayusculas: "+ upper);
        System.out.println("Minusculas: "+ lower);
    }
}

