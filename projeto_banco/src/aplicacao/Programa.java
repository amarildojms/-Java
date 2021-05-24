package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Conta;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String cliente;
		int numeroConta;
		double depositoInicial = 0;
		char check;
		Conta dadosConta = new Conta();

		System.out.print("Informe o nome do Cliente: ");
		cliente = sc.nextLine();
		System.out.print("Informe o nº da Conta: ");
		numeroConta = sc.nextInt();	

		do {
			System.out.println();
			System.out.println("Deseja realizar um depósito inicial?");
			System.out.println("(S-SIM / N-NÃO)");
			check = sc.next().charAt(0);

			if (check == 's') {
				System.out.print("\nInforme o valor do depósito: ");
				depositoInicial = sc.nextDouble();
				dadosConta = new Conta(cliente, numeroConta, depositoInicial);
			}else
				if (check == 'n'){
				dadosConta = new Conta(cliente, numeroConta);
			}else
				if (check != 's' && check != 'n') {
				System.out.println();
				System.out.println("Opção inválida - Tente novamente!");
			}
		} while (check != 's' && check != 'n');

		System.out.println();
		System.out.print(dadosConta);

		do {
			System.out.println();
			System.out.println("\nO que deseja fazer agora???");
			System.out.println("(D-DEPÓSITO / S-SAQUE / F-FECHAR)");
			check = sc.next().charAt(0);

			if (check == 'd') {
				System.out.print("\nInforme o valor do depósito: ");
				double valorDep = sc.nextDouble();
				dadosConta.deposito(valorDep);
				System.out.println();
				System.out.println("Dados da conta Atualizados!!!");
				System.out.print(dadosConta);

			} else if (check == 's') {
				System.out.print("\nInforme o valor do saque: ");
				double valorDep = sc.nextDouble();
				dadosConta.saque(valorDep);

				System.out.println();
				System.out.println("Dados da conta Atualizados!!!");
				System.out.print(dadosConta);

			} else if (check != 'd' && check != 's' && check != 'f') {
				System.out.println();
				System.out.println("Opção inválida - Tente novamente!");
			}

		} while (check != 'f');		
		
		System.out.println();
		System.out.println("Concluído!");

		sc.close();

	}

}
