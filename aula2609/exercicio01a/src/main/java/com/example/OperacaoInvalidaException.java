package com.example;


public class OperacaoInvalidaException extends Exception {

    private String message;

    public OperacaoInvalidaException(String operacao) {
        this.message = "Operação " + operacao + " inválida.";
    }

    @Override
    public String getMessage() {
        return message;
    }
}