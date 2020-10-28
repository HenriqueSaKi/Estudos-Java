package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student aluno = new Student();
		Double notaCorte;
		
		System.out.print("Qual é a nota de corte? ");
		notaCorte = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Nome do Aluno: ");
		aluno.nome = sc.nextLine();
		
		System.out.print("Nota 1: ");
		aluno.nota1 = sc.nextDouble();
		
		System.out.print("Nota 2: ");
		aluno.nota2 = sc.nextDouble();
		
		System.out.print("Nota 3: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.println("Notal Final: " + aluno.media());
		
		aluno.verificaAprovacao(notaCorte);
		
		sc.close();
	}

}
