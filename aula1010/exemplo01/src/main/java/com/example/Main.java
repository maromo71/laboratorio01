package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(15); //processo de passar um int para integer
        //chamamos autoboxing
        numeros.add(21);
        numeros.add(10);
        numeros.add(15);
        System.out.println("Lista Original de numeros: ");
        for(int x : numeros){
            //em cada passagem faz um auto-unboxing
            System.out.println(x);
        }
        Collections.sort(numeros);
        System.out.println("Lista ordenada de numeros: ");
        for(int x : numeros){
            System.out.println(x);
        }
        Collections.reverse(numeros);
        System.out.println("Lista invertida de numeros: ");
        for(int x : numeros){
            System.out.println(x);
        }

    }
}