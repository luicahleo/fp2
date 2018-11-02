/*
 *  @(#)Ejercicio01.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


package fp2.poo.practica1;

import java.lang.*;
import fp2.poo.practica1.Calculadora;
import fp2.poo.practica1.CalculadoraExcepcion;
/**
 * Descripci�n: Esta es una clase de prueba que contiene el metodo
 *              main para probar la clase Calculadora.
 *
 * @version version 1.0 Abril 2011
 * @author  Fundamentos de Programacion II
 */
public class Ejercicio01 {

    /**
     *  Este metodo invoca a la clase Calculadora. 
     *  Realiza la instanciaci�n de la clase e invoca 
     *  sus metodos.
     */
    public static void main( String args[] ) {
        int i = 0; /* Variables locales a main */
        int j = 0; 

	int resultado = 0;
        Calculadora calc = new Calculadora ();

        /* Primera operacion : 1 + 2 ( Resultado : 3).*/
        i = 10;
        j = 20;

	try{
		//llamamos al metodo suma(i,j)
		resultado = calc.suma(i,j);

		System.out.println("resulado de suma: " + resultado);
	}catch (CalculadoraExcepcion e){
                System.out.println( "Excepci�n Capturada " + e + " valores erroneos" );
	}
	
	/*****
       // System.out.println ("El resultado de sumar " + i + " y "
        //                    + j + " es " + calc.suma( i, j));

        /* Segunda operacion : Factorial del resultado anterior .
         * ( Resultado : 3! = 6)
         */
        //i = calc.getMemoria(  );
        //j = calc.factorial( i );
       // System.out.println( "El factorial de " + i + " es " + j);

        /* Tercera operacion : Dividimos el ultimo resultado por 4.
         * ( Resultado : 1).
         */
        //System.out.println( "El resultado de dividir " + j + 
         //                   " y 4 es " + calc.divide( j, 4));

       /* Cuarta operacion : Sumamos el contenido de la memoria a 20.
        * ( Resultado : 23).
        */
      //i = 20;
      //System.out.println( "El resultado de sumar " 
      //                   + calc.getMemoria() + " y " + i 
       //                  + " es " + calc.suma( i ));




    }
}
