package exercicio6;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa p[] = new Pessoa[3];
		
		p[0] = new Pessoa("Cleitin", "M", 18);
		p[1] = new Pessoa("Jubileu", "M", 40);
		p[2] = new Pessoa("Fernanda", "F", 25);
		
		for(int cont = 0; cont < p.length; cont++) {
			System.out.println("------------------------------");
			System.out.println("Nome: " + p[cont].nome);
			System.out.println("Sexo: " + p[cont].sexo);
			System.out.println("Idade: " + p[cont].idade);
		}
	}

}
