/*
 *  Fichero: DniInterfaz .java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */
 
package fp2.poo.utilidades;

/*
 * En fp2.poo.pfpoofp2.Excepciones.DniIncorrectoExcepcion
 * pfpoofp2 debe ser sustituido por pfpooXXX siendo XXX el login
 * del alumno proporcinado por el Centro de Calculo (CDC).
 */
import fp2.poo.pfpoofp2.Excepciones.DniIncorrectoExcepcion;

/**
 *
 * Descripcion: La interfaz Dni mantiene los metodos 
 * para manejar objetos del tipo Dni.
 */
public interface DniInterfaz {

    /**
     * Descripcion: metodo que proporciona un valor 
     *              para configurar  el dni.
     */ 
    public void setDni( String dni ) throws DniIncorrectoExcepcion;

    /**
     * Descripcion: metodo que devuelve como String el dni.
     */
    public String getDni();

}
