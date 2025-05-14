
public class Pessoa {
	
	private String nome;
	private String cpf;
	private int idade;
	private String dataNasc;
	
	public Pessoa() {}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public void apresentarInfo() {
		System.out.println("Funcionario: "+getNome());
		System.out.println("Idade: "+getIdade()+" anos");
		System.out.println("Data de Nascimento: "+getDataNasc());
		System.out.println("CPF: "+getCpf());
	}
	
}
