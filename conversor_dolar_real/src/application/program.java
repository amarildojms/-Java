package application;

import java.util.Locale;
import java.util.Scanner;

import util.Conversor;

public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("CONVERSOR DE MOÉDA");
		System.out.println();
		System.out.print("Informe a cotação do Dolar: ");
		double cotacao = sc.nextDouble();
		System.out.print("Informe a quantidade que deseja comprar em Dolar: ");
		double quantidade = sc.nextDouble();

		System.out.printf("Valor total a pagar em Reais: %.2f", Conversor.calc(cotacao, quantidade));

		sc.close();

	}

}
