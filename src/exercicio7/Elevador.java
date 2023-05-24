package exercicio7;

public class Elevador {

	private int andarAtual, totAndar, capacidadeElevador, pessoasPresentes;
	
	//---------------------------------------------------------------------------------------------------
	
	public void entrar() {
		if(getPessoasPresentes() < getCapacidadeElevador()) {
			setPessoasPresentes(getPessoasPresentes() + 1);
		}else {
			System.out.println("Limite de capacidade atingido");
		}
	}
	public void sair() {
		if(getPessoasPresentes() > 0) {
			setPessoasPresentes(getPessoasPresentes() - 1);
		}else {
			System.out.println("Erro...Impossível um pessoa sair, se ninguém estiver no elevador");
		}
	}
	public void subir(){
		if(getAndarAtual() < getTotAndar()) {
			setAndarAtual(getAndarAtual() + 1);
		}else {
			System.out.println("Erro...Impossível subir");
		}
	}
	public void descer() {
		if(getAndarAtual() > 0) {
			setAndarAtual(getAndarAtual() - 1);
		}else {
			System.out.println("Erro...Impossível descer");
		}
	}
	
	//---------------------------------------------------------------------------------------------------
	
	public Elevador(int capacidadeElevador, int totAndar){
		this.setCapacidadeElevador(capacidadeElevador);
		this.setTotAndar(totAndar);
		this.setAndarAtual(0);
		this.setPessoasPresentes(0);
	}
	public Elevador() {
		
	}

	
	public int getTotAndar() {
		return totAndar;
	}
	public void setTotAndar(int totAndar) {
		this.totAndar = totAndar;
	}

	
	public int getCapacidadeElevador() {
		return capacidadeElevador;
	}
	public void setCapacidadeElevador(int capacidadeElevador) {
		this.capacidadeElevador = capacidadeElevador;
	}


	public int getPessoasPresentes() {
		return pessoasPresentes;
	}
	public void setPessoasPresentes(int pessoa) {
		this.pessoasPresentes = pessoa;
	}

	
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

}
