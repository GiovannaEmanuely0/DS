
public class Carro {
	public String modelo;
	Motor mo;
	
	Carro(String modelo, int potenciaMotor){
		this.modelo = modelo;
		this.mo = new Motor(potenciaMotor);
	}
	
	public void mostrarDetalhes() {
		System.out.println("Carro: "+modelo);
		mo.mostrarPotencia();
	}
}
