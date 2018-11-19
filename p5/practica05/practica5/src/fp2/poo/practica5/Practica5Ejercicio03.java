/*
 *  @(#)Practica5Ejercicio03.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


/**
 * Descripcion: Uso del metodo length.
 *
 * version 1.0 Mayo 2011
 * Fundamentos de Programacion II
 */
package fp2.poo.practica5;

public class Practica5Ejercicio03 {
    public static void main(String[] args) {
        String str = null;
        char chars[] = {'F','u','n','d','a','m','e','n','t','s',' ','d','e',' ',
                 'P','r','o','g','r','a','m','a','c','i','o','n', ' ','I','I'};
        try{
            str.length();
            System.out.println("Este codigo nunca se ejecuta");
        } catch (NullPointerException e){
            System.out.println("invocacion incorrecta del metodo length " + e);
        }
        str = new String(chars);
        System.out.println(str.length());
    }
}
