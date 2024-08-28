package Aula_13;

public class Principal_Animais {

	public static void main(String[] args) {

		Lobo Lobo = new Lobo ();
		Leao Leaozinho = new Leao ();
		Tigre Tigre = new Tigre ();
		Cachorro Max = new Cachorro ();
		Gato Mia = new Gato();

		// lobo 

		System.out.println("       Lobo         ");

		Lobo.setNome("Lobinho");
		Lobo.setSexo("Macho");
		Lobo.setRaca("Husky_siberiano");


		System.out.println(Lobo.getNome());
		System.out.println(Lobo.getSexo());
		System.out.println(Lobo.getRaca());

		System.out.println("       Ações        ");

		Lobo.Dormir();
		Lobo.Caminhar();
		Lobo.Correr();
		Lobo.EmitirSom();

		// leão

		System.out.println("       Leão         ");

		Leaozinho.setNome("Leaozinho");
		Leaozinho.setSexo("Macho");
		Leaozinho.setRaca("Leão Selvagem");


		System.out.println(Leaozinho.getNome());
		System.out.println(Leaozinho.getSexo());
		System.out.println(Leaozinho.getRaca());

		System.out.println("       Ações        ");
		Leaozinho.Dormir();
		Leaozinho.Caminhar();
		Leaozinho.Correr();
		Leaozinho.EmitirSom();


		//tigre

		System.out.println("       Tigre         ");

		Tigre.setNome("Tigre");
		Tigre.setSexo("Macho");
		Tigre.setRaca("Tigre Selvagem");

		System.out.println(Tigre.getNome());
		System.out.println(Tigre.getSexo());
		System.out.println(Tigre.getRaca());

		System.out.println("       Ações        ");

		Tigre.Dormir();
		Tigre.Caminhar();
		Tigre.Correr();
		Tigre.EmitirSom();

		//Cachorro

		System.out.println("       Cachorro        ");

		Max.setNome("Max");
		Max.setSexo("Macho");
		Max.setRaca("Shtizu");

		System.out.println(Max.getNome());
		System.out.println(Max.getSexo());
		System.out.println(Max.getRaca());

		System.out.println("       Ações        ");

		Max.Dormir();
		Max.Caminhar();
		Max.Correr();
		Max.EmitirSom();

		//Gato

		System.out.println("       Gato        ");

		Mia.setNome("Mia");
		Mia.setSexo("Macho");
		Mia.setRaca("Shtizu");


		System.out.println(Mia.getNome());
		System.out.println(Mia.getSexo());
		System.out.println(Mia.getRaca());


		System.out.println("       Ações        ");

		Mia.Dormir();
		Mia.Caminhar();
		Mia.Correr();
		Mia.EmitirSom();




	}

}
