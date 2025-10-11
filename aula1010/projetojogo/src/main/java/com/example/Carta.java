package com.example;

public class Carta {
    
    private Naipe naipe;
    private Valor valor;

    public Carta(Naipe naipe, Valor valor){
        this.naipe = naipe;
        this.valor = valor;
    }
    
    public Valor getValor() {
        return valor;
    }
    public Naipe getNaipe() {
        return naipe;
    }   
    
    @Override
    public String toString() {
        return valor + " de " + naipe;
    }
}
