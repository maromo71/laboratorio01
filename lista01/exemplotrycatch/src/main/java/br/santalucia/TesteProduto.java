package br.santalucia;

public class TesteProduto {
    public static void main(String[] args) throws Exception {
        Produto p = new Produto();
        p.setCodigo(1);
        p.setDescricao("Computador");
        try{
            p.registrarEntrada(500);
            //Tente executar com um valor maior que 500.
            p.registrarSaida(498);
            //Repita a execução mudando para um valor menor que 500.
        }catch(Exception ex){
            System.out.println("Erro: " + ex.getMessage());
        }
        
        System.out.println(p);
    }
}