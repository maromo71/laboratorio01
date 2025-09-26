package com.example;

import java.util.Scanner;

public class ValidadorDeSenha {

    public static void validarSenha(String senha) throws SenhaFracaException {
        if (senha.length() < 8) {
            throw new SenhaFracaException("A senha deve ter pelo menos 8 caracteres.");
        }
        
        // Expressões regulares para verificar a presença de número e letra maiúscula
        if (!senha.matches(".*[0-9].*")) {
            throw new SenhaFracaException("A senha deve conter pelo menos um número.");
        }
        
        if (!senha.matches(".*[A-Z].*")) {
            throw new SenhaFracaException("A senha deve conter pelo menos uma letra maiúscula.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma senha para validação: ");
        String senha = scanner.nextLine();

        try {
            validarSenha(senha);
            System.out.println("Senha forte e válida!");
        } catch (SenhaFracaException e) {
            System.err.println("Erro: Senha fraca! " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}