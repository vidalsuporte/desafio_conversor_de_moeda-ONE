package br.com.desafio.modelo;

import com.google.gson.annotations.SerializedName;

public class Moedas
{
    @SerializedName("ARS")
    private Double ars;
    @SerializedName("BRL")
    private Double brl ;
    @SerializedName("BOB")
    private  Double bob;
    @SerializedName("CAD")
    private  Double cad;
    @SerializedName("CLP")
    private Double clp;
    @SerializedName("EUR")
    private Double eur;
    @SerializedName("JPY")
    private Double jpy;
    @SerializedName("MXN")
    private Double mxn;
    @SerializedName("RUB")
    private Double rub;
    @SerializedName("USD")
    private Double usd;



    @Override
    public String toString() {
        return "Moedas{" +
                "ars= ₱ " + String.format("%.2f",ars) +
                ", brl= R$ " + String.format("%.2f", brl) +
                ", bob= Bs.F " + String.format("%.2f", bob) +
                ", cad= C$ " + String.format("%.2f", cad) +
                ", clp= CLP$ " + String.format("%.2f", clp) +
                ", eur= € " + String.format("%.2f", eur) +
                ", jpy= ¥ "+ String.format("%.2f", jpy) +
                ", mxn= ₱ " + String.format("%.2f", mxn) +
                ", rub= ₽ " + String.format("%.2f", rub) +
                ", usd= $" + String.format("%.2f", usd) +
                '}';
    }
}
