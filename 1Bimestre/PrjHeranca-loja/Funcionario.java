import java.util.Scanner;
public class Funcionario {
Scanner gica = new Scanner(System.in);
	
	private String nome;
	private double salario;
	private String email;
	private String cpf;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void listarDados() {
		System.out.println("Nome: "+getNome());
		System.out.println("Salário: "+getSalario());
		System.out.println("Email: "+getEmail());
		System.out.println("CPF: "+getCpf());
	}
}
