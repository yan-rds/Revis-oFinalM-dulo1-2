package br.com.zup;

import java.util.Scanner;

public class Exercicio13 {
    // João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Variáveis
        int valorLimite = 50;
        int valorMulta = 4;
        double quilosPescados;
        double excesso;
        double multa;

        // Primeira parte do console
        System.out.println("Este programa te dirá quantos quilos sua pescada passou do limite e te dirá quanto você precisará pagar de multa");
        System.out.println("Quantos quilos você pescou?");
        quilosPescados = leitor.nextDouble();

        if (quilosPescados >= (valorLimite + 1)) {
            excesso = quilosPescados - valorLimite;
            multa = excesso * valorMulta;
            System.out.println("Você pescou " + excesso + " quilos a mais que o limite");
            System.out.println("Isso equivale a R$" + multa + " em multa");
        }
        else if (quilosPescados < (valorLimite + 1) & quilosPescados > 0){
            System.out.println("Com essa quantidade de pescada, você não pagará multa");
        }
        else {
            System.out.println("Você provavelmente inseriu números inválidos, por favor confira e tente novamente");
        }


    }
}
