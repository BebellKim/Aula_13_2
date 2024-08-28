package Aula_13;

public class Tigre extends Animais {
	
	@Override
	public void Dormir() {
		System.out.println("Dormindo;");
	}
	@Override
	public void Caminhar() {
		System.out.println("Caminhado;");
	}
	@Override
	public void Correr() {
		System.out.println("Correndo;");
	}
	@Override
	public void EmitirSom() {
		System.out.println("Ronrona!");
	}

}
