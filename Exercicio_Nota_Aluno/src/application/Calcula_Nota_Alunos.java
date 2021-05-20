package application;

import java.util.Locale;
import java.util.Scanner;

import entidade.Aluno;

public class Calcula_Nota_Alunos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno a = new Aluno();

		System.out.println("INFORME OS DADOS!!!");
		System.out.println();
		System.out.print("Nome: ");
		a.nome = sc.nextLine();
		System.out.print("Nota 1° Tri: ");
		a.nota1 = sc.nextDouble();
		System.out.print("Nota 2° Tri: ");
		a.nota2 = sc.nextDouble();
		System.out.print("Nota 3° Tri: ");
		a.nota3 = sc.nextDouble();

		System.out.println();
		System.out.println(a);

		sc.close();

	}

}
