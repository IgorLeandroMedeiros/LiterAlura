package br.com.literalura.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import br.com.literalura.model.LivroApi;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GutendexClient {

    private final HttpClient httpClient = HttpClient.newHttpClient();
    private final ObjectMapper objectMapper = new ObjectMapper();

    public LivroApi buscarLivroPorTitulo(String titulo) throws IOException, InterruptedException {
        String url = "https://gutendex.com/books/?search=" + titulo.replace(" ", "+");
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return objectMapper.readValue(response.body(), LivroApi.class);
    }
}

