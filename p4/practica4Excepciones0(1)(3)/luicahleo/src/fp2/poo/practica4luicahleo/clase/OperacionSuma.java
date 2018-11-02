/*Clase OperacionSuma.java*/

package fp2.poo.practica4luicahleo.clase;

import fp2.poo.practica4luicahleo.interfaz.OperacionSumaInterfaz;
import fp2.poo.practica4luicahleo.excepcion.ValorIncorrectoExcepcion;
import java.lang.Exception;
import java.lang.*;


public class OperacionSuma implements OperacionSumaInterfaz{

	
	private int valor1 = 0;
	private int valor2 = 0;
	private int resultado = 0;
	private String e ="excep...........";

	//constructor sin argumentos
	public OperacionSuma(){
	}
	


	//constructor OperacionSuma con dos parametros
	public OperacionSuma(int valor1, int valor2){
		
		this.valor1 = valor1;
		this.valor2 = valor2;
		try{
			if (this.valor1 > 100 || this.valor1 < 0 || this.valor2 > 100 || this.valor2 < 0){
				System.out.println("valores erroneos");
				//throw new ValorIncorrectoExcepcion(e);

			}
		}catch(ValorIncorrectoExcepcion e){
			System.out.println(e.toString());
		}
	}



	public int suma() throws ValorIncorrectoExcepcion{

		if (this.valor1 > 100 || this.valor1 < 0 || this.valor2 > 100 || this.valor2 < 0){
        		throw new ValorIncorrectoExcepcion(e);
		}
        	resultado = valor1 + valor2 ; 
        	return resultado;
		
	}
	public int suma(int valor1, int valor2) throws ValorIncorrectoExcepcion{

		System.out.println("Ejecuta suma() con dos parametros!!!! " );
		//ponemos los limites de los parametros pasados, es decir valor1 y valor2
		if (valor1 > 100 || valor1 < 0 || valor2 > 100 || valor2 < 0){
        		throw new ValorIncorrectoExcepcion(e);
			
		}
        	resultado = valor1 + valor2 ; 
        	return resultado;

	}
	public void setValor1(int valor1) throws ValorIncorrectoExcepcion{
		if(valor1 >100 || valor1 < 0)
			throw new ValorIncorrectoExcepcion(e);
		this.valor1 = valor1;
		
	}
	public void setValor2(int valor2) throws ValorIncorrectoExcepcion{
		if(valor2 >100 || valor2 < 0)
			throw new ValorIncorrectoExcepcion(e);
		this.valor2 = valor2;
	}
	public int getResultado(){
		return resultado;
	}

}
