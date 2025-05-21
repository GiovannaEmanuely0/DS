import java.util.Scanner;

public class Triangulo extends Poligonos {

	Scanner read = new Scanner(System.in);
	
	@Override
	public void calcularArea() {
		System.out.println("Digite a base do triângulo: ");
		setBase(read.nextDouble());
		System.out.println("Digite a altura do triângulo: ");
		setAltura(read.nextDouble());
		
		setArea(getBase()*getAltura());
		
		System.out.println("Área do triângulo: "+getArea()/2);
		
	}

}
