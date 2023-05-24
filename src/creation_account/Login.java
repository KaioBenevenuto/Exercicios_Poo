package creation_account;

import java.util.Random;
import java.util.Scanner;

public class Login implements Conta {

	private String email, senha, confirmSenha, nome;
	private int noBot, auxiliar;
	Scanner leia = new Scanner(System.in);

	// --------------------------------------------------------------------------------------------------------------------

	@Override
	public boolean confirm_Senha() {
		if (this.getSenha().equals(this.getConfirmSenha())) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean confirmNoBot(int auxiliar) {

		if (getNoBot() == auxiliar) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void logar() {
		String e = "", s = "";

		if (!getEmail().equals("")) {
			do {
				System.out.println("------------------------------Logar------------------------------");
				System.out.print("Digite seu email: ");
				e = leia.next();
				System.out.print("Digite sua senha: ");
				s = leia.next();
				if (e.equals(getEmail()) && (s.equals(getSenha()))) {
					System.out.println("Carregando...");
					System.out.println();
				} else {
					System.out.println("Email ou senha errada, tente novamente");
					System.out.println();
				}
			} while (!getEmail().equals(e) || !getSenha().equals(s));

		} else {
			System.out.println("Crie uma conta primeiro para logar");
		}
		System.out.println();
	}

	@Override
	public void criarConta() {

		do {
			System.out.println("---------------------------Criar conta---------------------------");
			System.out.print("Digite seu nome completo: ");
			setNome(leia.next());

			System.out.print("Digite seu email: ");
			setEmail(leia.next());
			System.out.println();

			System.out.print("Digite sua senha: ");
			setSenha(leia.next());

			System.out.print("Confirme sua senha: ");
			setConfirmSenha(leia.next());
			System.out.println();

			Random numAleatorio = new Random();
			auxiliar = numAleatorio.nextInt(99999 - 10000 + 1) + 10000;

			System.out.println("--------");
			System.out.println(auxiliar);
			System.out.println("--------");
			System.out.print("Prove que você não é um robô: ");
			setNoBot(leia.nextInt());

			confirmNoBot(auxiliar);
			if (confirmNoBot(auxiliar) == false || (confirm_Senha() == false)) {
				System.out.println();
				System.out.println("houve um erro, tente novamente.");
				System.out.println();
			}
		} while (confirm_Senha() == false || confirmNoBot(auxiliar) == false);
		System.out.println();
		System.out.println("Conta criada!!!");
		System.out.println();

	}

	// --------------------------------------------------------------------------------------------------------------------

	public Login() {
		setEmail("");
		setSenha("");
		setConfirmSenha("");
		setNome("");
		setNoBot(0);
		setAuxiliar(0);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConfirmSenha() {
		return confirmSenha;
	}

	public void setConfirmSenha(String confirmSenha) {
		this.confirmSenha = confirmSenha;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNoBot() {
		return noBot;
	}

	public void setNoBot(int noBot) {
		this.noBot = noBot;
	}

	public int getAuxiliar() {
		return auxiliar;
	}

	public void setAuxiliar(int auxiliar) {
		this.auxiliar = auxiliar;
	}

}
