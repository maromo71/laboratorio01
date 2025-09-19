package br.santalucia.model;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int ano;

}