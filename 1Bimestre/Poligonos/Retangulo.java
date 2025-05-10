
public class Retangulo extends Poligonos{
	//Construtor
		public Retangulo() {}
		//Instanciação do objeto da herança
		Poligonos poli = new Poligonos();
		
		public String objeto = "Área do retângulo: ";
		//Sobrescrita do método calcularArea
		public void calcularArea() {
			
			System.out.println("Digite a altura: ");
			poli.setAltura(bia.nextDouble());
			System.out.println("Digite a base: ");
			poli.setBase(bia.nextDouble());
			
			if(poli.getBase() == poli.getAltura()) {
				System.out.println("Não é retângulo, digite novamente por favor");
			} else {
				poli.calcularArea();
				System.out.println(objeto+" é: "+poli.getArea());
			}
			
		}
}
