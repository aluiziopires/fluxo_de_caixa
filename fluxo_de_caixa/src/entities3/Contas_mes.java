package entities3;

public class Contas_mes {

	private String dataC;
	private double valorPagoMes;
	
	public Contas_mes(String dataC, double valorPagoMes) {
		this.dataC = dataC;
		this.valorPagoMes = valorPagoMes;
	}

	public String getDataC() {
		return dataC;
	}

	public void setDataC(String dataC) {
		this.dataC = dataC;
	}

	public double getValorPagoMes() {
		return valorPagoMes;
	}

	public void setValorPagoMes(double valorPagoMes) {
		this.valorPagoMes = valorPagoMes;
	}
	
		
	
}
