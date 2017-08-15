package br.com.heiderlopes.notepadsaas.repository;

import br.com.heiderlopes.notepadsaas.model.Nota;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotaRepository extends MongoRepository<Nota, String> {

    List<Nota> findByTitulo(String titulo);

}
