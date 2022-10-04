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
        // Exercício 4
        double media = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Digite o avalor da nota " + i + ":");
            media += entrada.nextDouble();
        }

        media = media / 4;
        
        System.out.println("A média é: " + media);

        ////////////////////////
        entrada.close();
    }
    
}
