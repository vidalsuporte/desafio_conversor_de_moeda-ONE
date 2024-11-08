package br.com.desafio.modelo;

import com.google.gson.annotations.SerializedName;

public class Moedas
{
    @SerializedName("BRL")
    private Double brl ;
    @SerializedName("USD")
    private Double usd;
    private Double ARS;
    private Double RUB;


    @Override
    public String toString() {
        return "Moedas{" +
                "BRL=" + brl +
                ", USD=" + usd  +
                ", ARS=" + ARS  %2f+
                ", RUB=" + RUB %2f +
                '}';
    }
}
