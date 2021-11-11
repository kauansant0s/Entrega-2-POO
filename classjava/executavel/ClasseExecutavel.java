package classjava.executavel;

import classes.java.Jogador;
import javax.swing.JOptionPane;
import classes.java.JogadoresTimes;
import classesauxiliares.FuncaoAutenticar;

public class ClasseExecutavel {

	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Login: ");
		String senha = JOptionPane.showInputDialog("Senha: ");
		
		if(new FuncaoAutenticar(new JogadoresTimes(login, senha)).autenticarAcesso()) {
			JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
		}else {
			JOptionPane.showMessageDialog(null, "ACESSO NEGADO");
		}
		
		
		String nome = JOptionPane.showInputDialog("Qual o nome do jogador?");
		String idade = JOptionPane.showInputDialog("Qual a idade do jogador?");
		String nacionalidade = JOptionPane.showInputDialog("Qual a nacionalidade do jogador?");
		String posicoes = JOptionPane.showInputDialog("Quais posições o jogador joga?");
		String timeOrigem = JOptionPane.showInputDialog("De que time o jogador veio?");
		String timeDestino = JOptionPane.showInputDialog("Para que time o jogador foi?");
		String valor = JOptionPane.showInputDialog("Qual o valor da transferência? (em milhões de Euros)");
		
		Jogador jogador = new Jogador();
		
		jogador.setNome(nome);
		jogador.setIdade(Integer.parseInt(idade));
		jogador.setNacionalidade(nacionalidade);
		jogador.setPosicoes(posicoes);
		jogador.getTransferencia().setValor(Double.parseDouble(valor));
		jogador.getTransferencia().setTimeOrigem(timeOrigem);
		jogador.getTransferencia().setTimeDestino(timeDestino);
				
		
		for (int jog = 1; jog <= 5; jog++) {
			String jogadores = JOptionPane.showInputDialog("Atualize a lista dos 5 jogadores mais recentes do clube, Jogador "+jog+":");
			
			JogadoresTimes jogadore = new JogadoresTimes();
			
			jogadore.setJogadores(jogadores);
			
			jogador.getJogadorTimes().add(jogadore);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover algum jogador?");
		
		if (escolha == 0) {
			int continuarRemover = 0;
			int posicao = 1;
			
			while (continuarRemover == 0) {
					String jogadorRemover = JOptionPane.showInputDialog("Qual jogador (1, 2, 3, 4 ou 5)?");
					
					jogador.getJogadorTimes().remove(Integer.parseInt(jogadorRemover)-posicao);
					posicao++;
					
					continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja remover outro jogador?");
				}
		}		
		System.out.println(jogador.toString());
	}
}
