package br.edu.fatecfranca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.model.Paciente;
import br.edu.fatecfranca.repositories.PacienteRepository;

@RestController
public class PacienteController {

	// injeção de dependência - java spring
	// executar métodos de uma classe sem instanciá-la
	@Autowired
	PacienteRepository injecao;

	// insere no banco de dados um paciente
	// recebe o conteúdo da requisição e insere
	@PostMapping("/paciente")
	public String insere(@RequestBody Paciente paciente) {
		injecao.save(paciente);
		return "Inserção realizada com sucesso";

	}

	// consulta no banco de dados todos os pacientes
	@GetMapping("/paciente")
	public List<Paciente> get() {
		return injecao.findAll();

	}
}