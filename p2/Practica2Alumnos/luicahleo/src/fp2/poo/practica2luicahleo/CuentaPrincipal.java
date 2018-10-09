/*
 *  Fichero: CuentaPrincipal.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


package fp2.poo.practica2luicahleo;


import java.lang.*;
import fp2.poo.utilidades.Cuenta;


public class CuentaPrincipal{
	public static void main(String args[ ]) {
		System.out.println("!!!!!!!!!!!!!!!!!SE EJECUTA MAIN PRINCIPAL!!!!!!!!!!!!!!");
  
//	creamos tabla para los 20 elementos

	Cuenta tabla[] = new Cuenta[20];
	System.out.println("!!!!!!!!!!!!!!!!Tabla creada!!!!!!!!!!!!!!");
	
	

	tabla[0].setNombre() = "Luis";
	tabla[0].setSaldo() = 100;

	tabla[1].setNombre() = "Pedro";
	tabla[1].setSaldo() = 200;

	tabla[2].setNombre() = "Juan";
	tabla[2].setSaldo() = 300;

	tabla[3].setNombre() = "Marco";
	tabla[3].setSaldo() = 400;

 
	for(int i=0;i<tabla.length;i++){
}		System.out.println(tabla[i].getNombre() + " " +tabla[i].getSaldo() );

	}
}
