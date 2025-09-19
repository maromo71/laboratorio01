package br.santalucia.model;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Cliente {
    private int codigo;
    private String nome;
    private String telefone;
    private String email;
    private List<Carro> carros = new ArrayList<>();
}
