/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva7_cubo;

/**
 *
 * @author invitado
 */
public class Eva7_cubo {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int cubo [][][]= new int [10][5][3];
      for (int i = 0; i < cubo.length; i++) {
         for (int j = 0; j < cubo[i].length; j++) {
            for (int k = 0; k < cubo[i][j].length; k++) {
               cubo [i][j][k] = (int)(Math.random()* 100);
               
               
            }
         }
         
      }
      for (int i = 0; i < cubo.length; i++) {
         for (int j = 0; j < cubo[i].length; j++) {
            for (int k = 0; k < cubo[i][j].length; k++) {
               System.out.println("["+ cubo [i][j][k]+"]");
      
   }
   
}
      }
   }
}
