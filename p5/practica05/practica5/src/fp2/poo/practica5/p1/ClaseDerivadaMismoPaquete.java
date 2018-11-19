package fp2.poo.practica5.p1;

import fp2.poo.practica5.p1.ClaseBase;

public class ClaseDerivadaMismoPaquete extends fp2.poo.practica5.p1.ClaseBase {

    public ClaseDerivadaMismoPaquete () {
        //this.atributoPrivado = 1;
        //System.out.println("Constructor de ClaseDerivadaMismoPaquete , atributo privado   " 
        //                   + atributoPrivado);
        this.atributoProtegido = 2;
        System.out.println("Constructor de ClaseDerivadaMismoPaquete , atributo protegido "
                           + atributoProtegido);
        this.atributoPaquete = 3;
        System.out.println("Constructor de ClaseDerivadaMismoPaquete , atributo paquete   " 
                           + atributoPaquete);
        this.atributoPublico= 4; 
        System.out.println("Constructor de ClaseDerivadaMismoPaquete , atributo publico   " 
                           + atributoPublico);
  
    }

    private void metodoDerivPaqPrivado () {
        System.out.println("Metodo privado en ClaseDerivadaMismoPaquete \n");
    }       

    protected void metodoDerivPaqProtegido () {
        System.out.println("Metodo protegido en ClaseDerivadaMismoPaquete \n");
    }       

    void metodoDerivPaqPaquete () {
        System.out.println("Metodo acceso en el paquete en ClaseDerivadaMismoPaquete \n");
    }       

    public void metodoDerivPaqPublico () {
        System.out.println("Metodo publico en en ClaseDerivadaMismoPaquete \n");
    }   
}
