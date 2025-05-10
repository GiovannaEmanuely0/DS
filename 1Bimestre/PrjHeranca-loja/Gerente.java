
public class Gerente extends Funcionario{
Funcionario funcionario = new Funcionario();
	
	private String tarefaExtra;

	public String getTarefaExtra() {
		return tarefaExtra;
	}
	public void setTarefaExtra(String tarefaExtra) {
		this.tarefaExtra = tarefaExtra;
	}	
	
	public void lerDados() {
		System.out.println("Digite o seu nome: ");
		funcionario.setNome(gica.next());
		System.out.println("Digite o seu e-mail: ");
		funcionario.setEmail(gica.next());
		System.out.println("Digite o seu cpf: ");
		funcionario.setCpf(gica.next());
		System.out.println("Digite o seu salário: ");
		funcionario.setSalario(gica.nextDouble());
		System.out.println("Digite a sua tarefa extra: ");
		setTarefaExtra(gica.next());
	}
	
	public void listarDados() {
		funcionario.listarDados();
		System.out.println("Tarefa extra: "+getTarefaExtra());
	}
	
}
