
public class Corrente extends Conta {

	private double valor;
	private String numPix;
	
	public String getNumPix() {
		return numPix;
	}
	public void setNumPix(String pix) {
		this.numPix = pix;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public void pagarContas() {
		System.out.println("Valor da transação: ");
		setValor(read.nextDouble());
		System.out.println("Endereço da transação: ");
		setNumPix(read.next());
		
		System.out.printf("Confirmar transição de R$ %.2f",valor);
		System.out.println(" Transição aceita!");
		
		System.out.println("Transição para "+getNumPix());
		System.out.printf("Valor R$ %.2f", valor);
	}
	
	@Override
	public void guardarDinheiro() {}
	
	
}
