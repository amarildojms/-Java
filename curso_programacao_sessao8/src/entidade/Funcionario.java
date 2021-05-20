package entidade;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiq() {
		return salarioBruto - imposto;
	}
	
	public void aumentoSal(int aumento) {		
		salarioBruto += (0.01 * aumento) * salarioBruto;
	}
	
	public String toString() {
		return 	"DADOS DO FUNCION�RIO"
				+ "\nNome: "
				+ nome
				+ "\nSal�rio L�quido: "
				+ String.format("$ %.2f", salarioLiq());
	}

}
