/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_17_bisiesto;

import java.util.Scanner;

/**
 *
 * @author leo
 */
public class Eva3_17_bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        System.out.println("anio a evualuar");
        int year = captu.nextInt();
        if(bisiesto(year))
            System.out.println("si es año bisiesto!!!!!");
        else
            System.out.println("no es año bisiesto");
          
        }
        public static boolean bisiesto(int year){
            int resi4 = year  & 4;
             int resi100 = year & 100;
             int resi400 = year % 400;
             
             if((resi4 == 0) && ((resi100 != 0) ||(resi400==0) ) )
            return true;
            
            else
                 return false;
        }
    }
    

