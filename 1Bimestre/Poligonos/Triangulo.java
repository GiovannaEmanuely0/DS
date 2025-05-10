
public class Triangulo extends Poligonos {
	//Construtor
			public Triangulo() {}
			//Instanciação do objeto da herança
			Poligonos poli = new Poligonos();
			
			public String objeto = "Área do triângulo";
			//Sobrescrita do método calcularArea
			public void calcularArea() {
				
				System.out.println("Digite a altura: ");
				poli.setAltura(bia.nextDouble());
				System.out.println("Digite a base: ");
				poli.setBase(bia.nextDouble());
				
				poli.calcularArea();
				System.out.println(objeto+" é: "+(poli.getArea()/2));
			}
}
