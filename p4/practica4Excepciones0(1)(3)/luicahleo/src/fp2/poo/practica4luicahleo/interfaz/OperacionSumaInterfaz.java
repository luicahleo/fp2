/*Clase para OperacionSumaInterfaz*/



package fp2.poo.practica4luicahleo.interfaz;

import fp2.poo.practica4luicahleo.excepcion.ValorIncorrectoExcepcion;
import java.lang.Exception;
import java.lang.*;

public interface OperacionSumaInterfaz{

	public int suma() throws ValorIncorrectoExcepcion;
	public int suma(int valor1, int valor2) throws ValorIncorrectoExcepcion;
	public void setValor1(int valor1) throws ValorIncorrectoExcepcion;
	public void setValor2(int valor2) throws ValorIncorrectoExcepcion;
	public int getResultado();
}
