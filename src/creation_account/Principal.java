package creation_account;

public class Principal extends Login {

	public static void main(String[] args) {

		Login l = new Login();
		l.logar();
		l.criarConta();
		l.logar();
	}

}
