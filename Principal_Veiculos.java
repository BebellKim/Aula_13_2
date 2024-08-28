package Aula_13;

public class Principal_Veiculos {

	public static void main(String[] args) {
		
		Carro Car = new Carro ();
		Onibus Bus = new Onibus ();
		
		System.out.println("       CAR           ");
		Car.acelerar();
		Car.frear();
		Car.virar();
		Car.ligar();
		
		System.out.println("       BUS           ");
		Bus.acelerar();
		Bus.frear();
		Bus.virar();
		Bus.ligar();
		
		
		

	}

}
