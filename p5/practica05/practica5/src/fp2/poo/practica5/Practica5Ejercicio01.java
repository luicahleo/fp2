/*
 *  @(#)Practica5Ejercicio01.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


/**
 * Descripcion: Constructores de la clase String.
 *
 * version 1.0 Mayo 2011
 * Fundamentos de Programacion II
 */

package fp2.poo.practica5;

public class Practica5Ejercicio01 {
    public static void main( String args[] ) {
        char chars[] = {'T','e','l','e','m','a','t','i','c','a'};
        char c[] = {'F','u','n','d','a','m','e','n','t','o','s',' ','d','e',' ',
                   'P','r','o','g','r','a','m','a','c','i','o','n',' ', 'I', 'I' };
        String str          = "Fundamentos de Programacion II";
        String s1           = new String(c);
        String s2           = new String(s1);
        String fundamentos  = "Fundamentos ";
        String de           = "de ";
        int    [] fundament = {70,117,110,100,97,109,101,110,116,111,115};
        String    funString = new String(fundament,0,fundament.length);

        System.out.println(new String(chars,2,4));                  
        System.out.println(funString + " de Programacion II");          
        System.out.println("Fundamentos de Programacion II");  
        System.out.println(str);    
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(c);
        System.out.println(fundamentos  + de + "Programacion II");
    }
}
