package br.fai.colection4;

public class Gato extends Animal{
	
	
	public Gato(){
		setCor("branco");
	}
	
	public Gato (String Cor) {
		setCor(Cor);
	}
	
	@Override
	public void som() {
		System.out.println("Gosto de miar");
	}
	
	public void oQueFacoDuranteANoite() {
		System.out.println("Gosto de pular a cerca todas as noites");
	}

}
