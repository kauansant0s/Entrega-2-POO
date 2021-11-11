package classes.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Jogador extends Pessoa {
	
	private Transferencia transferencia = new Transferencia();
	private List<JogadoresTimes> jogadorTimes = new ArrayList<JogadoresTimes>();

	
	public Jogador() {
		
	}
	public List<JogadoresTimes> getJogadorTimes() {
		return jogadorTimes;
	}

	public void setJogadorTimes(List<JogadoresTimes> jogadorTimes) {
		this.jogadorTimes = jogadorTimes;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		super.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		super.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		super.idade = idade;
	}
	public String getPosicoes() {
		return posicoes;
	}
	public void setPosicoes(String posicoes) {
		super.posicoes = posicoes;
	}
	public Transferencia getTransferencia() {
		return transferencia;
	}
	public void setTransferencia(Transferencia transferencia) {
		this.transferencia = transferencia;
	}
	
	@Override
	public String toString() {
		return "Transferência confirmada. (Nome: " + nome + "; Nacionalidade: " + nacionalidade + "; Idade: "
				+ idade + "; Posições: " + posicoes + transferencia + ")" + "\n" + jogadorTimes;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idade, nacionalidade, nome, posicoes, transferencia);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogador other = (Jogador) obj;
		return idade == other.idade && Objects.equals(nacionalidade, other.nacionalidade)
				&& Objects.equals(nome, other.nome) && Objects.equals(posicoes, other.posicoes)
				&& Objects.equals(transferencia, other.transferencia);
	}

	
}