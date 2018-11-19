/*
 *  @(#)Practica5Ejercicio04.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


/**
 * Descripcion: Programa que compara dos cadenas.
 *
 * version 1.0 Mayo 2011
 * Fundamentos de Programacion II
 */
package fp2.poo.practica5;

public class Practica5Ejercicio04 {
    public static void main (String args[]){
        String s1 = "Hola";
        String s2 = "Hola";
        String s3 = "Adios";
        String s4 = "HOLA";

        System.out.println(s1+" equals " + s2 + "->" + s1.equals(s2));
        System.out.println(s1+" equals " + s3 + "->" + s1.equals(s3));
        System.out.println(s1+" equals " + s4 + "->" + s1.equals(s4));
        System.out.println(s1+" equalsIgnoreCase " + 
                           s4 + "->" + s1.equalsIgnoreCase(s4));
    }
}

