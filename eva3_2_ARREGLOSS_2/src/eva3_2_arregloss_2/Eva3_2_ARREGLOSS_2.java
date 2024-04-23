/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_2_arregloss_2;

/**
 *
 * @author invitado
 */
public class Eva3_2_ARREGLOSS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //java 0 primer elemento
        // n-1 ultimo elemento
        //vamos a crear un arreglo y llenarlo con valores aleaotorios.
        int datos[]= new int[10];
      
   
        for (int i = 0; i < 10; i++) {
           datos[i] = (int)(Math.random()*100);
        }
            
         for (int i = 0; i < 10; i++) {
             System.out.println("["+ datos[i] + "}");
                
            }
        }
        
    }
    

