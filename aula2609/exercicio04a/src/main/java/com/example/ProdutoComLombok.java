package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Gera getters, setters, toString, equals, hashCode
@AllArgsConstructor // Gera um construtor com todos os argumentos
@NoArgsConstructor // Gera um construtor sem argumentos
public class ProdutoComLombok {
    private long id;
    private String nome;
    private double preco;
    private int estoque;
}