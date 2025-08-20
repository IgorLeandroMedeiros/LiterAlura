package br.com.literalura.repository;

import br.com.literalura.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

    List<Livro> findByIdioma(String idioma);
    List<Livro> findByTituloContainingIgnoreCase(String titulo);
}
