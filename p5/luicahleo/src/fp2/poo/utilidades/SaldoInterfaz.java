/*
 *  @(#)SaldoInterfaz.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

package fp2.poo.utilidades;


public interface SaldoInterfaz{

    /**
     * Descripcion: Devuelve como double el saldo.
     */
    public double getSaldo();

    /**
     * Descripcion: Devuelve como Double el saldo.
     */
    public Double getSaldoDouble();

    /**
     * Descripcion: Devuelve configura con Double el saldo.
     */
    public void setSaldo(Double d);

    /**
     * Descripcion: Devuelve configura con double el saldo.
     */
    public void setSaldo(double d);
}
