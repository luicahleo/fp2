/*Codigo para ValorIncorrectoExcepcion*/	
/*
 *  @(#)ValorIncorrectoExcepcion.java
 *
 *  Luis Rolando Cahuana Leon
 *  
 */

package fp2.poo.practica4luicahleo.excepcion;

import java.lang.Exception;
import java.lang.*;
/**
 * Descripcion: Implementacion de una Excepcion.
 *
 *
 */
public class ValorIncorrectoExcepcion extends Exception{

    /** 
      * Este atributo estatico se incluye para evitar el warning con la opcion -Xlint 
      * Es necesario ya que la clase Exception es serializable 
      * (este tema no se ve en practica).
      */

	//atributo privado tipo string
	private String cadena;

	//cosntructor sin parametros
	public ValorIncorrectoExcepcion(){
		//le asignamos una cadena vacia
		cadena  = "";
	}
    public static final long serialVersionUID = 24362462L;

    private int detalle;
    //constructor con un parametro del tipo String
    public ValorIncorrectoExcepcion(String cadena){
		this.cadena = cadena;
    }

    public String toString(){
        return "Valor de atributo privado: [" + cadena + "]";
    }
}

