
public class Assistente extends Funcionario{
Funcionario funcionario = new Funcionario();
	
	public void lerDados() {
		System.out.println("Digite o seu nome: ");
		funcionario.setNome(gica.nextLine());
		System.out.println("Digite o seu e-mail: ");
		funcionario.setEmail(gica.next());
		System.out.println("Digite o seu cpf: ");
		funcionario.setCpf(gica.next());
		System.out.println("Digite o seu salário: ");
		funcionario.setSalario(gica.nextDouble());
	}
	
	public void listarDados() {
		funcionario.listarDados();
	}
}
