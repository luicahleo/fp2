/*
 *  @(#)Practica5Ejercicio07.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


/**
 * Descripcion: Programa que usa el metodo equals y el operador ==.
 *
 * version 1.0 Mayo 2011
 * Fundamentos de Programacion II
 */
package fp2.poo.practica5;


public class Practica5Ejercicio07 {
    public static void main (String args[]){
        String s1 = "Hola";
        String s2 = new String (s1);
        System.out.println(s1+" equals " + s2 + "->" + s1.equals(s2));
        System.out.println(s1+" == " + s2 + "->" + (s1==s2));
    }
}
