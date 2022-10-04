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
        // Exercício 2
        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();
        
        System.out.println("O número informado foi " + numero);

        ////////////////////////
        entrada.close();
    }
    
}
