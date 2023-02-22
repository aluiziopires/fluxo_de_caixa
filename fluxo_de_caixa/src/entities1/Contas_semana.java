package entities1;

public class Contas_semana {

	private String dia;
	private double valorPago;
	
	public Contas_semana(String dia, double valorPago) {
		this.dia = dia;
		this.valorPago = valorPago;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
		
}
