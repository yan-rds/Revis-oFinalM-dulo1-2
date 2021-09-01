package br.com.zup;

import java.util.Scanner;

public class Exercicio1 {

    // Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Definindo variáveis
        int contador = 2;
        double maisBarato;
        double preco;
        int numeroDoProduto = 1;

        // Primeira parte do console
        System.out.println("Este programa irá perguntar o preço de três produtos e te dizer o mais barato entre eles");
        System.out.println("Diga o preço do 1º produto");
        maisBarato = leitor.nextDouble();

        while (contador <= 3) {
            System.out.println("Diga o preço do " + contador + "º produto");
            preco = leitor.nextDouble();
            if (preco < maisBarato) {
                maisBarato = preco;
                numeroDoProduto = contador;
            }
            contador++;
        }
        System.out.println("O produto "+numeroDoProduto+ " é o produto mais barato, compre-o");
    }
}
