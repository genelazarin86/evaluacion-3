/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva6_arreglos_multiple;

/**
 *
 * @author invitado
 */
public class Eva6_arreglos_multiple {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
         int matriz [][]= new int [3][2];
         matriz[0][0]= 100;
         matriz[1][0]= 200;
        
         matriz[2][0]=300;
         matriz[0][1]= 400;
         matriz[1][1]= 500;
         matriz[2][1]=  600;
         System.out.println("matriz.lenght="+matriz.length);
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
               System.out.println("matriz{"+ i +"][" + j + "] = " + matriz[i][j]);
               
            }
         
      }
   }
   
}
