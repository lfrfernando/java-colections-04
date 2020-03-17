package br.fai.colection4;

public abstract class Animal {
	
	private String cor = "preto";
	private int idade = 5;
	private String nome  = "não definido";
	
	public void som() {
		System.out.println("Este é o som padrão de um animal: zzz");
	}
	
	public void dizerMeuNome() {
		System.out.println("nome do animal é: xxx");
	}
	
	public void dizerMinhaIdade() {
		System.out.println("Minha idade é: ");
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
    
}
