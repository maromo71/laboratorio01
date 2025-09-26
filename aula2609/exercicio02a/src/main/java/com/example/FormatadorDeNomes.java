package com.example;

import java.util.Scanner;

public class FormatadorDeNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome completo da pessoa: "); 
        String nomeCompleto = scanner.nextLine();

        // 1. Remover espaços em branco do início e do fim
        String nomeTratado = nomeCompleto.trim();

        // 2. Identificar o último sobrenome
        int ultimoEspacoIndex = nomeTratado.lastIndexOf(' ');

        if (ultimoEspacoIndex == -1) {
            System.out.println("Nome inválido. Forneça nome e sobrenome.");
        } else {
            // Separa o nome do último sobrenome
            String nome = nomeTratado.substring(0, ultimoEspacoIndex);
            String sobrenome = nomeTratado.substring(ultimoEspacoIndex + 1);

            // 3. Converte o sobrenome para maiúsculas e o resto para minúsculas
            sobrenome = sobrenome.toUpperCase();
            nome = nome.toLowerCase();

            // Capitaliza a primeira letra do nome
            String primeiroNomeCap = nome.substring(0, 1).toUpperCase() + nome.substring(1);

            // 4. Monta o formato final
            String nomeFormatado = sobrenome + ", " + primeiroNomeCap;

            System.out.println("Nome formatado: " + nomeFormatado); 
        }
        scanner.close();
    }
}