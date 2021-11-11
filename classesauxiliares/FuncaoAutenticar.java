package classesauxiliares;

import interfaces.PermitirAcesso;

public class FuncaoAutenticar {
	
	private PermitirAcesso permitirAcesso;
	
	public FuncaoAutenticar(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
	
	public boolean autenticarAcesso() {
		return permitirAcesso.autenticar();
	}
	

}
