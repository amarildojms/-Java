package entidades;

public class Funcionarios {
	
	private Integer cod;
	private String nome;
	private Double salario;
	
	public Funcionarios() {
		
	}
	
	public Funcionarios(Integer cod, String nome, Double salario) {
		this.cod = cod;
		this.nome = nome;
		this.salario = salario;
	}

	public int getCod() {
		return cod;
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
	
	public void aumentoSalario(double porcentagem) {
		salario += salario * porcentagem / 100;
	}
	
	@Override
	public String toString() {
		return "Código: "
				+ cod
				+" - Nome: "
				+ nome
				+" - Salário: "
				+ String.format("%.2f \n", salario);
	}
	

}
