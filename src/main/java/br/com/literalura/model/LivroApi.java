package br.com.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LivroApi {

    private String title;

    @JsonAlias("authors")
    private List<AutorApi> autores;

    @JsonAlias("languages")
    private List<String> idiomas;

    @JsonAlias("download_count")
    private int downloads;

    // Getters e Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public List<AutorApi> getAutores() { return autores; }
    public void setAutores(List<AutorApi> autores) { this.autores = autores; }

    public List<String> getIdiomas() { return idiomas; }
    public void setIdiomas(List<String> idiomas) { this.idiomas = idiomas; }

    public int getDownloads() { return downloads; }
    public void setDownloads(int downloads) { this.downloads = downloads; }
}
