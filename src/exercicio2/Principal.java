package exercicio2;

import java.util.Scanner;

public class Principal extends Matematica {

	public static void main(String[] args) {
		
		Matematica m = new Matematica();
		Scanner leia = new Scanner(System.in);
			
		double v1D, v2D;
		int v1I, v2I;
		int []valor = new int[4];
		
		//Recebe dois valores do tipo double e retorna um resultado do tipo double.
		System.out.print("Digite um valor: ");
		v1D = leia.nextDouble();
		System.out.print("Digite um valor: ");
		v2D = leia.nextDouble();
		System.out.println("Soma: "+m.soma(v1D, v2D));
		System.out.println("Subtração: "+m.subtracao(v1D, v2D));
		System.out.println("=========================================================");
		
		//Recebe dois valores do tipo int e retorna um resultado do tipo int.
		System.out.print("Digite um valor: ");
		v1I = leia.nextInt();
		System.out.print("Digite um valor: ");
		v2I = leia.nextInt();
		System.out.println("Soma: " + m.soma(v1I, v2I));
		System.out.println("Subtração: " + m.subtracao(v1I, v2I));
		System.out.println("=========================================================");
		
		//Recebe quatro valores do tipo int e retorna um resultado do tipo int(usando array).
		for (int cont = 0; cont < valor.length; cont++) {
			System.out.print("Digite um valor: ");
				valor[cont] = leia.nextInt();
		}
		System.out.println("Soma: "+m.soma(valor[0], valor[1], valor[2], valor[3]));
		System.out.println("Subtração: "+m.subtracao(valor[0], valor[1], valor[2], valor[3]));
		
	}

}
