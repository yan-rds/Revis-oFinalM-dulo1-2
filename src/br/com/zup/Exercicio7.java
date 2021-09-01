package br.com.zup;

import java.util.Scanner;

public class Exercicio7 {
    // Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Variáveis
        int primeiroNumero;
        int ultimoNumero;



        // Primeira parte do console
        System.out.println("Este programa te dirá todos os números inteiros no intervalo que você decidir");
        System.out.println("Vamos lá, preciso que você me diga dois números, pro começo e fim do intervalo");
        System.out.println("Insira o primeiro número");
        primeiroNumero = leitor.nextInt();
        System.out.println("Agora digite o segundo número");
        ultimoNumero = leitor.nextInt();

        // Estrutura de repetição
        while (primeiroNumero <= ultimoNumero){
            System.out.println(primeiroNumero);
            primeiroNumero++;
        }


    }
}
