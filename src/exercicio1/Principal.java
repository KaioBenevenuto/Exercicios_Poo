package exercicio1;

import java.util.Scanner;

public class Principal extends Calculos {
	
	public static void main(String[] args) {
		
		double v1, v2;
		
		Scanner leia = new Scanner(System.in);
		Calculos calculos = new Calculos();
		
		System.out.print("Digite um valor: ");
		v1 = leia.nextDouble();
		System.out.print("Digite outro valor: ");
		v2 = leia.nextDouble();
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("A soma desses valores: " + calculos.soma(v1, v2));
		System.out.println("A subtração desses valores: " + calculos.subtracao(v1, v2));
		System.out.println("A multiplicação desses valores: " + calculos.multiplicacao(v1, v2));
		System.out.println("A divisão desses valores: " + calculos.divisao(v1, v2));
		System.out.println("------------------------------------------------------------------------------");
	
		System.out.println("Hellow World");
	}
	
	
}
