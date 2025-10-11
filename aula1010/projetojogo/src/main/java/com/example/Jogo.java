package com.example;

public class Jogo {
    public static void main(String[] args) {
        System.out.println("Mostrando o novo baralho: ");
        Baralho baralho = new Baralho();
        System.out.println(baralho.toString());
        baralho.embaralhar();
        Carta carta1 = baralho.retirarCarta();
        Carta carta2 = baralho.retirarCarta();
        System.out.println("Jogador 1 retirou a carta: " + carta1);
        System.out.println("Jogador 2 retirou a carta: " + carta2);
        
        if(carta1.getValor().ordinal() > carta2.getValor().ordinal()){
            System.out.println("Jogador 1 ganhou!");
        } else if(carta2.getValor().ordinal() > carta1.getValor().ordinal()){
            System.out.println("Jogador 2 ganhou!");
        } else {
            if(carta1.getNaipe().ordinal() > carta2.getNaipe().ordinal()){
                System.out.println("Jogador 1 ganhou!");
            } else{
                System.out.println("Jogador 2 ganhou!");
            }
        }

    }
}