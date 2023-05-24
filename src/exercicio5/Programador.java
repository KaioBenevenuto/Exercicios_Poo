package exercicio5;

public class Programador implements Funcionario {

	@Override
	public double salario(double s) {
		s = s * 3;
		return s;
	}

}
