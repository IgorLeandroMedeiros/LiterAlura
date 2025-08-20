package br.com.literalura.entity;

import jakarta.persistence.*;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String idioma;
    private Integer numDownloads;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "autor_id")
    private Autor autor;

    public Livro() {}

    public Livro(String titulo, String idioma, Integer numDownloads, Autor autor) {
        this.titulo = titulo;
        this.idioma = idioma;
        this.numDownloads = numDownloads;
        this.autor = autor;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getIdioma() { return idioma; }
    public void setIdioma(String idioma) { this.idioma = idioma; }

    public Integer getNumDownloads() { return numDownloads; }
    public void setNumDownloads(Integer numDownloads) { this.numDownloads = numDownloads; }

    public Autor getAutor() { return autor; }
    public void setAutor(Autor autor) { this.autor = autor; }
}
