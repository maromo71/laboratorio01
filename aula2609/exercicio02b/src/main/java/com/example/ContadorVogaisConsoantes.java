package com.example;

import java.util.Scanner;

public class ContadorVogaisConsoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase(); // Converte para minúsculas para facilitar

        int vogais = 0;
        int consoantes = 0;
        int espacos = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vogais++;
            } else if (c >= 'a' && c <= 'z') { // Se for uma letra e não for vogal, é consoante
                consoantes++;
            } else if (c == ' ') {
                espacos++;
            }
        }
        System.out.println("===============================================");
        System.out.println("Número de vogais:     " + vogais);
        System.out.println("Número de consoantes: " + consoantes);
        System.out.println("Número de espaços:     " + espacos);
        System.out.println("===============================================");
        scanner.close();
    }
}