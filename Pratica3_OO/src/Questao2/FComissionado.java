package Questao2;

public class FComissionado extends Funcionario {
	private double percentual;
	private double vendas;
	public double CalcularProventos;
	
	public FComissionado(int matricula, String nome, double salario, double calcularProventos, String toString,
			double percentual, double vendas, double calcularProventos2) {
		super(matricula, nome, salario, calcularProventos, toString);
		this.percentual = percentual;
		this.vendas = vendas;
		CalcularProventos = calcularProventos2;
	}

	public double getPercentual() {
		return percentual;
	}

	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}

	public double getVendas() {
		return vendas;
	}

	public void setVendas(double vendas) {
		this.vendas = vendas;
	}

	public double getCalcularProventos() {
		return CalcularProventos;
	}

	public void setCalcularProventos(double calcularProventos) {
		CalcularProventos = calcularProventos;
	}
	
	

	
}
