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
        // Exercício 3
        System.out.println("Digite o primeiro número: ");
        int numero1 = entrada.nextInt();
        
        System.out.println("Digite o segundo número: ");
        int numero2 = entrada.nextInt();
        
        int soma = numero1 + numero2;
        
        System.out.println("A soma dos números é: " + soma);

        ////////////////////////
        entrada.close();
    }
    
}
