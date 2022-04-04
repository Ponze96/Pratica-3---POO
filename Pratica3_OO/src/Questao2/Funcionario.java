package Questao2;

public abstract class Funcionario {
	private int matricula;
	private String nome;
	private double salario;
	public 	double CalcularProventos;
	public String toString;
	
	
	public Funcionario(int matricula, String nome, double salario, double calcularProventos, String toString) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
		CalcularProventos = calcularProventos;
		this.toString = toString;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public double getCalcularProventos() {
		return CalcularProventos;
	}


	public void setCalcularProventos(double calcularProventos) {
		CalcularProventos = calcularProventos;
	}


	public String getToString() {
		return toString;
	}


	public void setToString(String toString) {
		this.toString = toString;
	}

		
	
	
}
