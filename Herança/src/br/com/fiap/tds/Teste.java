package br.com.fiap.tds;

//Test about heritage animals

public class Teste {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.setAlimenta("Todo animal se alimenta");
		animal.setLocomove("todo animal se locomove");
		
		Cachorro cachorro = new Cachorro();
		cachorro.setAlimenta("Cachorro come ração de cachorro");
		cachorro.setLocomove("Cachorro usa 4 patas");
		cachorro.setLatido("Cachorro faz Au Au");
		
		Animal poodle = new Cachorro();
		poodle.setAlimenta("Poodle come ração de cachorro");
		poodle.setLocomove("Poodle usa 4 patas");
	}
}
