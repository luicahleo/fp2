/*
 *  @(#)ClaseSinHerenciaEnOtroPaquete.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


/**
 * Descripcion:
 *
 * version 1.0 Mayo 2011
 * Fundamentos de Programacion II
 */
package fp2.poo.practica5.p2;

import fp2.poo.practica5.p1.ClaseBase;

public class ClaseSinHerenciaEnOtroPaquete {


    public ClaseSinHerenciaEnOtroPaquete() {
        ClaseBase obj = new ClaseBase();
        System.out.println();
        System.out.println("_____________ ClaseSinHerenciaEnOtroPaquete: Constructor__________");

        //obj.atributoPrivado= 1;
        //System.out.println("Constructor de ClaseBase, atributo privado   " 
        //                   + obj.atributoPrivado);

        //obj.atributoProtegido= 2;
        //System.out.println("Constructor de ClaseBase, atributo protegido "  
        //                     + obj.atributoProtegido);

        //obj.atributoPaquete= 3;
        //System.out.println("Constructor de ClaseBase, atributo paquete   " 
        //                   + obj.atributoPaquete);

        obj.atributoPublico= 4; 
        System.out.println("Constructor de ClaseBase, atributo publico   " 
                           + obj.atributoPublico);
        System.out.println("__________________________________________________________________"); 
    }
}
