/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_11_busqueda;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva3_11_busqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arreglo[]= {10};
        
      for (int i = 0; i < arreglo.length; i++) {
          arreglo[i]=(int)(Math.random()*100)+3;
          
          
            
        }
            for (int val : arreglo) {
                System.out.println("["+ val + "]");
            
        }
            Scanner captu = new Scanner (System.in);
            System.out.println("que valor buscas wey?");
            int valor = captu.nextInt();
            
            
            int pos = -1;
            for (int i = 0; i < arreglo.length; i++) {
                if(valor==arreglo[i]){
                    pos = i;
                    break;
            
        }
        }
            System.out.println("posicion="+ pos);
 {
            
        }
        
    }
    
}
