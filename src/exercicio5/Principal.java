package exercicio5;

import java.util.Scanner;

public class Principal {
		
	public static void main(String[] args) {
		
		double salarioP, salarioA;
		
		Analista a = new Analista();
		Programador p = new Programador();
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o salario de um programador: ");
		salarioP = leia.nextDouble();
		p.salario(salarioP);
		System.out.print("Digite o salario de um Analista: ");
		salarioA = leia.nextDouble();
		a.salario(salarioA);
		System.out.println();
		
		System.out.println("------Programador------");
		System.out.println("Salário: " + p.salario(salarioP));
		System.out.println("-------Analista--------");
		System.out.println("Salário: " + a.salario(salarioA));
		
	}

}
