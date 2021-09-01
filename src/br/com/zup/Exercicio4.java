package br.com.zup;

import java.util.Scanner;

public class Exercicio4 {
    // Os números primos possuem várias aplicações dentro da Computação, por exemplo na Criptografia. Um número primo é aquele que é divisível apenas por um e por ele mesmo. Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Definindo Variáveis
        int numeroInserido;

        // Primeira parte do console
        System.out.println("Este programa irá dizer se o número que você inserir é um número primo ou não");
        System.out.println("Por favor insira um número inteiro");
        numeroInserido = leitor.nextInt();

        if (numeroInserido < 10){
            if (numeroInserido == 1 | numeroInserido == 3 | numeroInserido == 5 |  numeroInserido == 7 ){
                System.out.println("Esse número é primo");
            }
            else {
                System.out.println("Esse número não é primo");
            }
        }
        else {
            if ( numeroInserido % 2 == 0 | numeroInserido % 3 == 0 | numeroInserido % 4 == 0 | numeroInserido % 5 == 0 | numeroInserido % 6 == 0 | numeroInserido % 7 == 0 | numeroInserido % 8 == 0 | numeroInserido % 9 == 0 ){
                System.out.println("Este número não é primo");
            }
            else {
                System.out.println("Esse número é primo");
            }
        }
    }
}
