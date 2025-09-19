package br.santalucia;


public class Produto {
    private int codigo;
    private String descricao;
    private double preco;
    private int quantidade;

    public int getCodigo() {
        return codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public double getPreco() {
        return preco;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void registrarEntrada(int qtd) throws IllegalArgumentException {
        if(qtd<=0){
            throw new IllegalArgumentException("Quantidade inválida");
        }
        this.quantidade+=qtd;
    }
    public void registrarSaida(int qtd) throws IllegalArgumentException{
        if(qtd>quantidade){
            throw new IllegalArgumentException(
                "Quantidade inválida");
        }
        this.quantidade-=qtd;
    }
    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }


}
