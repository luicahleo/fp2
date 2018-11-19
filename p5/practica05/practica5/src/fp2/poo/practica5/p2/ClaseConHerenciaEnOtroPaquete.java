/*
 *  @(#)ClaseConHerenciaEnOtroPaquete.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


/**
 * Descripcion: Clase Main de prueba.
 *
 * version 1.0 Mayo 2011
 * Fundamentos de Programacion II
 */
package fp2.poo.practica5.p2;

import fp2.poo.practica5.p1.ClaseBase;

public class ClaseConHerenciaEnOtroPaquete extends ClaseBase {


    public ClaseConHerenciaEnOtroPaquete() {
        System.out.println("_________ClaseConHerenciaEnOtroPaquete: Constructor__________");
        //this.atributoPrivado= 1;
        //System.out.println("Constructor de ClaseBase, atributo privado   " 
        //                   + this.atributoPrivado);

        this.atributoProtegido= 2;
        System.out.println("Constructor de ClaseBase, atributo protegido "  + this.atributoProtegido);

        //this.atributoPaquete= 3;
        //System.out.println("Constructor de ClaseBase, atributo paquete   " 
        //                   + this.atributoPaquete);

        this.atributoPublico= 4; 
        System.out.println("Constructor de ClaseBase, atributo publico   "  + this.atributoPublico);
        System.out.println("_____________________________________________________________");
    }
}
