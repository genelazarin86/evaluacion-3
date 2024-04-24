/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_4_captura_datos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva3_4_captura_datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant;
        Scanner captu = new Scanner(System.in);
        System.out.println("¿cuantos nombres vas a capturar?");
        cant = captu.nextInt();
        String[] listaNombre = new String [cant];
        captu.nextLine();
        for (int i = 0; i < listaNombre.length; i++) {
            System.out.println("nombre #" + (i+1) + ":");
            listaNombre[i] = captu.nextLine();
            
        }
        for(int i = 0; i < listaNombre.length; i++) {
            System.out.println(listaNombre[i]);
            
        }
        
    }
    
}
