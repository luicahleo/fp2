/*
 *  @(#)Main.java
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

import fp2.poo.practica5.p2.ClaseConHerenciaEnOtroPaquete;
import fp2.poo.practica5.p2.ClaseSinHerenciaEnOtroPaquete ;

public class Main {

    public static void main(String args[]){
        ClaseConHerenciaEnOtroPaquete b = new ClaseConHerenciaEnOtroPaquete();
        ClaseSinHerenciaEnOtroPaquete c = new ClaseSinHerenciaEnOtroPaquete();
    }
}

