package br.fai.colection4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main app = new Main();
		app.start();
		

	}

	private void start() {
		// TODO Auto-generated method stub
		
		Cachorro primeiroCachorro = new Cachorro ("Juca"); 
		Cachorro segundoCachorro = new Cachorro ("João");
		primeiroCachorro.setCor("azul");
		
		Gato primeiroGato = new Gato();
		primeiroGato.setNome("yury");
		
		Gato segundoGato = new Gato("vermelho");
		segundoGato.setNome("Venus");
		
		List<Animal> listaDeAnimais = new ArrayList<Animal>();
		listaDeAnimais.add(primeiroCachorro);
		listaDeAnimais.add(segundoCachorro);
		listaDeAnimais.add(primeiroGato);
		listaDeAnimais.add(segundoGato);
		
        for(Animal animal: listaDeAnimais) {
			
		if(animal instanceof Cachorro) {
			Cachorro c = (Cachorro) animal;
			c.oQuegostoDeFazer();
			}else if(animal instanceof Gato) {
				Gato g = (Gato) animal;
				g.oQueFacoDuranteANoite();
			}
        }
	
	}

}