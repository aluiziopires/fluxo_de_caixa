package entities1;

public class Contas_semana {

	private String diaC;
	private double valorPago;
	
	public Contas_semana(String diaC, double valorPago) {
		this.diaC = diaC;
		this.valorPago = valorPago;
	}

	public String getDiaC() {
		return diaC;
	}

	public void setDiaC(String diaC) {
		this.diaC = diaC;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	
}