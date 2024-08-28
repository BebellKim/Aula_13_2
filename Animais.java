package Aula_13;

public abstract class Animais {
	
	String Nome;
	String Sexo;
	String Raca;
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String Sexo) {
		this.Sexo = Sexo;
	}
	public String getRaca() {
		return Raca;
	}
	public void setRaca(String Raca) {
		this.Raca = Raca;
	}
	
	 public abstract void Dormir ();
	 public abstract void Caminhar ();
	 public abstract void Correr ();
	 public abstract void EmitirSom ();
	 
	

}
