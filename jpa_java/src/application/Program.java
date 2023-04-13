package application;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(1, "Bob", "bob@gmail.com");
		Pessoa pessoa2 = new Pessoa(2, "Eddie", "ed@gmail.com");
		Pessoa pessoa3 = new Pessoa(3, "jack", "jack@gmail.com");
		Pessoa pessoa4 = new Pessoa(4, "João", "joao@gmail.com");
		Pessoa pessoa5 = new Pessoa(5, "Joane", "jo@gmail.com");

		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(pessoa3);
		System.out.println(pessoa4);
		System.out.println(pessoa5);

	}

}
