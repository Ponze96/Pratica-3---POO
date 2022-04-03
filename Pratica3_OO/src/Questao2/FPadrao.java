package Questao2;

public class FPadrao extends Funcionario {

	public double CalcularProventos;

	public FPadrao(int matricula, String nome, double salario, double calcularProventos, String toString,
			double calcularProventos2) {
		super(matricula, nome, salario, calcularProventos, toString);
		CalcularProventos = calcularProventos2;
	}

	public double getCalcularProventos() {
		return CalcularProventos;
	}

	public void setCalcularProventos(double calcularProventos) {
		CalcularProventos = calcularProventos;
	}
	
}
