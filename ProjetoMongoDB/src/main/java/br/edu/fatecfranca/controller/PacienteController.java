package br.edu.fatecfranca.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	// (POST) POSTAR no banco de dados um paciente
	// recebe o conteúdo da requisição e insere
	@PostMapping("/paciente")
	public String insere(@RequestBody Paciente paciente) {
		injecao.save(paciente);
		return "Inserção realizada com sucesso";
	}

	// (GET) PEGAR/consultar no banco todos os pacientes
	@GetMapping("/paciente")
	public List<Paciente> get() {
		return injecao.findAll();
	}

	// (GET) PEGAR/consultar no banco de dados todos os pacientes
	// (localhost:8080/paciente/id)
	@GetMapping("/paciente/{id}")
	public Optional<Paciente> getById(@PathVariable String id) {
		return injecao.findById(id);
	}

	// (DELETE) deleta do banco um paciente pelo id
	// (localhost:8080/paciente/id)
	@DeleteMapping("paciente/{id}") // variável {id}
	public String remove(@PathVariable String id) {
		injecao.deleteById(id);
		return "paciente deletado com sucesso";
	}

	// (PUT) UPDATE no banco de um paciente
	@PutMapping("/paciente")
	public String atualiza(@RequestBody Paciente paciente) {
		injecao.save(paciente); // atualiza caaso já tenha paciente com id informado
		return "Atualização realizada com pacinte";
	}

}
