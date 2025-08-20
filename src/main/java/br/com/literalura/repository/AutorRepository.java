package br.com.literalura.repository;

import br.com.literalura.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {

    List<Autor> findByAnoNascimentoLessThanEqualAndAnoFalecimentoGreaterThanEqual(Integer ano, Integer ano2);
}
