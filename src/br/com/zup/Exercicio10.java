package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio10 {
    // Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Definindo variáveis
        double numeroInserido;
        double soma = 0;

        // Criando lista
        List <Double> numeros = new ArrayList<>();


        // Criando o console
        System.out.println("Este programa lerá 4 notas e mostrá-las na tela junto à sua média");

        // Criando repetição
        for (int i=1 ; i <= 4; i++){
            System.out.println("Insira o "+i+"º número");
            numeroInserido = leitor.nextDouble();
            numeros.add(numeroInserido);
            soma = soma + numeroInserido;
        }
        double media = soma / 4;

        System.out.println("Números inseridos:");
        System.out.println(numeros);
        System.out.println("Média destes números");
        System.out.println(media);
    }
}
