
public class Gerente extends Funcionario{
Funcionario funcionario = new Funcionario();

	//Instancia o objeto funcionario, assim o gerente
	//vai herdar os atributos dessa classe
	
	private String tarefaExtra;
	//tarefa extra é o único atributo não herdado
	//por isso ele terá o get para resgatar valores
	//set para atribuir valores
	public String getTarefaExtra
	public String getTarefaExtra() {
		return tarefaExtra;
	}
	public void setTarefaExtra(String tarefaExtra) {
		this.tarefaExtra = tarefaExtra;
	}	
	//método que da classe funcionario obtem o método set
	//para atribuir os valores 
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
