package br.edu.fatecfranca.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.fatecfranca.model.Paciente;

// a interface vai herdar MongoRepository
public interface PacienteRepository extends MongoRepository<Paciente, String> {

	// herdou: save, find, remove, update

}
