/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_18_temperatura;

import java.util.Scanner;

/**
 *
 * @author leo
 */
public class Eva3_18_TEMPERATURA {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double temperatura;

        do {
            mostrarMenu();
            System.out.print("Elija una opción (1-5): ");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > 5);

        System.out.print("Ingrese la temperatura a convertir: ");
        temperatura = scanner.nextDouble();

        switch (opcion) {
            case 1:
                System.out.println(temperatura + " Celsius = " + celsiusAFahrenheit(temperatura) + " Fahrenheit");
                break;
            case 2:
                System.out.println(temperatura + " Celsius = " + celsiusAKelvin(temperatura) + " Kelvin");
                break;
            case 3:
                System.out.println(temperatura + " Fahrenheit = " + fahrenheitACelsius(temperatura) + " Celsius");
                break;
            case 4:
                System.out.println(temperatura + " Kelvin = " + kelvinAFahrenheit(temperatura) + " Fahrenheit");
                break;
            case 5:
                System.out.println(temperatura + " Fahrenheit = " + fahrenheitAKelvin(temperatura) + " Kelvin");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    public static void mostrarMenu() {
        System.out.println("***** Menú *****");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Celsius a Kelvin");
        System.out.println("3. Fahrenheit a Celsius");
        System.out.println("4. Kelvin a Fahrenheit");
        System.out.println("5. Fahrenheit a Kelvin");
    }

    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusAKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double kelvinAFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }

    public static double fahrenheitAKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }
}