package classes.java;

import java.util.Objects;

public class Transferencia {
	
	private String timeOrigem;
	private String timeDestino;
	private double valor;
	
	public Transferencia () {
		
	}
	public String getTimeOrigem() {
		return timeOrigem;
	}
	public void setTimeOrigem(String timeOrigem) {
		this.timeOrigem = timeOrigem;
	}
	public String getTimeDestino() {
		return timeDestino;
	}
	public void setTimeDestino(String timeDestino) {
		this.timeDestino = timeDestino;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "; \nTime de origem: " + timeOrigem + "; Time de destino: " + timeDestino + 
				"; Valor (em euros): " + valor + "M";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(timeDestino, timeOrigem, valor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transferencia other = (Transferencia) obj;
		return Objects.equals(timeDestino, other.timeDestino) && Objects.equals(timeOrigem, other.timeOrigem)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
}
