
public class Funcionario extends Pessoa{
	
	private String cargo;
	private double salario;
	
	public void Funcionario() {}

	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void apresentarInfo() {
		super.apresentarInfo();
		System.out.println("Cargo: "+getCargo());
		System.out.printf("Salario: R$ %.2f%n",getSalario());
	}
	
}
