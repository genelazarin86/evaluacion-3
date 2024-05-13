/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_19_referencias;

/**
 *
 * @author invitado
 */
public class Eva3_19_REFERENCIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int[5];
        int x = 100;
         System.out.println("antes de llamar al metodo. x = " + x);
        sumarUno(x);
        System.out.println("despues de llamar al metodo x = " + x);
        System.out.println("------------------");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + arreglo[i]+ "]" );
            
        }
        System.out.println("");
        modificarArreglo(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + arreglo[i]+ "]" );
        
    }
    }
     public static void sumarUno(int valor ){
         System.out.println("antes de la operacion valor:" + valor );
         valor = valor + 1;
         System.out.println("despues de la operacion valor :" + valor );
     }
     public static void modificarArreglo(int[] arreglo ){
         for (int i = 0; i < arreglo.length; i++) {
             arreglo[i] = (int)(Math.random() * 100 );
             
         }
     }
}

    
    

