package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class ProdutoComLombok {
    private long id;
    private String nome;
    private double preco;
    private int estoque;

}
