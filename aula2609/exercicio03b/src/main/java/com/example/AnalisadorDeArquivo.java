package com.example;

import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class AnalisadorDeArquivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o caminho do arquivo ou diretório: ");
        String caminhoInput = scanner.nextLine();

        Path caminho = Paths.get(caminhoInput);

        if (!Files.exists(caminho)) {
            System.out.println("O caminho especificado não existe.");
        } else if (Files.isDirectory(caminho)) {
            System.out.println("O caminho especificado é um diretório.");
        } else if (Files.isRegularFile(caminho)) {
            System.out.println("O caminho especificado é um arquivo.");
            try {
                String conteudo = Files.readString(caminho);
                int numCaracteres = conteudo.length();

                // Usamos uma expressão regular para dividir por um ou mais espaços/quebras de linha
                String[] palavras = conteudo.split("\\s+");
                int numPalavras = palavras.length;
                
                // Caso o arquivo esteja vazio, o split pode retornar um array com uma string vazia
                if (numPalavras == 1 && palavras[0].isEmpty()) {
                    numPalavras = 0;
                }

                System.out.println("Número total de caracteres: " + numCaracteres);
                System.out.println("Número total de palavras: " + numPalavras);

            } catch (IOException e) {
                System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            }
        }
        scanner.close();
    }
}