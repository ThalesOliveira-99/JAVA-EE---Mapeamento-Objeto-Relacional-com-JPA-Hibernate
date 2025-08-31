package aplicação;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
	
		Pessoa p1 = new Pessoa(1, "Thales Oliveira", "thales@email.com");
		Pessoa p2 = new Pessoa(2, "Tatiane Oliveira", "tatiane@email.com");
		Pessoa p3 = new Pessoa(3, "William Custodio", "william@email.com");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
