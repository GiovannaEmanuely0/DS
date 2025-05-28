import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		int escolha;
		Scanner read = new Scanner(System.in);
		System.out.println("Cadastro de Conta: ");
		System.out.println("1 para Conta Corrente");
		System.out.println("2 para Conta Poupan�a");
		System.out.println("3 ou + para Conta Digital");
		escolha = read.nextInt();
		
		if(escolha == 1) {
			
			for(int i = 0;i<2;i++) {
				System.out.println("Conta Corrente! Cliente "+(i+1));
				Corrente co = new Corrente();
				
				co.cadastrarCliente();
				co.mostrarDadosClientes();
				
				System.out.println("Deseja realizar transa��es banc�rias?");
				int tra;
				tra = read.nextInt();
				
				if(tra == 1) {
					co.pagarContas();
				}
			}
		}else if(escolha > 1 && escolha <3){
			for(int i = 0;i<2;i++) {
				System.out.println("Conta Poupan�a! Cliente "+(i+1));
				Poupanca po = new Poupanca();
				
				po.cadastrarCliente();
				po.mostrarDadosClientes();
				
				System.out.println("Deseja realizar uma Poupan�a?");
				int tra;
				tra = read.nextInt();
				
				if(tra == 1) {
					po.guardarDinheiro();
				}
			}
		}else {
			for(int i = 0;i<2;i++) {
				System.out.println("Conta Digital! Cliente "+(i+1));
				Digital di = new Digital();
				
				di.cadastrarCliente();
				di.mostrarDadosClientes();
				
				System.out.println("Deseja realizar uma transa��o(1) ou Poupan�a?(2)");
				int tra;
				tra = read.nextInt();
				
				if(tra == 1) {
					di.pagarContas();
				}else {
					di.guardarDinheiro();
				}
			}
			
		}
		
		read.close();
	}

}
