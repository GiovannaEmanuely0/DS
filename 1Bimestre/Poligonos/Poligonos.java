import java.util.*;
public class Poligonos {
Scanner bia = new Scanner(System.in);
	
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

	public void calcularArea() {
		area = base*altura;
		//System.out.println("Área dos polígonos");
	}
}
