/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva12_metodo;

/**
 *
 * @author invitado
 */
public class Eva12_metodo {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      mostrarMensaje("eyyyyy");
      mostrarMuchosMensajes("hola", 90);
    
   }
      public static void mostrarMensaje(String mensaje){
         System.out.println(mensaje);
      }
      public static void mostrarMuchosMensajes(String mensaje,int veces){
         for (int i = 0; i < veces; i++) {
            System.out.println(mensaje);
            
         }
      }
   
   
}
