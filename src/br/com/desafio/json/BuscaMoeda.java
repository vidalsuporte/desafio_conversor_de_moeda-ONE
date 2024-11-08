package br.com.desafio.json;

import br.com.desafio.dto.DtoMoedaConsulta;
import br.com.desafio.modelo.ApiKey;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaMoeda {


    String url = "https://v6.exchangerate-api.com/v6/b28d5bc8a7d09335dfdec12b/latest/";
    Gson gson = new Gson();
    public void buscaMoeda(String moeda) throws IOException, InterruptedException {
        url += moeda;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url)).
                build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        System.out.println("--------------------");
        DtoMoedaConsulta dtoMoedaConsulta = gson.fromJson(response.body(), DtoMoedaConsulta.class);

        System.out.println(dtoMoedaConsulta);








    }







}
