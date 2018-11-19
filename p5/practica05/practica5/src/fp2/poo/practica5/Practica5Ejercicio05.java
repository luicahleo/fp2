/*
 *  @(#)Practica5Ejercicio05.java
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

public class Practica5Ejercicio05 {
    public static void main (String args[]){
        String orig = "Sustituye todas las subcadenas que encuentra";    
        String busca = "as";
        String sub = "XXX";
        String result= "";
        int i=0;
	  	  
        System.out.println(orig);

        do {//sustituye todas las subcadenas que encuentra
            i=orig.indexOf(busca);
            if (i !=-1){
                result = orig.substring(0,i);
                result = result + sub;
                result = result + orig.substring(i+busca.length());
                orig = result;
                System.out.println(orig);
            }
        } while (i != -1);
    }
}

