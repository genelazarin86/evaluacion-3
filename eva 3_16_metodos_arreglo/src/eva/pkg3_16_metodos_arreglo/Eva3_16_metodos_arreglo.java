/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva.pkg3_16_metodos_arreglo;

/**
 *
 * @author invitado
 */
public class Eva3_16_metodos_arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]datos = new int [10];
       datos = llenar(datos);
            imprimir(datos);
            System.out.println("");
  
        
        int[] datos2 = new int[15];
                    datos2= llenar(datos2);
        
        imprimir(datos2);
    }
    public static void imprimir (int[]arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("{"+ arreglo[i] + "]");
            
        }
    }
    
    public static int[] llenar(int[]arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]= (int) (Math.random()* 100);
        }
        return arreglo;
    }
}
