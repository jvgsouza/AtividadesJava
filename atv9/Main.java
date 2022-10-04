/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author jvsgs
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Exercício 9
        System.out.println("Digite a temperatura em Fahrenheit: ");
        double temperaturaFahrenheit = entrada.nextDouble();
        double temperaturaCelsius = 5 * ((temperaturaFahrenheit - 32) / 9);
        
        System.out.println("A temperatura em Celsius é: " + temperaturaCelsius);

        ////////////////////////
        entrada.close();
    }
    
}
