package br.com.desafio.principal;

import br.com.desafio.json.BuscaMoeda;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BuscaMoeda buscaMoeda = new BuscaMoeda();
        try {
            buscaMoeda.buscaMoeda("USD");


        } catch (IOException e) {
            throw new RuntimeException(e);

        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
        }


    }

}