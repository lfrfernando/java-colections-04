package br.fai.colection4;

public class Cachorro extends Animal{
	
	public Cachorro (String nome){
		setNome(nome);
	}
	
	public void som() {
		System.out.println("Eu gosto de latir");
	}
	
	public void oQuegostoDeFazer() {
		System.out.println("Gosto de morder os carteiros");
	}

}
