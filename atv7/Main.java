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
        // Exercício 7
        System.out.println("Digite o comprimento de um dos lados: ");
        double comprimento = entrada.nextDouble();
        
        double area = Math.pow(comprimento, 2) * 2;
        
        System.out.println("O dobro da área do quadrado é: " + area);

        ////////////////////////
        entrada.close();
    }
    
}
