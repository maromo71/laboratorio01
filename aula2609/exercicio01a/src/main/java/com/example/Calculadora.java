package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Digite o segundo número: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            System.out.print("Digite a operação (+, -, *, /): ");
            char operacao = scanner.nextLine().charAt(0);

            double resultado = 0;

            switch (operacao) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Erro: Divisão por zero não é permitida.");
                    }
                    resultado = num1 / num2;
                    break;
                default:
                    throw new OperacaoInvalidaException(String.valueOf(operacao));
            }

            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException e) {
            System.err.println("Erro: Entrada inválida. Digite apenas números.");
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        } catch (OperacaoInvalidaException e) {
            System.err.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Fim da operação.");
            scanner.close();
        }
    }
}