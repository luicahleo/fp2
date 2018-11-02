/*
 *  Fichero: Usuario.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


package fp2.poo.practica3luicahleo;


import java.lang.*;
import fp2.poo.practica3.Persona;

public class Usuario implements Persona{
	

	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String dni;
	private String domicilio;


	public Usuario(String nombre,String primerApellido,String segundoApellido,String dni,String domicilio){
	
	this.nombre = nombre;
	this.primerApellido = primerApellido;
	this.segundoApellido = segundoApellido;
	this.dni = dni;
	this.domicilio = domicilio;

	}//end contructor

//GETTERS
	public String getNombre(){
		return this.nombre;
	}
	public String getPrimerApellido(){
		return this.primerApellido;
	}
	public String getSegundoApellido(){
		return this.segundoApellido;
	}
	public String getDNI(){
		return this.dni;
	}
	public String getDomicilio(){
		return this.domicilio;
	}
	
	
//SETTERS

	public void setNombre( String nombre ){
	this.nombre = nombre;
	}
	public void setPrimerApellido(  String primerApellido ){
	this.nombre = primerApellido;
	}
	public void setSegundoApellido( String segundoApellido ){
	this.nombre = segundoApellido;
	}
	public void setDNI( String dni ){
	this.nombre = dni;
	}
	public void setDomicilio( String domicilio ){
	this.nombre = domicilio;
	}







}//end public class
