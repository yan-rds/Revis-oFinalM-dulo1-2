package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio11 {
    // Faça um Programa que leia 20 números e armazene-os numa lista. Armazene os números pares na lista PAR e os números ÍMPARES na lista ímpar. Imprima as três listas.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Variáveis
        int numeroInserido;

        // Listas
        List <Integer> todos = new ArrayList<>();
        List <Integer> pares = new ArrayList<>();
        List <Integer> impares = new ArrayList<>();


        // Primeira parte do console
        System.out.println("Este programa pegará 20 números inseridos por você e separá-los por 'Todos', 'ímpares' e 'pares'.");

        // Repetição
        for (int i=1; i <= 20; i++){
            System.out.println("Insira o "+i+"° número");
            numeroInserido = leitor.nextInt();
            todos.add(numeroInserido);
            if (numeroInserido % 2 == 0){
                pares.add(numeroInserido);
            }
            else {
                impares.add(numeroInserido);
            }
        }
        System.out.println("Todos os números:");
        System.out.println(todos);
        System.out.println("Ímpares:");
        System.out.println(impares);
        System.out.println("Pares:");
        System.out.println(pares);


    }
}
