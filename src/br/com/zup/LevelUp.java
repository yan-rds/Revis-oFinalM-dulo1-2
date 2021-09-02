package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LevelUp {
    // Crie um programa para gerenciar uma lista de alunos, cada aluno tem nome, telefone e email. No final do programa deve ser exibido a lista de alunos cadastrados.
    // Entrega Mínima: O sistema permite, via terminal, inserir pelo menos 1 aluno em uma lista e retornar o mesmo na tela.
    // Entrega Média: O sistema permite adicionar mais de um aluno e apresenta um menu para decidir se deverá adicionar mais alunos ou encerrar o programa.
    // Entrega Máxima: O Sistema permite excluir um aluno usando como parâmetro o email e não permite inserir um aluno com o email repetido.

    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        // Variáveis
        int quantidadeInserida;
        String email;
        String dados;
        String confirmacaoInserir = "sim";
        String confirmacaoLista;
        int inserirRemover;


        // Lista
        Map<String, String> emailEDados  = new HashMap<>();


        // Primeira parte do console
        System.out.println("Este programa criará uma lista de alunos com Nome, Telefone e Email");
        System.out.println("Para inserir um aluno digite 1");
        System.out.println("Para remover um aluno digite 2");
        inserirRemover = leitor.nextInt();

        // Condicional para inserir alunos
        if(inserirRemover == 1) {
            // Este while dá a opção do usuário adicionar mais alunos após adicionar os que ele inicialmente quis
            while (confirmacaoInserir.equals("Sim") | confirmacaoInserir.equals("sim")) {
                // Começa aqui a estrutura de repetição que adicionará todos os alunos desejados à lista emailEDados
                System.out.println("Quantos alunos você deseja inserir?");
                quantidadeInserida = leitor.nextInt();
                for (int i = 1; i <= quantidadeInserida; i++) {
                    System.out.println("Por favor, digite o email do novo aluno");
                    email = leitor.next();
                    // Esta condicional detecta se o email do aluno já pertence à lista, impedindo-o de cadastrar novamente.
                    if (emailEDados.containsKey(email)){
                        System.out.println("Email já cadastrado. Não foi inserido");
                    }
                    else { // Caso não pertença a lista, ele segue com o cadastro com a condicional abaixo.
                        System.out.println("Agora digite seu nome e telefone");
                        leitor.nextLine();
                        dados = leitor.nextLine();
                        emailEDados.put(email, dados);
                        System.out.println("Aluno inserido.");
                    }
                }
                // Aqui o "for" que inseria alunos repetidamente terminou, e é perguntado ao usuário se ele quer adicionar mais
                System.out.println("Deseja adicionar mais alunos? Responda com Sim ou Não");
                confirmacaoInserir = leitor.next();
            }
        }
        // Esta condicional removerá o email do aluno da lista a partir da chave email.
        else if(inserirRemover == 2 ) {
            System.out.println("Digite o email do aluno que deseja remover");
            email = leitor.next();
            if (emailEDados.containsKey(email)) {
                emailEDados.remove(email);
                System.out.println("Aluno Removido");
            }
            else {
                System.out.println("Este email não está cadastrado.");
            }
        }
        System.out.println("Deseja acessar a lista de alunos cadastrados? Responda com Sim ou Não");
        confirmacaoLista = leitor.next();
        if (confirmacaoLista.equals("Sim") | confirmacaoLista.equals("sim")){
            for (String referencia: emailEDados.values()){
                System.out.println(referencia);
            }
        }
        else {
            System.out.println("Encerrando o programa.");
        }
    }
}

