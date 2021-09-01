package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio9 {
 //Faça um Programa que leia uma lista de 10 números e mostre-os na ordem inversa.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Variáveis
        int contador = 1;
        int quantidadeDeNumeros = 10;
        double numeroInserido;


        // Primeira parte do console
        System.out.println("Este programa lê 10 números ");

        // Criando a lista
        List <Double> numeros = new ArrayList<>();
        List <Double> numerosInvertidos = new ArrayList<>();

        // Estrutura de repetição para pegar a lista
        while (contador <= quantidadeDeNumeros){
            System.out.println("Insira o "+contador+"° número");
            numeroInserido = leitor.nextDouble();
            numeros.add(numeroInserido);
            contador++;
        }
            contador--;
            contador--;

        System.out.println("teste");
        // Estrutura de repetição pra inverter a lista
        while (contador >= 0){
            numerosInvertidos.add(numeros.get(contador));
            contador--;

        }
        System.out.println(numerosInvertidos);
    }
}
