package Questao2;

public class FProdutividade extends Funcionario {

	private double valor;
	private int producao;
	public double calcularProventos;
	
	public FProdutividade(int matricula, String nome, double salario, double calcularProventos, String toString,
			double valor, int producao, double calcularProventos2) {
		super(matricula, nome, salario, calcularProventos, toString);
		this.valor = valor;
		this.producao = producao;
		calcularProventos = calcularProventos2;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getProducao() {
		return producao;
	}

	public void setProducao(int producao) {
		this.producao = producao;
	}

	public double getCalcularProventos() {
		return calcularProventos;
	}

	public void setCalcularProventos(double calcularProventos) {
		this.calcularProventos = calcularProventos;
	}
	
	
	
	
	
	
	
	
	
}

