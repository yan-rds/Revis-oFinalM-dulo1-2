package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio8 {
    // Faça um Programa que leia uma lista de 5 números inteiros e mostre-os.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Variáveis
        int contador = 1;
        int maximoRepeticoes = 5;
        int numeroInserido;


        // Primeira parte do console
        System.out.println("Este programa irá ler uma lista de 5 números e mostrá-los");

        // Criando lista
        List <Integer> numeros = new ArrayList<>();

        // Estrutura de repetição
        while (contador <= maximoRepeticoes){
            System.out.println("Insira o "+contador+"º número da lista");
            numeroInserido = leitor.nextInt();
            numeros.add(numeroInserido);
            contador++;
        }
        System.out.println("A lista de números é: "+numeros);
    }
}
