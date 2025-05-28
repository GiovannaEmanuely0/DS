import java.util.Scanner;
public abstract class Conta {
	
	Scanner read = new Scanner(System.in);
	
	private String fNome;
	private String lNome;
	private String dataNascimento;
	private String documentoIdentificacao;
	private String cpf;
	private String comprovanteEndereco;
	private String comprovanteRenda;
	
	public String getfNome() {
		return fNome;
	}
	public void setfNome(String fNome) {
		this.fNome = fNome;
	}
	public String getlNome() {
		return lNome;
	}
	public void setlNome(String lNome) {
		this.lNome = lNome;
	}
	public String getDocumentoIdentificacao() {
		return documentoIdentificacao;
	}
	public void setDocumentoIdentificacao(String documentoIdentificacao) {
		this.documentoIdentificacao = documentoIdentificacao;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getComprovanteEndereco() {
		return comprovanteEndereco;
	}
	public void setComprovanteEndereco(String comprovanteEndereco) {
		this.comprovanteEndereco = comprovanteEndereco;
	}
	public String getComprovanteRenda() {
		return comprovanteRenda;
	}
	public void setComprovanteRenda(String comprovanteRenda) {
		this.comprovanteRenda = comprovanteRenda;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	//End of getters and setters
	
	public void cadastrarCliente() {
		System.out.println("Primeiro nome:");
		setfNome(read.nextLine());
		System.out.println("Sobrenome:");
		setlNome(read.nextLine());
		System.out.println("Cpf:");
		setCpf(read.nextLine());
		System.out.println("Data de Nascimento:");
		setDataNascimento(read.nextLine());
		System.out.println("Documento de identificação (RG, CNH, RNE):");
		setDocumentoIdentificacao(read.nextLine());
		System.out.println("Comprovante de Endereço:");
		setComprovanteEndereco(read.nextLine());
		System.out.println("Comprovante de Renda:");
		setComprovanteRenda(read.nextLine());		
	}
	
	public void mostrarDadosClientes() {
		System.out.print("Nome: "+getfNome());
		System.out.println(" "+getlNome());
		System.out.println("CPF: "+getCpf());
		System.out.println("Data de Nascimento: "+getDataNascimento());
		System.out.println("Identificação: "+getDocumentoIdentificacao());
	}
	//Metod abstract
	public abstract void pagarContas();
	public abstract void guardarDinheiro();	
}
