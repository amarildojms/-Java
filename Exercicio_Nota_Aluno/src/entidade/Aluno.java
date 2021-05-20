package entidade;

public class Aluno {
	
	public String nome;
	public double nota1, nota2, nota3;
		
	public double notaFinal() {
		return nota1 + nota2 + nota3;		
		
	}
	
	
	public String status() {
		String situacao;
		
		if(notaFinal() >= 60) {
			situacao = "APROVADO";
		}else {
			situacao = "REPROVADO \nFaltaram "
			+ String.format("%.2f", (60-notaFinal()))
			+ " pontos";
		}
		
		return situacao;
		
	}
	
	
	
	
	public String toString() {
		return 	"Aluno: "
				+ nome
				+ "\nNota Final: "
				+ String.format("%.2f", notaFinal())
				+ "\n"
				+ status();
	}

}
