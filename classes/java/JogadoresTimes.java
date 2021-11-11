package classes.java;

import java.util.Objects;

import interfaces.PermitirAcesso;

public class JogadoresTimes implements PermitirAcesso {
	
	private String jogadores;
	private String login, senha;
	
	public JogadoresTimes(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	public JogadoresTimes() {
		
	}
	public String getJogadores() {
		return jogadores;
	}
	public void setJogadores(String jogadores) {
		this.jogadores = jogadores;
	}
	
	
	@Override
	public String toString() {
		return "Jogadores mais recentes do clube (Jogadores: " + jogadores + ")";
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(jogadores);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JogadoresTimes other = (JogadoresTimes) obj;
		return Objects.equals(jogadores, other.jogadores);
	}
	
	
	@Override
	public boolean autenticar() {

		return login.equals("admin") && senha.equals("admin");
	}
	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		
		return autenticar();
	}
	
	
}
