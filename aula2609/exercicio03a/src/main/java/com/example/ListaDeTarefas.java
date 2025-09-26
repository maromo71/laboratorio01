package com.example;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.Scanner;

public class ListaDeTarefas {
    private static final String NOME_ARQUIVO = "tarefas.txt";
    private static final Path arquivoPath = Paths.get(NOME_ARQUIVO);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n--- Gerenciador de Tarefas ---");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");     
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    adicionarTarefa(scanner);
                    break;
                case 2:
                    listarTarefas();
                    break;
                case 3:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }

    private static void adicionarTarefa(Scanner scanner) {
        System.out.print("Digite a nova tarefa: ");
        String tarefa = scanner.nextLine() + System.lineSeparator(); // Adiciona quebra de linha
        try {
            Files.writeString(arquivoPath, tarefa, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("Tarefa adicionada com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao salvar a tarefa no arquivo: " + e.getMessage());
        }
    }

    private static void listarTarefas() {
        if (!Files.exists(arquivoPath)) {
            System.out.println("Nenhuma tarefa na lista ainda.");
            return;
        }

        try {
            List<String> tarefas = Files.readAllLines(arquivoPath);
            System.out.println("\n--- Suas Tarefas ---");
            if(tarefas.isEmpty()) {
                System.out.println("A lista de tarefas está vazia.");
            } else {
                int cont = 0;
                for (String tarefa: tarefas) {
                    System.out.println((++cont) + ". " + tarefa);
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo de tarefas: " + e.getMessage());
        }
    }
}