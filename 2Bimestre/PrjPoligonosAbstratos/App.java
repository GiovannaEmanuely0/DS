import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcular �rea dos pol�gonos!");
		System.out.println("Escolha o pol�gono: ");
		System.out.println("1 para o quadrado;");
		System.out.println("2 para o ret�ngulo;");
		System.out.println("3 para o tri�ngulo.");
		int chose;
		chose = sc.nextInt();

		if(chose==1) {
			Quadrado qua = new Quadrado();
			qua.calcularArea();
		} else if(chose==2) {
			Retangulo ret = new Retangulo();
			ret.calcularArea();
		} else {
			Triangulo tri = new Triangulo();
			tri.calcularArea();
		}
		
		sc.close();
	}
}
