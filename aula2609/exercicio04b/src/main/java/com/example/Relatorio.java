package com.example;

import lombok.Builder;
import lombok.ToString;

import java.time.LocalDateTime;

@Builder
@ToString // Imprimir o objeto
public class Relatorio {
    private String titulo;
    private String autor;
    private LocalDateTime dataGeracao;
    private String dadosConteudo;
    private boolean publico;
}