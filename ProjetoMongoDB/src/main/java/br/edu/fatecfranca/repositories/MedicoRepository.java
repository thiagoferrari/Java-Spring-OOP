package br.edu.fatecfranca.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.fatecfranca.model.Medico;

public interface MedicoRepository extends MongoRepository<Medico, String> {

}
