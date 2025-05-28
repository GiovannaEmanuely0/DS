
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
		System.out.println("Valor da transa��o: ");
		setValor(read.nextDouble());
		System.out.println("Endere�o da transa��o: ");
		setNumPix(read.next());
		
		System.out.printf("Confirmar transi��o de R$ %.2f",valor);
		System.out.println(" Transi��o aceita!");
		
		System.out.println("Transi��o para "+getNumPix());
		System.out.printf("Valor R$ %.2f", valor);
	}
	
	@Override
	public void guardarDinheiro() {}
	
	
}
