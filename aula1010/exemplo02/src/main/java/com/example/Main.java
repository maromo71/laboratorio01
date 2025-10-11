package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Tereza");
        nomes.add("Paulo");
        nomes.add("Maria");
        nomes.add("Paulo");
        nomes.add("Oscar");
        System.out.println(nomes);
        System.out.println(nomes.get(2));
        nomes.remove(nomes.size()-1);
        System.out.println(nomes);
        nomes.remove("Paulo");
        System.out.println(nomes);
        nomes.set(0, "Juca");
        System.out.println(nomes);
        System.out.println("Posicao: " + nomes.indexOf("Paulo"));
        
    }
}