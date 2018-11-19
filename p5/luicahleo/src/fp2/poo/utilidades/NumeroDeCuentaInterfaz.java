/*
 *  Fichero: NumeroDeCuentaInterfaz .java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

/**
 * Descripcion:
 *          Esta interfaz proporciona los metodos para el manejo del 
 *          numeroDeCuenta. Una clase que la implemente mantendrá
 *          al menos un atributo de tipo String. 
 *          Se debe comprobar que la longitud es de 20 digitos decimales. 
 *          Si al configurar o construir un objeto de esta clase no se 
 *          ajusta al formato, se debe lanzar la excepcion 
 *          NumeroDeCuentaIncorrectaExcepcion.
 */

package fp2.poo.utilidades;

/*
 * En fp2.poo.pfpoofp2.Excepciones.NumeroDeCuentaIncorrectaExcepcion
 * pfpoofp2 debe ser sustituido por pfpooXXX siendo XXX el login
 * del alumno proporcinado por el Centro de Calculo (CDC).
 */
import  fp2.poo.pfpoofp2.Excepciones.NumeroDeCuentaIncorrectaExcepcion;

public interface NumeroDeCuentaInterfaz {

    /**
     * Descripcion: Devuelve el numero de cuenta como String.
     */
    public String getNumeroDeCuenta();

    /**
     * Descripcion: Configura el numero de cuenta.
     */
    public void setNumeroDeCuenta( String numeroDeCuenta ) throws NumeroDeCuentaIncorrectaExcepcion;
}
