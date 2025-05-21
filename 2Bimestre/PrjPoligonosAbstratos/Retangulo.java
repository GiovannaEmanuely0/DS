import java.util.Scanner;

public class Retangulo extends Poligonos {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		@Override
		public void calcularArea() {
			System.out.println("Digite a base do retângulo: ");
			setBase(read.nextDouble());
			System.out.println("Digite a altura do retângulo: ");
			setAltura(read.nextDouble());
			
			setArea(getBase()*getAltura());
			
			System.out.println("Área do retângulo: "+getArea());
			
		}

}
