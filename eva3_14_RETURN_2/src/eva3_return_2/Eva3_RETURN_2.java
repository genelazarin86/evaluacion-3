/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_return_2;

import java.util.Scanner;

/**
 *
 * @author leo
 */
public class Eva3_RETURN_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        System.out.println("base:");
        int base = captu.nextInt();
        System.out.println("potencia:");
        int pot = captu.nextInt();
        
        int resu = calcularpot(base,pot);
        System.out.println("el resultado es:"+ resu);
        
    }
    
    public static int calcularpot(int base, int potencia){
        int resu = 1;
        for (int i = 0; i < potencia; i++) {
            resu =  resu * base;
            
        }
        return resu;
    }
    
}
