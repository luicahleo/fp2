/*
 *  @(#)ClaseBase.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


/**
 * Descripcion: Constructores de la clase String.
 *
 * version 1.0 Mayo 2011
 * Fundamentos de Programacion II
 */
package fp2.poo.practica5.p1;

public class ClaseBase {

    private   int atributoPrivado;
    protected int atributoProtegido;
              int atributoPaquete;
    public    int atributoPublico; 

    public ClaseBase() {
        System.out.println("______________________ClaseBase: Constructor______________________");
        this.atributoPrivado = 1;
        System.out.println("Constructor de ClaseBase, atributo privado   "  + this.atributoPrivado);
        this.atributoProtegido = 2;
        System.out.println("Constructor de ClaseBase, atributo protegido "  + this.atributoProtegido);
        this.atributoPaquete = 3;
        System.out.println("Constructor de ClaseBase, atributo paquete   "  + this.atributoPaquete);
        this.atributoPublico = 4; 
        System.out.println("Constructor de ClaseBase, atributo publico   "  + this.atributoPublico);
        System.out.println("__________________________________________________________________");
    }

    private void metodoPrivado() {
        System.out.println("ClaseBase: Metodo privado\n");
    }       

    protected void metodoProtegido() {
        System.out.println("ClaseBase: Metodo protegido\n");
    }       

    void metodoPaquete() {
        System.out.println("ClaseBase: Metodo acceso en el paquete\n");
    }       

    public void metodoPublico () {
        System.out.println("ClaseBase: Metodo publico\n");
    }       
}
