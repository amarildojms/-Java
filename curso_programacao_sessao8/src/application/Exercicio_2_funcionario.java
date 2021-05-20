package application;

import java.util.Locale;
import java.util.Scanner;

import entidade.Funcionario;

public class Exercicio_2_funcionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario f = new Funcionario();
		
		System.out.println("Entre com os dados do Funcionário!");
		
		System.out.println();
		System.out.print("Nome: ");
		f.nome = sc.nextLine();
		System.out.print("Salário Bruto: ");
		f.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		f.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println(f);
		
		System.out.println();
		System.out.print("Informe o percentual de aumento recebido: ");
		int aumento = sc.nextInt();
		f.aumentoSal(aumento);
		
		System.out.println();
		System.out.println(f);
		
		sc.close();

	}

}
