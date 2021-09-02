package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio12 {
    // Faça um Programa que leia uma lista de 5 números inteiros, mostre a soma, a multiplicação e os números.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Variáveis
        int numeroInserido;
        int soma = 0;
        int multiplicacao = 1;

        // Lista
        List <Integer> numeros = new ArrayList<>();

        // Primeira parte do console
        System.out.println("Este programá lerá 5 números inteiros, e mostrará de volta sua soma, multiplicação e os números inseridos");

        // Repetição
        for (int i = 1; i <= 5; i++){
            System.out.println("Insira o "+i+"º número da lista");
            numeroInserido = leitor.nextInt();
            numeros.add(numeroInserido);
            soma = soma + numeroInserido;
            multiplicacao = multiplicacao * numeroInserido;
        }
        System.out.println("A soma deles é "+soma);
        System.out.println("A multiplicação é "+multiplicacao);
        System.out.println("A lista de números inseridos é");
        System.out.println(numeros);
    }
}
