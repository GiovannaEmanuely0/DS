
public abstract class Poligonos {
	
	private double base;
	private double altura;
	private double area;
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//fim, instancias, gets e sets
	
	// método abstrato
	public abstract void calcularArea();
}
