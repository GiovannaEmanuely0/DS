import java.util.Scanner;

public class Retangulo extends Poligonos {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		@Override
		public void calcularArea() {
			System.out.println("Digite a base do ret�ngulo: ");
			setBase(read.nextDouble());
			System.out.println("Digite a altura do ret�ngulo: ");
			setAltura(read.nextDouble());
			
			setArea(getBase()*getAltura());
			
			System.out.println("�rea do ret�ngulo: "+getArea());
			
		}

}
