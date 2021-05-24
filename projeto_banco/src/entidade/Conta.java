package entidade;

public class Conta {
	
	private String cliente;
	private int conta;
	private double saldo;
		
	//Construtores
	public Conta() {
		
	}
		
	public Conta(String cliente, int conta, double depositoInicial) {
		this.cliente = cliente;
		this.conta = conta;
		deposito(depositoInicial);
	}
	
	public Conta(String cliente, int conta) {
		this.cliente = cliente;
		this.conta = conta;
	}
	
	
	//gets e sets
	public String getCliente() {
		return cliente;
	}	
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public int getConta() {
		return conta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
	
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor + 5.0;
	}
	
	
	
	public String toString() {
		return "Titular da conta: "
				+ getCliente()
				+ "  -  Nº da Conta: "
				+ getConta()
				+ "  -  Saldo: R$ "				
				+ String.format("%.2f", getSaldo());
	}
	
	

}
