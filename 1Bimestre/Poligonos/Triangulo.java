
public class Triangulo extends Poligonos {
	//Construtor
			public Triangulo() {}
			//Instancia��o do objeto da heran�a
			Poligonos poli = new Poligonos();
			
			public String objeto = "�rea do tri�ngulo";
			//Sobrescrita do m�todo calcularArea
			public void calcularArea() {
				
				System.out.println("Digite a altura: ");
				poli.setAltura(bia.nextDouble());
				System.out.println("Digite a base: ");
				poli.setBase(bia.nextDouble());
				
				poli.calcularArea();
				System.out.println(objeto+" �: "+(poli.getArea()/2));
			}
}
