package com.example;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Bola", 200, 2);
        ProdutoComLombok p2 = new ProdutoComLombok(2, "Bola2", 400, 4);
        System.out.println(p1);
        System.out.println(p2);
    }
}