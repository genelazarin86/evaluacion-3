/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_propiedades_arreglos;

/**
 *
 * @author invitado
 */
public class Eva3_propiedades_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[] = new int[3];
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        System.out.println(arreglo);
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+ arreglo[i] + "]");
            
        }
        arreglo = new int [5];
        System.out.println("");
        System.out.println(arreglo);
        System.out.println("despues del cambio de tamaño");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+ arreglo[i] + "]");
            
        }
        
    }
    
}
