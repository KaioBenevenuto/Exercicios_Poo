package exercicio4;

import java.util.Scanner;

public class Principal extends Funcionario{

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		f.nome = leia.next();
		System.out.print("Digite sua idade: ");
		f.idade = leia.nextInt();
		System.out.print("Digite seu cargo: ");
		f.cargo = leia.next();
		System.out.print("Digite seu setor: ");
		f.setor = leia.next();
		
		System.out.println("----------------------");
		System.out.println("Nome: " + f.nome);
		System.out.println("Idade: " + f.idade);
		System.out.println("Cargo: " + f.cargo);
		System.out.println("Setor: " + f.setor);
		System.out.println("----------------------");
		
	}

}
