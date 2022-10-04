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
        // Exercício 6
        System.out.println("Digite o raio do círculo: ");
        double raio = entrada.nextDouble();
        
        double area = 3.141592 * Math.pow(raio, 2);
        
        System.out.println("A área do círculo é: " + area);

        ////////////////////////
        entrada.close();
    }
    
}
