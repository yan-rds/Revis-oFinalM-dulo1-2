package br.com.zup;

import java.util.Scanner;

public class Exercicio5 {
    // Faça um programa que leia 5 números e informe o maior número.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Definindo variáveis
        double numeroLido;
        int totalDeNumeros =5;
        double maiorNumero;
        int contador = 2;


        // Primeira parte do console
        System.out.println("Este programa lerá 5 números e te dirá qual é o maior");
        System.out.println("Insira o 1º número");
        numeroLido = leitor.nextDouble();
        maiorNumero = numeroLido;

        // Criando a estrutura de repetição
        while (contador <= totalDeNumeros){
            System.out.println("Insira o "+contador+"º número");
            numeroLido = leitor.nextDouble();
            if (numeroLido > maiorNumero)
                maiorNumero = numeroLido;
            contador++;
        }
        System.out.println("o número "+maiorNumero+" é o maior");
    }
}
