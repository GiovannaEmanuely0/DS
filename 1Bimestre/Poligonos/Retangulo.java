
public class Retangulo extends Poligonos{
	//Construtor
		public Retangulo() {}
		//Instancia��o do objeto da heran�a
		Poligonos poli = new Poligonos();
		
		public String objeto = "�rea do ret�ngulo: ";
		//Sobrescrita do m�todo calcularArea
		public void calcularArea() {
			
			System.out.println("Digite a altura: ");
			poli.setAltura(bia.nextDouble());
			System.out.println("Digite a base: ");
			poli.setBase(bia.nextDouble());
			
			if(poli.getBase() == poli.getAltura()) {
				System.out.println("N�o � ret�ngulo, digite novamente por favor");
			} else {
				poli.calcularArea();
				System.out.println(objeto+" �: "+poli.getArea());
			}
			
		}
}
