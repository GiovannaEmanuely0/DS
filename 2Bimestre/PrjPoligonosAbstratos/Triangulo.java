import java.util.Scanner;

public class Triangulo extends Poligonos {

	Scanner read = new Scanner(System.in);
	
	@Override
	public void calcularArea() {
		System.out.println("Digite a base do tri�ngulo: ");
		setBase(read.nextDouble());
		System.out.println("Digite a altura do tri�ngulo: ");
		setAltura(read.nextDouble());
		
		setArea(getBase()*getAltura());
		
		System.out.println("�rea do tri�ngulo: "+getArea()/2);
		
	}

}
