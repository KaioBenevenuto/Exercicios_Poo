package exercicio5;

public class Analista implements Funcionario {

	@Override
	public double salario(double s) {
		s = s * 5;
		return s;
	}

}
