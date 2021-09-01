package br.com.zup;

import java.util.Scanner;

public class Exercicio2 {
    //Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Definindo variáveis
        int numeroDesejado;

        // Primeira parte do console
        System.out.println("Este programa te dirá um dia da semana referente ao número de 1 a 7 que você inserir");
        System.out.println("Pode inserir o número desejado");
        numeroDesejado = leitor.nextInt();

        // Criando condicional
        switch (numeroDesejado) {
            case 1:
                System.out.println("O dia da semana é Domingo!");
                break;
            case 2:
                System.out.println("O dia da semana é Segunda!");
                break;
            case 3:
                System.out.println("O dia da semana é Terça!");
                break;
            case 4:
                System.out.println("O dia da semana é Quarta!");
                break;
            case 5:
                System.out.println("O dia da semana é Quinta!");
                break;
            case 6:
                System.out.println("O dia da semana é Sexta!");
                break;
            case 7:
                System.out.println("O dia da semana é Sábado!");
                break;
            default:
                System.out.println("O número inserido é inválido =(");
        }
    }
}
