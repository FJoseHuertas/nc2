package com.challenge.conversor;

import com.google.gson.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConvertirMonedas {
    private String trm;
    private String monedaAConvertir;
    private double valor;

    public ConvertirMonedas(String trm, String monedaAConvertir, double valor){
        this.monedaAConvertir = monedaAConvertir;
        this.trm = trm;
        this.valor = valor;
    }

    public void obtenerMonedas() throws IOException, InterruptedException {
        String url = "https://v6.exchangerate-api.com/v6/5acbdb9730fe3637ffd6dd37/pair/"
                + this.trm + "/" + monedaAConvertir + "/" + valor;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url)).build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        var json= response.body();
        JsonElement jsonElement = JsonParser.parseString(json);
        JsonObject jsonObject = jsonElement.getAsJsonObject();


        System.out.println(jsonObject.get("conversion_result").getAsString()
);


    }

}
