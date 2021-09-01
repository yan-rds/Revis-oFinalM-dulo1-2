package br.com.zup;

import java.util.Scanner;

public class Exercicio3 {
    // Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual número ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // Definindo variáveis
        int numeroDesejado;
        int contador = 1;
        int resultado;

         // Primeira parte do console
        System.out.println("Este sistema te dará a tabuada do número inteiro desejado");
        System.out.println("Por favor digite um número inteiro de sua escolha");
        numeroDesejado = leitor.nextInt();
        System.out.println();
        System.out.println("Tabuada de " + numeroDesejado + ":");
        System.out.println();

        // Criando a tabuada
        while (contador <= 10){
            resultado = numeroDesejado * contador;
            System.out.println(numeroDesejado + " x " + contador + " = " + resultado);
            contador++;
        }
    }
}
