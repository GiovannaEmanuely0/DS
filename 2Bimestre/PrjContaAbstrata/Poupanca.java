
public class Poupanca extends Conta{
	
	public Poupanca() {}
	
	private double valor;
	private String pix;
	private String senha;
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getPix() {
		return pix;
	}
	public void setPix(String pix) {
		this.pix = pix;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public void guardarDinheiro() {
		System.out.println("Deposite o valor para guardar na poupança");
		setValor(read.nextDouble());
		System.out.println("Insira a senha:");
		setSenha(read.next());
		System.out.println("Poupança realizada com sucesso!");
	}
	
	@Override
	public void pagarContas() {}

}
