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
        // Exercício 8
        System.out.println("Valor recebido por hora: ");
        double valorHora = entrada.nextDouble();

        System.out.println("Horas trabalhadas: ");
        double horasTrabalhadas = entrada.nextDouble();
        
        double salaraio = horasTrabalhadas * valorHora;
        
        System.out.println("Seu salário no mês é: " + salaraio);

        ////////////////////////
        entrada.close();
    }
    
}
