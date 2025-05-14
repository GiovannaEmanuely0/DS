import java.util.Scanner;
public class Enfermaria {
	
	public Enfermaria() {
		
	}
	Scanner read = new Scanner(System.in);
	
	Funcionario func = new Funcionario();
	
	public void cadastrarFunc() {
		System.out.println("Insira o nome:");
		func.setNome(read.nextLine());
		System.out.println("Insira a idade:");
		func.setIdade(read.nextInt());
		System.out.println("Insira o CPF:");
		func.setCpf(read.next());
		System.out.println("Insira a data de nascimento:");
		func.setDataNasc(read.nextLine());
		System.out.println("Insira o cargo:");
		func.setCargo(read.nextLine());
		System.out.println("Insira o salário:");
		func.setSalario(read.nextDouble());
		
		System.out.println(" ");
	}
	
	public void apresentarInfo() {
		func.apresentarInfo();
	}
}
