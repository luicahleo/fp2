/*
 *  @(#)Practica5Ejercicio10.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

/**
 * Descripcion: Uso de los metodos estaticos de Character.
 *
 * version 1.0 Mayo 2011
 * Fundamentos de Programacion II
 */
package fp2.poo.practica5;

public class Practica5Ejercicio10 {
    public static void main ( String args[] ) {
        char a[] = {'F','u','n','d','a','m','e','n','t','s',
                    ' ','d','e',' ',
                    'P','r','o','g','r','a','m','a','c','i','o','n',
                    ' ','I','I'};

        for(int i = 0; i < a.length; i++){
            if(Character.isDigit(a[i]))
                System.out.println(a[i]+" es un digito");
            if(Character.isLetter(a[i]))
                System.out.println(a[i]+" es una letra");
            if(Character.isWhitespace(a[i]))
                System.out.println(a[i]+" es un espacio");
            if(Character.isUpperCase(a[i]))
                System.out.println(a[i]+" es mayuscula");
            if(Character.isLowerCase(a[i]))
                System.out.println(a[i]+" es minuscula");
            System.out.println();
        }
    }
}

