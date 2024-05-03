/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_arreglos;

/**
 *
 * @author leo
 */
public class Eva3_9_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String diasSemana[]={"domingo","lunes","martes","miercoles","jueves","viernes","sabado" };
        char vocales[]= {'a','e','i','o','u'};
        System.out.println("tamaño del arreglo diaSemana="+ diasSemana.length);
        System.out.println("tamaño del arreglo vocales="+ vocales.length);
        
        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println(diasSemana[i]);
            
        }
        for (int j = 0; j< vocales.length; j++) {
            System.out.println(vocales);    
            
            
        }
        String menu[]={"archivo","nueva factura","modificar","salir"};
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i+"-"+ menu[i]);
            
            
        }
    }
    
}
