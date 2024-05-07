/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_13_return;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva3_13_return {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        System.out.println("valor 1: ");
        int val1 = captu.nextInt();
        System.out.println("valor 2:");
      int val2 = captu.nextInt();
      int resu = sumar (val1,val2);
        System.out.println("la suma = "+ resu);
       }
     public static int sumar (int num1,int num2){
           int resu = num1 + num2;
           return resu;
    }
    
}
