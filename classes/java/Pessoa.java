package classes.java;

public abstract class Pessoa {

	protected String nome;
	protected String nacionalidade;
	protected int idade;
	protected String posicoes;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getPosicoes() {
		return posicoes;
	}
	public void setPosicoes(String posicoes) {
		this.posicoes = posicoes;
	}
	
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", nacionalidade=" + nacionalidade + ", idade=" + idade + ", posicoes="
				+ posicoes + "]";
	}
	
}
