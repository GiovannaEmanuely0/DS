import java.util.Scanner;
public class Quadrado extends Poligonos {
	public Quadrado() {}
	Scanner read = new Scanner(System.in);
	
	@Override
	public void calcularArea() {
		System.out.println("Digite a base do quadrado: ");
		setBase(read.nextDouble());
		
		setArea(getBase()*getBase());
		
		System.out.println("Área do quadrado: "+getArea());
		
	}
	
	

}
