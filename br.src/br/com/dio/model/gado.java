package br.com.dio.model;

import java.util.Objects;

public class gado {

	private String name;
	private String idade;
	private String cor;
	
	
	public gado(String name, String idade, String cor) {
		this.name = name;
		this.idade = idade;
		this.cor = cor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		gado other = (gado) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "gado [name=" + name + ", idade=" + idade + ", cor=" + cor + "]";
	}

	/*public gado(String name,String idade,String cor) {
		this.cor = cor
		*/
	}
