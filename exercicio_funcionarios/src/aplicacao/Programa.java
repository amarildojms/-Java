package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionarios;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Quantos Funcion�rios deseja cadastrar? ");
		int qtd = sc.nextInt();
		
		List <Funcionarios> list = new ArrayList<>();
				
		for (int i=0; i<qtd; i++) {
						
			System.out.println();
			System.out.println("Entre com os dados do " + (i+1) + "� Funcion�rio.");
			System.out.print("C�digo: ");
			Integer cod = sc.nextInt();
			
			while (codExistente(list, cod)) {
				System.out.println();
				System.out.println("Este c�digo j� existe! Tente novamente");
				System.out.print("C�digo: ");
				cod = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();			
			System.out.print("Sal�rio: ");
			Double salario = sc.nextDouble();
			
			Funcionarios func = new Funcionarios(cod, nome, salario);
			
			list.add(func);
		}
		
		System.out.println();
		System.out.print("Informe o c�digo do Funcion�rio que receber� o aumento: ");
		int codAumento = sc.nextInt();
				
		Integer pos = posicao(list, codAumento);
		
		if (pos == null) {			
			System.out.println("O c�digo informado n�o existe!");
		}else {
						
			System.out.print("Informe a porcentagem: ");
			double porcentagem = sc.nextDouble();
			
			list.get(pos).aumentoSalario(porcentagem);
		}
		
		System.out.println();
		System.out.println("Lista de Funcion�rio");
		for (Funcionarios func : list) {
			System.out.println(func);
		}		
		
		sc.close();

	}
	
	public static Integer posicao(List<Funcionarios> list, int cod) {
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getCod() == cod) {
				return i;
			}			
		}
		return null;
	}
	
	public static boolean codExistente(List<Funcionarios> list, int cod) {
		Funcionarios func = list.stream().filter(x -> x.getCod() == cod).findFirst().orElse(null);
		return func != null;
	}

}
