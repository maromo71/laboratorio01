package com.example;

import java.time.LocalDateTime;

public class MainBuilder {
    public static void main(String[] args) {
        // 1. Instância com todos os atributos
        Relatorio relatorioCompleto = Relatorio.builder()
                .titulo("Relatório de Vendas - Setembro 2025")
                .autor("Sistema de BI")
                .dataGeracao(LocalDateTime.now())
                .dadosConteudo("Conteúdo detalhado das vendas do mês...")
                .publico(false)
                .build();

        System.out.println("Relatório Completo:");
        System.out.println(relatorioCompleto);

        System.out.println("\n--------------------\n");

        // 2. Instância apenas com título e conteúdo
        Relatorio relatorioSimples = Relatorio.builder()
                .titulo("Análise Rápida de Estoque")
                .dadosConteudo("Estoque atual: 1.500 unidades.")
                .build();
        
        System.out.println("Relatório Simples:");
        System.out.println(relatorioSimples);
    }
}