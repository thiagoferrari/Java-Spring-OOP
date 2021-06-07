package br.edu.fatecfranca.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// define que a classe Paciente relaciona-se com a collection paciente no Mongo
@Document(collection = "paciente")
public class Paciente {

	@Id // chave única o mongodb do tipo String
	private String id;

	private String nome;
	private float altura;
	private float peso;
	private int idade;

	public Paciente(String id, String nome, float altura, float peso, int idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		this.idade = idade;
	}

	public Paciente() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
