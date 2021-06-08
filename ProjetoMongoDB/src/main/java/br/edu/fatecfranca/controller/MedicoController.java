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

import br.edu.fatecfranca.model.Medico;
import br.edu.fatecfranca.repositories.MedicoRepository;

@RestController
public class MedicoController {

	@Autowired
	MedicoRepository injecao;

	// (POST) POSTAR no banco de dados um medico
	// recebe o conteúdo da requisição e insere
	@PostMapping("/medico")
	public String insere(@RequestBody Medico medico) {
		injecao.save(medico);
		return "Inserção realizada com sucesso";
	}

	// (GET) PEGAR/consultar no banco todos os medicos
	@GetMapping("/medico")
	public List<Medico> get() {
		return injecao.findAll();
	}

	// (GET) PEGAR/consultar no banco de dados todos os medicos
	// (localhost:8080/medico/id)
	@GetMapping("/medico/{id}")
	public Optional<Medico> getById(@PathVariable String id) {
		return injecao.findById(id);
	}

	// (DELETE) deleta do banco um medico pelo id
	// (localhost:8080/medico/id)
	@DeleteMapping("medico/{id}") // variável {id}
	public String remove(@PathVariable String id) {
		injecao.deleteById(id);
		return "medico deletado com sucesso";
	}

	// (PUT) UPDATE no banco de um medico
	@PutMapping("/medico")
	public String atualiza(@RequestBody Medico medico) {
		injecao.save(medico); // atualiza caaso já tenha medico com id informado
		return "Atualização realizada com pacinte";
	}

}
