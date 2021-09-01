package br.com.zup;

public class Exercicio6 {
    // Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
    public static void main(String[] args) {
        // Criando variáveis
        int contador = 1;
        int soma = 0;


        // Criando a estrutura de repetição
        while (contador <= 50){
            if (contador % 2 == 1) {
                soma = soma + contador;
            }
            contador ++;
        }
        System.out.println("A soma dos 50 primeiros números ímpares é: " + soma);

    }
}
