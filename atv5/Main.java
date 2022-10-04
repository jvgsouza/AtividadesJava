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
        // Exercício 5
        System.out.println("Digite o valor em metros: ");
        double metros = entrada.nextDouble();
        double centimetros = metros * 100;

        
        System.out.println("O valor em centímetros é: " + centimetros);

        ////////////////////////
        entrada.close();
    }
    
}
