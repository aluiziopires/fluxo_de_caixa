package entities2;

public class Receber_semana {

	private String diaR;
	private double valorRecebido;
	
	public Receber_semana(String diaR, double valorRecebido) {
		this.diaR = diaR;
		this.valorRecebido = valorRecebido;
	}

	public String getDiaR() {
		return diaR;
	}

	public void setDiaR(String diaR) {
		this.diaR = diaR;
	}

	public double getValorRecebido() {
		return valorRecebido;
	}

	public void setValorRecebido(double valorRecebido) {
		this.valorRecebido = valorRecebido;
	}
	
}
