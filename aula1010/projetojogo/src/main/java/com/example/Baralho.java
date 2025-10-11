package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas = new ArrayList<>();

    public Baralho(){
        //montar as 52 cartas
        for(Naipe naipe : Naipe.values()){
            for(Valor valor : Valor.values()){
                cartas.add(new Carta(naipe, valor));
            }
        }    
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Carta carta : cartas){
            sb.append(carta.toString());
            sb.append("\n");
        }
        return sb.toString(); //Retornando todo o texto
    }

    public void embaralhar(){
        Collections.shuffle(cartas);
    }

    public Carta retirarCarta(){
        return cartas.remove(0);
    }
}
