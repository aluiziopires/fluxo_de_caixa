package entities5;

public class Contas_ano {

	private String mesC;
	private double valorPagoAno;

	public Contas_ano(String mesC, double valorPagoAno) {
		this.mesC = mesC;
		this.valorPagoAno = valorPagoAno;
	}

	public String getMesC() {
		return mesC;
	}

	public void setMesC(String mesC) {
		this.mesC = mesC;
	}

	public double getValorPagoAno() {
		return valorPagoAno;
	}

	public void setValorPagoAno(double valorPagoAno) {
		this.valorPagoAno = valorPagoAno;
	}
	
	
	
}
