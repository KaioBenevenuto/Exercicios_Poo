package exercicio7;

public class Principal extends Elevador {


	public static void main(String[] args) {
		
		Elevador e = new Elevador(5, 3);
		
		e.sair();
		e.descer();
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Total de andar: " + e.getTotAndar());
		if(e.getAndarAtual() == 0) {
			System.out.println("Andar atual: Terreo");
		}else {
			System.out.println("Andar atual: " + e.getAndarAtual());
		}
		System.out.println("Capacidade do elevador: "+ e.getCapacidadeElevador() + " Pessoas");
		System.out.println("Quantidade de pessoas no elevador: " + e.getPessoasPresentes());
		System.out.println("---------------------------------------------------------------------");
	}

}
