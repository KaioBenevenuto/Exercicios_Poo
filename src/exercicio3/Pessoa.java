package exercicio3;

public class Pessoa {
	
	private String nome;
	private int idade;
	private boolean maiorIdade;
	
	//-----------------------------------------------------------------------------------------
	
	public void maioridade(int idade) {
		if (idade >= 18) {
			this.maiorIdade = true;
		}else {
			this.maiorIdade = false;
		}
	}
	
	//-----------------------------------------------------------------------------------------
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public boolean getMaiorIdade() {
		return maiorIdade;
	}
	
	public Pessoa() {
		setNome(null);
		setIdade(-1);
		this.maiorIdade = false;
	}
	
}
