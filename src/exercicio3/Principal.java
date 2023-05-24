package exercicio3;

import java.util.Scanner;

public class Principal extends Pessoa {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		Scanner l = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		p.setNome(l.next());
		System.out.print("Digite sua idade: ");
		p.setIdade(l.nextInt());
		p.maioridade(p.getIdade());
		System.out.println();
		
		System.out.println("--------------------");
		System.out.println("Nome: " + p.getNome());
		System.out.println("Idade: " + p.getIdade());
		System.out.println("Maior idade: " + p.getMaiorIdade());
		System.out.println("--------------------");
	}

}
